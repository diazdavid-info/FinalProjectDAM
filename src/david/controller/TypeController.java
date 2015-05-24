/**
 * Controlador para las acciones de type
 * @author David Diaz
 * @date 24-05-2015
 */
package david.controller;

import david.model.factory.ModelFactory;
import david.model.models.DTypeModel;


public class TypeController extends Controller{
	
	/**
	 * Atributo que almacena el model de cursos
	 */
	private DTypeModel mTypeModel;
	
	/**
	 * Constructor
	 */
	public TypeController() {
		mTypeModel = ModelFactory.createTypeModel();
	}
	
	/**
	 * Método que crea un tipo
	 */
	public void createAction() {
		if(isLogin() && isRequest()) {
			mTypeModel.createType(getRequestParameter());
		}
		
		if(isLogin()){
			render("type/create");
		}
		
		
	}

}
