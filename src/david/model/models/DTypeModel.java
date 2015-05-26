/**
 * Interfaz para que implemente el modelo de type
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.List;
import java.util.Map;

import david.model.pojo.school.Type;

public interface DTypeModel {

	/**
	 * Método que gestiona la creación de un tipo de sesión
	 * @param Map<String, String[]> parameter
	 */
	public void createType(Map<String, String[]> requestParameter);

	/**
	 * Método que solicita y gestiona el listado de tipos
	 * @return List<Type>
	 */
	public List<Type> listType();

	/**
	 * Método que solicita y gestiona la busqueda de un Type
	 * @param Type type
	 * @return Type
	 */
	public Type findType(Type type);

}
