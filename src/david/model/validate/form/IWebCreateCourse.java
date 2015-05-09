/**
 * Intefaz que debe ser implementado por todos los validadores del create Course
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.validate.form;

import java.util.Map;

public interface IWebCreateCourse {
	
	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter);
	
	/**
	 * Método que obtiene el valor del atributo mStart
	 * @return String
	 */
	public String getStart();
	
	/**
	 * Método que obtiene el valor del atributo mFinish
	 * @return String
	 */
	public String getFinish();

}
