/**
 * Controlador para las acciones de subtype
 * @author David Diaz
 * @date 24-05-2015
 */
package david.controller;

import david.model.factory.ModelFactory;
import david.model.models.DSubtypeModel;

public class SubtypeController extends Controller{
	
	/**
	 * Atributo que almacena el model de cursos
	 */
	private DSubtypeModel mSubtypeModel;
	
	/**
	 * Constructor
	 */
	public SubtypeController() {
		mSubtypeModel = ModelFactory.createSubtypeModel();
	}
	
	/**
	 * Método que crea un tipo
	 */
	public void createAction() {
		if(isLogin() && isRequest()) {
			mSubtypeModel.createSubtype(getRequestParameter());
		}
		
		if(isLogin()){
			render("subtype/create");
		}
		
		
	}

}
