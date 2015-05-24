/**
 * Clase que valida el formulario de create type
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.validate.form;

import java.lang.reflect.Field;
import java.util.Map;

import david.model.annotation.Parameter;

public class TypeCreateForm extends Form implements IWebCreateType{
	
	/**
	 * Atributo que almacena el valor del campo name
	 */
	@Parameter(name="name", required=true, msg="El campo nombre no es válido")
	private String mName;
	/**
	 * Atributo que almacena el valor del campo description
	 */
	@Parameter(name="description", required=true, msg="El campo descripción no es válido")
	private String mDescription;
	
	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter){
		boolean validate = true;
		for (Field field : this.getClass().getDeclaredFields()) {
			String[] value = parameter.get(field.getAnnotation(Parameter.class).name());
			setAttributes(field, value[0]);
			validate = validateField(field);
		}
		return validate;
	}
	
	/**
	 * Método que obtiene el valor del atributo mName
	 * @return String
	 */
	public String getName(){
		return mName;
	}
	
	/**
	 * Método que obtiene el valor del atributo mDescription
	 * @return String
	 */
	public String getDescription(){
		return mDescription;
	}

}
