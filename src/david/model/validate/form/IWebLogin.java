/**
 * Intefaz que debe ser implementado por todos los validadores del login
 * @author David Díaz García
 * @date 23-04-2015
 */
package david.model.validate.form;

import java.util.Map;

public interface IWebLogin {

	/**
	 * Método que obtiene el valor del Username
	 * @return String
	 */
	public String getUsername();
	
	/**
	 * Método que obtiene el valor del password
	 * @return String
	 */
	public String getPassword();
	
	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter);
}
