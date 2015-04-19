/**
 * @author David Diaz
 * @date 12-04-2015
 * Controlador para las acciones de user
 */
package david.controller;

import david.model.factory.ModelFactory;
import david.model.models.DUserModel;


public class UserController extends Controller{
	
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
		if(isRequest()){
			mModel.loginUser(getRequestParameter());
			System.out.println("SI");
		}
		render("user/login");
	}	
}
