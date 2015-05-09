/**
 * Clase que valida el formulario de create Course
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.validate.form;

import java.lang.reflect.Field;
import java.util.Map;

import david.model.annotation.Parameter;

public class CourseCreateForm extends Form implements IWebCreateCourse{
	
	/**
	 * Atributo que almacena el valor del campo name
	 */
	@Parameter(name="start", required=true)
	private String mStart;
	/**
	 * Atributo que almacena el valor del campo nif
	 */
	@Parameter(name="finish", required=true)
	private String mFinish;

	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter){
		System.out.println("Estoy en el CourseCreateForm");
		boolean validate = true;
		for (Field field : this.getClass().getDeclaredFields()) {
			String[] value = parameter.get(field.getAnnotation(Parameter.class).name());
			setAttributes(field, value[0]);
			validate = validateField(field);
		}
		return validate;
	}
	
	/**
	 * Método que obtiene el valor del atributo mStart
	 * @return String
	 */
	public String getStart(){
		return mStart;
	}
	
	/**
	 * Método que obtiene el valor del atributo mFinish
	 * @return String
	 */
	public String getFinish(){
		return mFinish;
	}
}
