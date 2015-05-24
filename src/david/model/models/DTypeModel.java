/**
 * Interfaz para que implemente el modelo de type
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.Map;

public interface DTypeModel {

	/**
	 * Método que gestiona la creación de un tipo de sesión
	 * @param Map<String, String[]> parameter
	 */
	public void createType(Map<String, String[]> requestParameter);

}
