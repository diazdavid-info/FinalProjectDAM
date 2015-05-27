/**
 * Interfaz para que implemente el modelo de subtype
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.List;
import java.util.Map;

import david.model.pojo.school.SubType;

public interface DSubtypeModel {

	/**
	 * Método que gestiona la creación de un subtipo de sesión
	 * @param Map<String, String[]> requestParameter
	 */
	public void createSubtype(Map<String, String[]> requestParameter);

	/**
	 * Método que solicita y gestiona el listado de subtipos
	 * @return List<SubType>
	 */
	public List<SubType> listSubtype();

	/**
	 * Método que solicita y gestiona la busqueda de un Subtipo
	 * @param SubType subType
	 * @return SubType
	 */
	public SubType findSubtype(SubType subType);

}
