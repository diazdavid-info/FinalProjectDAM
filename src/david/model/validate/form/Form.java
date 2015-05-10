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
	
	private boolean mValidate = true;
	
	/**
	 * Método que verifica si el campo cumple con las restriciones
	 * @param Field field
	 */
	protected boolean validateField(Field field) {
		try {
			if(field.getAnnotation(Parameter.class).required() && field.get(this).equals("")){
				Message.addMesagge("Mal");
				mValidate = false;
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return mValidate;
	}

	/**
	 * Método que mapea los atributos del formulario con los atributos propios de la clase
	 * @param Field field
	 * @param Object value
	 */
	protected void setAttributes(Field field, Object value) {
		try {
			field.setAccessible(true);
			field.set(this, value);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
