/**
 * Clase padre de todos los formularios
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.validate.form;

import java.lang.reflect.Field;

import david.model.annotation.Parameter;
import david.utils.Message;

public class Form {
	
	/**
	 * Método que verifica si el campo cumple con las restriciones
	 * @param Field field
	 */
	protected boolean validateField(Field field) {
		boolean validate = true;
		try {
			if(field.getAnnotation(Parameter.class).required() && field.get(this).equals("")){
				Message.addMesagge("Mal");
				validate = false;
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return validate;
	}

	/**
	 * Método que mapea los atributos del formulario con los atributos propios de la clase
	 * @param String value 
	 * @param Map<String, String[]> parameter
	 */
	protected void setAttributes(Field field, String value) {
		try {
			field.setAccessible(true);
			field.set(this, value);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}