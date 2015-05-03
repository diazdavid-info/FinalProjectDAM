/**
 * Clase que transforma entidades en persistencia
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.transformer;

import david.model.persistence.RolePersistence;
import david.model.pojo.builder.RoleBuilder;
import david.model.pojo.permission.Role;

public class RoleTransformer implements IRoleTransformer{

	/**
	 * Método que transforma la entidad Role en la persistencia Role
	 * @param Role role
	 * @return RolePersistence 
	 */
	public RolePersistence entityToPersistence(Role role){
		RolePersistence rolePersistence = new RolePersistence();
		rolePersistence.setDescription(role.getDescription());
		
		if(role.getId() != 0){
			rolePersistence.setId(role.getId());
		}
		
		rolePersistence.setName(role.getNameRol());
		
		return rolePersistence;
	}
	
	/**
	 * Método que transforma la persistencia de Role en la entidad Role
	 * @param RolePersistence rolePersistence
	 * @return Role
	 */
	public Role persistenceToEntity(RolePersistence rolePersistence){
		RoleBuilder roleBuilder = new RoleBuilder();
		roleBuilder
		.description(rolePersistence.getDescription())
		.id(rolePersistence.getId())
		.nameRol(rolePersistence.getName());
		return new Role(roleBuilder);
		
	}
}
