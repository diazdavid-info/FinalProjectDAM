/**
 * Intefaz que debe ser implementado por todos los validadores del create
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.validate.form;

import java.util.Map;

public interface IWebCreate {

	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter);

	/**
	 * Método que devuelve el campo username
	 * @return String
	 */
	public String getUsername();

	/**
	 * Método que devuelve el campo password
	 * @return String
	 */
	public String getPassword();

	/**
	 * Método que devuelve el campo name
	 * @return String
	 */
	public String getName();

	/**
	 * Método que devuelve el campo nif
	 * @return String
	 */
	public String getNif();

	/**
	 * Método que devuelve el campo surname1
	 * @return String
	 */
	public String getSurname1();

	/**
	 * Método que devuelve el campo surname2
	 * @return String
	 */
	public String getSurname2();

	/**
	 * Método que devuelve el campo email
	 * @return String
	 */
	public String getEmail();

	/**
	 * Método que obtiene el campo province
	 * @return String
	 */
	public String getProvince();

	/**
	 * Método que obtiene el campo population
	 * @return String
	 */
	public String getPopulation();

	/**
	 * Método que obtiene el campo description
	 * @return String
	 */
	public String getDescription();
	
	/**
	 * Método que obtiene el campo role
	 * @return String
	 */
	public String getRole();
}
