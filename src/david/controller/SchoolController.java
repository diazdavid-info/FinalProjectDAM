/**
 * Controlador para las acciones de school
 * @author David Diaz
 * @date 09-05-2015
 */
package david.controller;

import java.util.List;

import david.model.factory.ModelFactory;
import david.model.models.DCourseModel;
import david.model.models.DCourseSchoolModel;
import david.model.models.DSchoolModel;
import david.model.pojo.school.Course;
import david.model.pojo.school.School;



public class SchoolController extends Controller{
	
	/**
	 * Atributo que almacena el model
	 */
	private DSchoolModel mModel;
	/**
	 * Atributo que almacena el modelo de Course
	 */
	private DCourseModel mCourseModel;
	/**
	 * Atributo que almacena el modelo de CourseSchool
	 */
	private DCourseSchoolModel mCourseSchoolModel;
	
	/**
	 * Costructor por defecto
	 */
	public SchoolController() {
		mModel = ModelFactory.createSchoolModel();
		mCourseModel = ModelFactory.createCourseModel();
		mCourseSchoolModel = ModelFactory.createCourseSchoolModel();
	}
	
	/**
	 * Método que lista todos los institutos
	 */
	public void listAction() {
		if(isLogin()){
			List<School> listSchool = mModel.listSchool();
			mServletRequest.setAttribute("listSchool", listSchool);
			render("school/list");
		}
	}
	
	/**
	 * Método que crea un instituto
	 */
	public void createAction() {
		if(isLogin() && isRequest()){
			mModel.createSchool(getRequestParameter());
		}
		render("school/create");
	}
	
	/**
	 * Método que añade un curso a uno o varios institutos
	 */
	public void addCourseAction(){
		if(isLogin()){
			List<School> listSchool = mModel.listSchool();
			List<Course> listCourse = mCourseModel.listCourse();
			
			mServletRequest.setAttribute("listSchool", listSchool);
			mServletRequest.setAttribute("listCourse", listCourse);
		}
		
		if(isLogin() && isRequest()){
			mCourseSchoolModel.createCourseSchools(getRequestParameter());
		}
		render("school/addCourse");
	}

}
