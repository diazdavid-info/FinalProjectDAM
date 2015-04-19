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


public class LoginForm {
	
	/**
	 * Atributo que almacena el valor del campo username
	 */
	@Parameter(name="username", required=true)
	private String mUsername;
	/**
	 * Atributo que almacena el valor del campo password
	 */
	@Parameter(name="password", required=true)
	private String mPassword;

	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter){
		System.out.println("Estoy en el LoginForm");
		for (Field field : this.getClass().getDeclaredFields()) {
			String[] value = parameter.get(field.getAnnotation(Parameter.class).name());
			setAttributes(field, value[0]);
			validateField(field);
		}
		
		return false;
	}

	/**
	 * Método que verifica si el campo cumple con las restriciones
	 * @param Field field
	 */
	private void validateField(Field field) {
		try {
			if(field.getAnnotation(Parameter.class).required()){
				System.out.println("VALOR: "+((field.get(this).equals("")) ? "mal" : "Bien"));
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * Método que mapea los atributos del formulario con los atributos propios de la clase
	 * @param String value 
	 * @param Map<String, String[]> parameter
	 */
	private void setAttributes(Field field, String value) {
		try {
			field.set(this, value);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
