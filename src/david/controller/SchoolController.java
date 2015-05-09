/**
 * @author David Diaz
 * @date 09-05-2015
 * Controlador para las acciones de school
 */
package david.controller;


public class SchoolController extends Controller{
	
	/**
	 * Costructor por defecto
	 */
	public SchoolController() {
		
	}
	
	/**
	 * Método que crea un usuario
	 */
	public void createAction() {
		if(isLogin()){
			render("school/create");
		}
	}

}
