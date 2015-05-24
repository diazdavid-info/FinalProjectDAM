/**
 * Intefaz que debe ser implementado por todos los validadores de create chapter
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.validate.form;

import java.util.Map;

public interface IWebCreateChapter {
	
	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter);
	
	/**
	 * Método que obtiene el valor del atributo mCourse
	 * @return String
	 */
	public String getCourse();
	
	/**
	 * Método que establece el valor del atributo mCourse
	 * @param String course
	 */
	public void setCourse(String course);
	
	/**
	 * Método que obtiene el valor del atributo mSchool
	 * @return String
	 */
	public String getSchool();
	
	/**
	 * Método que establece el valor del atributo mSchool
	 * @param String school
	 */
	public void setSchool(String school);
	
	/**
	 * Método que obtiene el valor del atributo mCycle
	 * @return String
	 */
	public String getCycle();
	
	/**
	 * Método que establece el valor del atributo mCycle
	 * @param String cycle
	 */
	public void setCycle(String cycle);
	
	/**
	 * Método que obtiene el valor del atributo mModule
	 * @return String
	 */
	public String getModule();
	
	/**
	 * Método que establece el valor del atributo mModule
	 * @param String module
	 */
	public void setModulde(String module);
	
	/**
	 * Método que obtiene el valor del atributo mHour
	 * @return String
	 */
	public String getHour();
	
	/**
	 * Método que establece el valor del atributo mHour
	 * @param String hour
	 */
	public void setHour(String hour);
	
	/**
	 * Método que obtiene el valor del atributo mName
	 * @return String
	 */
	public String getName();
	
	/**
	 * Método que establece el valor del atributo mName
	 * @param String name
	 */
	public void setName(String name);

}
