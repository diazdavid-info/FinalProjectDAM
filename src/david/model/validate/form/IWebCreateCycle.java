/**
 * Intefaz que debe ser implementado por todos los validadores del CreateCycle
 * @author David Díaz García
 * @date 17-05-2015
 */
package david.model.validate.form;

import java.util.Map;

public interface IWebCreateCycle {

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
	 * Método que obtiene el valor del atributo mSchool
	 * @return String
	 */
	public String getSchool();
	
	/**
	 * Método que obtiene el valor del atributo mTutor
	 * @return String
	 */
	public String getTutor();
	
	/**
	 * Método que obtiene el valor del atributo mName
	 * @return String
	 */
	public String getName();
	
	/**
	 * Método que obtiene el valor del atributo mCode
	 * @return String
	 */
	public String getCode();
}
