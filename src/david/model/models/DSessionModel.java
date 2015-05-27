/**
 * Interfaz para que implemente el modelo de session
 * @author David Díaz García
 * @date 25-05-2015
 */
package david.model.models;

import java.util.Map;

public interface DSessionModel {

	/**
	 * Método que se encarga de gestionar la creación de una session
	 * @param Map<String, String[]> requestParameter
	 */
	public void createSession(Map<String, String[]> requestParameter);

}
