/**
 * Controlador para las acciones de session
 * @author David Diaz
 * @date 20-05-2015
 */
package david.controller;

import java.util.List;

import david.model.factory.ModelFactory;
import david.model.models.DCourseModel;
import david.model.models.DSessionModel;
import david.model.models.DSubtypeModel;
import david.model.models.DTypeModel;
import david.model.pojo.school.Course;
import david.model.pojo.school.SubType;
import david.model.pojo.school.Type;


public class SessionController extends Controller{

	/**
	 * Atributo que almacena el model de cursos
	 */
	private DCourseModel mCourseModel;
	/**
	 * Atributo que almacena el model de tipos
	 */
	private DTypeModel mTypeModel;
	/**
	 * Atributo que almacena el model de subtipo
	 */
	private DSubtypeModel mSubtypeModel;
	/**
	 * Atributo que almacena el model de session
	 */
	private DSessionModel mSessionModel;
	
	/**
	 * Constructor
	 */
	public SessionController() {
		mCourseModel = ModelFactory.createCourseModel();
		mTypeModel = ModelFactory.createTypeModel();
		mSubtypeModel = ModelFactory.createSubtypeModel();
		mSessionModel = ModelFactory.createSessionModel();
	}
	
	/**
	 * Método que crea una sessión
	 */
	public void createAction() {
		if(isLogin() && isRequest()){
			mSessionModel.createSession(getRequestParameter());
		}
		
		if(isLogin()){
			List<Course> listCourses = mCourseModel.listCourse();
			List<Type> listType = mTypeModel.listType();
			List<SubType> listSubtype = mSubtypeModel.listSubtype();
			
			mServletRequest.setAttribute("listCourses", listCourses);
			mServletRequest.setAttribute("listType", listType);
			mServletRequest.setAttribute("listSubtype", listSubtype);
			render("session/create");
		}
	}
	
}
