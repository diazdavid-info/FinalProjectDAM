/**
 * Modelo para todo lo relacionado con un cycle
 * @author David Díaz García
 * @date 17-05-2015
 */
package david.model.models;

import java.util.Map;

import david.model.pojo.school.Cycle;
import david.model.validate.form.CycleCreateForm;
import david.model.validate.form.IWebCreateCycle;

public class CycleModel implements DCycleModel{
	
	/**
	 * Método que gestiona la creación de un ciclo
	 * @param Map<String, String[]> parameter
	 */
	public void createCycle(Map<String, String[]> parameter){
		Cycle cicle = null;
		
		IWebCreateCycle form = new CycleCreateForm();
		
		if(form.validate(parameter)){
			System.out.println("FORMULARIO CRETE CYCLE ES VALIDO");
		}
		System.out.println("FORMULARIO CRETE CYCLE NO ES VALIDO");
	}

}
