/**
 * Controlador para las acciones de course
 * @author David Diaz
 * @date 09-05-2015
 */
package david.controller;

import java.util.List;

import david.model.factory.ModelFactory;
import david.model.models.DCourseModel;
import david.model.pojo.school.Course;

public class CourseController extends Controller{
	
	/**
	 * Atributo que almacena el model
	 */
	private DCourseModel mModel;
	
	/**
	 * Costructor por defecto
	 */
	public CourseController() {
		mModel = ModelFactory.createCourseModel();
	}
	
	/**
	 * Método que lista todos los cursos
	 */
	public void listAction() {
		if(isLogin()){
			List<Course> listCourse = mModel.listCourse();
			mServletRequest.setAttribute("listCourse", listCourse);
			render("course/list");
		}
	}
	
	/**
	 * Método que crea un curso
	 */
	public void createAction() {
		if(isLogin() && isRequest()){
			mModel.createCourse(getRequestParameter());
		}
		render("course/create");
	}

	
}
