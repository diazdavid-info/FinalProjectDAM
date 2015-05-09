/**
 * Intefaz que debe ser implementado por todos los validadores del create School
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.validate.form;

import java.util.Map;

public interface IWebCreateSchool {
	
	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter);
	
	/**
	 * Método que obtiene el valor del campo name
	 * @return String
	 */
	public String getName();
	
	/**
	 * Método que obtiene el valor del campo code
	 * @return String
	 */
	public String getCode();
	
	/**
	 * Método que obtiene el valor del campo province
	 * @return String
	 */
	public String getProvince();
	
	/**
	 * Método que obtiene el valor del campo population
	 * @return String
	 */
	public String getPopulation();
	
	/**
	 * Método que obtiene el valor del campo description
	 * @return String
	 */
	public String getDescription();

}
