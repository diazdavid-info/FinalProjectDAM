/**
 * Interfaz para que implemente el modelo de role
 * @author David Díaz García
 * @date 31-05-2015
 */
package david.model.models;

import david.model.pojo.permission.Role;

public interface DRoleModel {

	/**
	 * Método que gestiona la busqueda de un rol
	 * 
	 * @param Role
	 *            role
	 * @return Role
	 */
	public Role findRole(Role role);

}
