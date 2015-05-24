/**
 * Clase que valida el formulario de login
 * @author David Díaz García
 * @date 19-05-2015
 * @version 1.0
 */
package david.model.validate.form;

import java.lang.reflect.Field;
import java.util.Map;

import david.model.annotation.Parameter;


public class LoginForm extends Form implements IWebLogin{
	
	/**
	 * Atributo que almacena el valor del campo username
	 */
	@Parameter(name="username", required=true, msg="El campo username no es válido")
	private String mUsername;
	/**
	 * Atributo que almacena el valor del campo password
	 */
	@Parameter(name="password", required=true, msg="El campo password no es válido")
	private String mPassword;

	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter){
		System.out.println("Estoy en el LoginForm");
		boolean validate = true;
		for (Field field : this.getClass().getDeclaredFields()) {
			String[] value = parameter.get(field.getAnnotation(Parameter.class).name());
			setAttributes(field, value[0]);
			validate = validateField(field);
		}
		return validate;
	}
	
	/**
	 * Método que obtiene el valor del Username
	 * @return String
	 */
	public String getUsername(){
		return mUsername;
	}
	
	/**
	 * Método que obtiene el valor del password
	 * @return String
	 */
	public String getPassword(){
		return mPassword;
	}
}
