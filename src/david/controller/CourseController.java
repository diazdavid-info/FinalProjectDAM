/**
 * Controlador para las acciones de course
 * @author David Diaz
 * @date 09-05-2015
 */
package david.controller;

public class CourseController extends Controller{
	
	/**
	 * Método que crea un curso
	 */
	public void createAction() {
		if(isLogin()){
			
		}
		render("course/create");
	}

	
}
