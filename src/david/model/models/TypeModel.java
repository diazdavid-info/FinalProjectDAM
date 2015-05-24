/**
 * Modelo para todo lo relacionado con un type
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.Map;

import david.model.validate.form.IWebCreateType;
import david.model.validate.form.TypeCreateForm;

public class TypeModel implements DTypeModel{
	
	/**
	 * Método que gestiona la creación de un tipo de sesión
	 * @param Map<String, String[]> parameter
	 */
	public void createType(Map<String, String[]> parameter){
		IWebCreateType form = new TypeCreateForm();
		
		if(form.validate(parameter)) {
			
		}
	}

}
