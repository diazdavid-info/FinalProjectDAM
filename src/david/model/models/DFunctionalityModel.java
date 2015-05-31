/**
 * Interfaz para que implemente el modelo de functionality
 * @author David Díaz García
 * @date 31-05-2015
 */
package david.model.models;

import java.util.List;

import david.model.pojo.permission.Functionality;
import david.model.pojo.permission.Role;

public interface DFunctionalityModel {

	/**
	 * Método que gestiona la busqueda de las functionalidades de un rol
	 * 
	 * @param Role
	 *            role
	 * @return List<Functionality>
	 */
	public List<Functionality> listFunctionality(Role role);

}
