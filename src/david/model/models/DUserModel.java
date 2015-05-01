/**
 * Interfaz para que implemente el modelo de usuario
 * @author David Díaz García
 * @date 19-04-2015
 * @version 1.0
 */
package david.model.models;

import java.util.Map;

import david.model.pojo.users.User;

public interface DUserModel {
	
	/**
	 * Método que gestiona el login de usuarios
	 * @param parameter 
	 * @return User
	 */
	public User loginUser(Map<String, String[]> parameter);

}
