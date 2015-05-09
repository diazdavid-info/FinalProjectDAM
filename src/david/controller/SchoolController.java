/**
 * @author David Diaz
 * @date 09-05-2015
 * Controlador para las acciones de school
 */
package david.controller;

import java.util.List;

import david.model.factory.ModelFactory;
import david.model.models.DSchoolModel;
import david.model.pojo.school.School;



public class SchoolController extends Controller{
	
	/**
	 * Atributo que almacena el model
	 */
	private DSchoolModel mModel;
	
	/**
	 * Costructor por defecto
	 */
	public SchoolController() {
		mModel = ModelFactory.createSchoolModel();
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
	 * Método que crea un usuario
	 */
	public void createAction() {
		if(isLogin() && isRequest()){
			mModel.createSchool(getRequestParameter());
		}
		render("school/create");
	}

}
