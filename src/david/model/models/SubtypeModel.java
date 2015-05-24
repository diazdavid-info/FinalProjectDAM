/**
 * Modelo para todo lo relacionado con un subtype
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.Map;

import david.model.validate.form.IWebCreateSubtype;
import david.model.validate.form.SubtypeCreateForm;

public class SubtypeModel implements DSubtypeModel {
	
	/**
	 * Método que gestiona la creación de un subtipo de sesión
	 * @param Map<String, String[]> parameter
	 */
	public void createSubtype(Map<String, String[]> parameter){
		IWebCreateSubtype form = new SubtypeCreateForm();
		
		if(form.validate(parameter)){
			
		}
	}

}
