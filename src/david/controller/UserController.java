/**
 * @author David Diaz
 * @date 12-04-2015
 * Controlador para las acciones de user
 */
package david.controller;


public class UserController extends Controller{

	/**
	 * Método que gestiona la acción index
	 */
	public void indexAction() {
		render("result.jsp");
	}	
}
