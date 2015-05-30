/**
 * Controlador para las acciones principales de la aplicación
 * @author David Díaz García
 * @date 1-05-2015
 */
package david.controller;

import javax.servlet.http.HttpSession;

public class AppController extends Controller {

	/**
	 * Método que renderiza la página principal de la app
	 */
	public void indexAction() {
		if (isLogin()) {
			render("app/start");
		}
	}

	/**
	 * Método que hace el logout
	 */
	public void logoutAction() {
		if (isLogin()) {
			HttpSession session = mServletRequest.getSession(false);
			session.invalidate();
			redirect(mServletRequest.getContextPath() + "/user");
		}
	}
}
