/**
 * Interfaz para que implemente el modelo de cycle
 * @author David Díaz García
 * @date 17-05-2015
 */
package david.model.models;

import java.util.Map;

public interface DCycleModel {
	
	/**
	 * Método que gestiona la creación de un ciclo
	 * @param Map<String, String[]> parameter
	 */
	public void createCycle(Map<String, String[]> parameter);

}
