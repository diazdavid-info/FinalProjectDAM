/**
 * Intefaz que define el comportamiento de los transformadores de Rol
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.transformer;

import david.model.persistence.RolePersistence;
import david.model.pojo.permission.Role;

public interface IRoleTransformer {
	
	/**
	 * Método que transforma la entidad Role en la persistencia Role
	 * @param Role role
	 * @return RolePersistence 
	 */
	public RolePersistence entityToPersistence(Role role);
	
	/**
	 * Método que transforma la persistencia de Role en la entidad Role
	 * @param RolePersistence rolePersistence
	 * @return Role
	 */
	public Role persistenceToEntity(RolePersistence rolePersistence);

}
