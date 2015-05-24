/**
 * Clase que valida el formulario de create chapter
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.validate.form;

import java.lang.reflect.Field;
import java.util.Map;

import david.model.annotation.Parameter;

public class ChapterCreateForm extends Form implements IWebCreateChapter{
	
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
	 * Atributo que almacena el valor del campo cycle
	 */
	@Parameter(name="cycle", required=true)
	private String mCycle;
	/**
	 * Atributo que almacena el valor del campo module
	 */
	@Parameter(name="module", required=true)
	private String mModule;
	/**
	 * Atributo que almacena el valor del campo hour
	 */
	@Parameter(name="hour", required=true)
	private String mHour;
	/**
	 * Atributo que almacena el valor del campo name
	 */
	@Parameter(name="name", required=true)
	private String mName;
	
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
	 * Método que establece el valor del atributo mCourse
	 * @param String course
	 */
	public void setCourse(String course){
		mCourse = course;
	}
	
	/**
	 * Método que obtiene el valor del atributo mSchool
	 * @return String
	 */
	public String getSchool(){
		return mSchool;
	}
	
	/**
	 * Método que establece el valor del atributo mSchool
	 * @param String school
	 */
	public void setSchool(String school){
		mSchool = school;
	}
	
	/**
	 * Método que obtiene el valor del atributo mCycle
	 * @return String
	 */
	public String getCycle(){
		return mCycle;
	}
	
	/**
	 * Método que establece el valor del atributo mCycle
	 * @param String cycle
	 */
	public void setCycle(String cycle){
		mCycle = cycle;
	}
	
	/**
	 * Método que obtiene el valor del atributo mModule
	 * @return String
	 */
	public String getModule(){
		return mModule;
	}
	
	/**
	 * Método que establece el valor del atributo mModule
	 * @param String module
	 */
	public void setModulde(String module){
		mModule = module;
	}
	
	/**
	 * Método que obtiene el valor del atributo mHour
	 * @return String
	 */
	public String getHour(){
		return mHour;
	}
	
	/**
	 * Método que establece el valor del atributo mHour
	 * @param String hour
	 */
	public void setHour(String hour){
		mHour = hour;
	}
	
	/**
	 * Método que obtiene el valor del atributo mName
	 * @return String
	 */
	public String getName(){
		return mName;
	}
	
	/**
	 * Método que establece el valor del atributo mName
	 * @param String name
	 */
	public void setName(String name){
		mName = name;
	}

}
