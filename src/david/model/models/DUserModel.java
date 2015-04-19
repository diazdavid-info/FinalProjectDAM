/**
 * Interfaz para que implemente el modelo de usuario
 * @author David Díaz García
 * @date 19-04-2015
 * @version 1.0
 */
package david.model.models;

import java.util.Map;

public interface DUserModel {
	
	/**
	 * Método que gestiona el login de usuarios
	 * @param parameter 
	 */
	public void loginUser(Map<String, String[]> parameter);

}
