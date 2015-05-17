/**
 * Controlador para las acciones de cycle
 * @author David Diaz
 * @date 15-05-2015
 */
package david.controller;

import java.util.List;

import david.model.factory.ModelFactory;
import david.model.models.DCourseModel;
import david.model.models.DCycleModel;
import david.model.models.DUserModel;
import david.model.pojo.school.Course;
import david.model.pojo.school.Cycle;
import david.model.pojo.users.User;

public class CycleController extends Controller{
	
	/**
	 * Atributo que almacena el model de cursos
	 */
	private DCourseModel mCourseModel;
	/**
	 * Atributo que almacena el model de usuarios
	 */
	private DUserModel mUserModel;
	/**
	 * Atributo que almacena el model de ciclos
	 */
	private DCycleModel mCycleModel;
	
	/**
	 * Constructor
	 */
	public CycleController() {
		mCourseModel = ModelFactory.createCourseModel();
		mUserModel = ModelFactory.createUserModel();
		mCycleModel = ModelFactory.createCycleModel();
	}
	
	/**
	 * Método que crea un ciclo
	 */
	public void createAction() {
		if(isLogin() && isRequest()){
			mCycleModel.createCycle(getRequestParameter());
		}
		
		if(isLogin()){
			List<User> listTutors = mUserModel.listTutors();
			List<Course> listCourses = mCourseModel.listCourse();
			
			mServletRequest.setAttribute("listTutors", listTutors);
			mServletRequest.setAttribute("listCourses", listCourses);
			render("cycle/create");
		}
	}
	
	/**
	 * Método que lista los ciclos
	 */
	public void listAction() {
		if(isLogin()){
			List<Cycle> listCycles = mCycleModel.listCycles();
			
			mServletRequest.setAttribute("listCycles", listCycles);
			render("cycle/list");
		}
	}

}
