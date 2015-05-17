/**
 * Interfaz para que implemente el modelo de usuario
 * @author David Díaz García
 * @date 19-04-2015
 * @version 1.0
 */
package david.model.models;

import java.util.List;
import java.util.Map;

import david.model.pojo.users.User;

public interface DUserModel {
	
	/**
	 * Método que gestiona el login de usuarios
	 * @param parameter 
	 * @return User
	 */
	public User loginUser(Map<String, String[]> parameter);

	/**
	 * Método que solicita y gestiona la lista de usuarios
	 * @return List<User>
	 */
	public List<User> listUser();

	/**
	 * Método que gestiona la creación de usuarios
	 * @param Map<String, String[]> requestParameter
	 */
	public void createUser(Map<String, String[]> requestParameter);

	/**
	 * Método que gestiona la lista de tutores
	 * @return List<User>
	 */
	public List<User> listTutors();

}
