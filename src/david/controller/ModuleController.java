/**
 * Controlador para las acciones de module
 * @author David Diaz
 * @date 18-05-2015
 */
package david.controller;

import java.util.List;

import david.model.factory.ModelFactory;
import david.model.models.DCourseModel;
import david.model.models.DModuleModel;
import david.model.models.DUserModel;
import david.model.pojo.school.Course;
import david.model.pojo.users.User;


public class ModuleController extends Controller{
	
	/**
	 * Atributo que almacena el model de cursos
	 */
	private DCourseModel mCourseModel;
	/**
	 * Atributo que almacena el model de usuarios
	 */
	private DUserModel mUserModel;
	/**
	 * Atributo que almacena el model de modulos
	 */
	private DModuleModel mModuleModel;
	
	/**
	 * Constructor
	 */
	public ModuleController() {
		mCourseModel = ModelFactory.createCourseModel();
		mUserModel = ModelFactory.createUserModel();
		mModuleModel = ModelFactory.createModuleModel();
	}
	
	/**
	 * Método que crea un modulo
	 */
	public void createAction() {
		if(isLogin() && isRequest()){
			mModuleModel.createModule(getRequestParameter());
		}
		
		if(isLogin()){
			List<User> listTutors = mUserModel.listTutors();
			List<Course> listCourses = mCourseModel.listCourse();
			
			mServletRequest.setAttribute("listTutors", listTutors);
			mServletRequest.setAttribute("listCourses", listCourses);
			render("module/create");
		}
	}

}
