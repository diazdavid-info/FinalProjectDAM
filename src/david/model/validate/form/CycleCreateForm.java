/**
 * Clase que valida el formulario de CreateCycle
 * @author David Díaz García
 * @date 17-05-2015
 */
package david.model.validate.form;

import java.lang.reflect.Field;
import java.util.Map;

import david.model.annotation.Parameter;

public class CycleCreateForm extends Form implements IWebCreateCycle{

	/**
	 * Atributo que almacena el valor del campo course
	 */
	@Parameter(name="course", required=true)
	private String mCourse;
	/**
	 * Atributo que almacena el valor del campo schools
	 */
	@Parameter(name="schools", required=true)
	private String mSchool;
	/**
	 * Atributo que almacena el valor del campo tutor
	 */
	@Parameter(name="tutor", required=true)
	private String mTutor;
	/**
	 * Atributo que almacena el valor del campo name
	 */
	@Parameter(name="name", required=true)
	private String mName;
	/**
	 * Atributo que almacena el valor del campo code
	 */
	@Parameter(name="code", required=true)
	private String mCode;
	
	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter){
		boolean validate = true;
		for (Field field : this.getClass().getDeclaredFields()) {
			String[] value = parameter.get(field.getAnnotation(Parameter.class).name());
			setAttributes(field, (value == null) ? "" : value[0]);
			validate = validateField(field);
		}
		return validate;
	}
	
	/**
	 * Método que obtiene el valor del atributo mCourse
	 * @return String
	 */
	public String getCourse(){
		return mCourse;
	}
	
	/**
	 * Método que obtiene el valor del atributo mSchool
	 * @return String
	 */
	public String getSchool(){
		return mSchool;
	}
	
	/**
	 * Método que obtiene el valor del atributo mTutor
	 * @return String
	 */
	public String getTutor(){
		return mTutor;
	}
	
	/**
	 * Método que obtiene el valor del atributo mName
	 * @return String
	 */
	public String getName(){
		return mName;
	}
	
	/**
	 * Método que obtiene el valor del atributo mCode
	 * @return String
	 */
	public String getCode(){
		return mCode;
	}
	
}
