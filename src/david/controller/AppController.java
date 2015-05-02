/**
 * Controlador para las acciones principales de la aplicación
 * @author David Díaz García
 * @date 1-05-2015
 */
package david.controller;


public class AppController extends Controller{

	/**
	 * Método que renderiza la página principal de la app
	 */
	public void indexAction(){
		if(isLogin()){
			render("app/start");
		}
	}
}
