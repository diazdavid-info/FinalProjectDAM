/**
 * Interfaz para que implemente el modelo de subtype
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.Map;

public interface DSubtypeModel {

	/**
	 * Método que gestiona la creación de un subtipo de sesión
	 * @param Map<String, String[]> requestParameter
	 */
	public void createSubtype(Map<String, String[]> requestParameter);

}
