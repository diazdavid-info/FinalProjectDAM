/**
 * Interfaz para que implemente el modelo de session
 * @author David Díaz García
 * @date 25-05-2015
 */
package david.model.models;

import java.util.List;
import java.util.Map;

import david.model.pojo.school.Module;
import david.model.pojo.school.Session;
import david.model.pojo.users.User;

public interface DSessionModel {

	/**
	 * Método que se encarga de gestionar la creación de una session
	 * 
	 * @param Map
	 *            <String, String[]> requestParameter
	 */
	public void createSession(Map<String, String[]> requestParameter);

	/**
	 * Método encargado de buscar todas las sessiones de un módulo
	 * 
	 * @param Module
	 *            module
	 * @return List<Session>
	 */
	public List<Session> findAllSession(Module module);

	/**
	 * Método encargado de buscar las sessiones de un usuario
	 * 
	 * @param User
	 *            user
	 * @return List<Module>
	 */
	public List<Module> listSession(User user);

}
