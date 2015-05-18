/**
 * Interfaz para que implemente el modelo de module
 * @author David Díaz García
 * @date 18-05-2015
 */
package david.model.models;

import java.util.Map;

public interface DModuleModel {

	/**
	 * Método que gestiona la creación de un modulo
	 * @param Map<String, String[]> requestParameter
	 */
	public void createModule(Map<String, String[]> requestParameter);

}
