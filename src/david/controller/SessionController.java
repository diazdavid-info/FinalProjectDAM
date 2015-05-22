/**
 * Controlador para las acciones de session
 * @author David Diaz
 * @date 20-05-2015
 */
package david.controller;

import java.util.List;

import david.model.factory.ModelFactory;
import david.model.models.DCourseModel;
import david.model.pojo.school.Course;


public class SessionController extends Controller{

	/**
	 * Atributo que almacena el model de cursos
	 */
	private DCourseModel mCourseModel;
	
	/**
	 * Constructor
	 */
	public SessionController() {
		mCourseModel = ModelFactory.createCourseModel();
	}
	
	/**
	 * Método que crea una sessión
	 */
	public void createAction() {
		if(isLogin()){
			List<Course> listCourses = mCourseModel.listCourse();
			
			mServletRequest.setAttribute("listCourses", listCourses);
			render("session/create");
		}
	}
	
}
