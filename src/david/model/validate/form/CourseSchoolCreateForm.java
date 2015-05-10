/**
 * Clase que valida el formulario de AddCourseSchoolCreate
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.validate.form;

import java.lang.reflect.Field;
import java.util.Map;

import david.model.annotation.Parameter;

public class CourseSchoolCreateForm extends Form implements IWebCreateCourseSchool{
	
	/**
	 * Atributo que almacena el valor del campo course
	 */
	@Parameter(name="course", required=true)
	private String mCourse;
	/**
	 * Atributo que almacena el valor del campo schools
	 */
	@Parameter(name="schools", required=true, type="array")
	private String[] mSchools;
	
	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter){
		System.out.println("Estoy en el AddCourseSchoolCreate");
		boolean validate = true;
		for (Field field : this.getClass().getDeclaredFields()) {
			String[] value = parameter.get(field.getAnnotation(Parameter.class).name());
			
			if(field.getAnnotation(Parameter.class).type().equals("array")){
				setAttributes(field, value);
			}
			
			if(field.getAnnotation(Parameter.class).type().equals("String")){
				setAttributes(field, value[0]);
			}
			
			validate = validateField(field);
		}
		return validate;
	}

	/**
	 * Método que obtiene el valor del atributo mCourse
	 * @return String
	 */
	public String getCourse() {
		return mCourse;
	}

	/**
	 * Método que obtiene el valor del atributo mSchools
	 * @return String[]
	 */
	public String[] getSchools() {
		return mSchools;
	}
	
	

}
