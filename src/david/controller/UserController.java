/**
 * @author David Diaz
 * @date 12-04-2015
 * Controlador para las acciones de user
 */
package david.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import david.model.factory.ModelFactory;
import david.model.models.DUserModel;
import david.model.pojo.users.User;

public class UserController extends Controller {

	/**
	 * Atributo que almacena el model
	 */
	private DUserModel mModel;

	/**
	 * Costructor por defecto
	 */
	public UserController() {
		mModel = ModelFactory.createUserModel();
	}

	/**
	 * Método que gestiona la acción index
	 */
	public void indexAction() {
		User user = null;
		if (isRequest()) {
			user = mModel.loginUser(getRequestParameter());
		}

		if (user != null) {
			HttpSession session = mServletRequest.getSession(true);
			session.setAttribute("user", user);
			redirect("app");
		}

		if (user == null) {
			render("user/login");
		}
	}

	/**
	 * Método que lista todos los usuarios
	 */
	public void listAction() {
		if (isLogin()) {
			List<User> listUser = mModel.listUser();
			mServletRequest.setAttribute("listUser", listUser);
			render("user/list");
		}
	}

	/**
	 * Método que crea un usuario
	 */
	public void createAction() {
		if (isLogin() && isRequest()) {
			mModel.createUser(getRequestParameter());
		}

		if (isLogin()) {
			render("user/create");
		}
	}
}
