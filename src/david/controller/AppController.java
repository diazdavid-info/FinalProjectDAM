/**
 * Controlador para las acciones principales de la aplicación
 * @author David Díaz García
 * @date 1-05-2015
 */
package david.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import david.model.pojo.users.User;

public class AppController extends Controller{

	/**
	 * Método que renderiza la página principal de la app
	 */
	public void indexAction(){
		HttpSession session = mServletRequest.getSession();
		User user = (User) session.getAttribute("user");
		if(user == null){
			try {
				mServletResponse.sendRedirect("user");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("APP CONTROLLER "+user.getId());
			render("app/start");
		}
	}
}
