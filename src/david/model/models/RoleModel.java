/**
 * Modelo para todo lo relacionado con un rol
 * @author David Díaz García
 * @date 31-05-2015
 */
package david.model.models;

import java.util.List;

import david.model.factory.ModelFactory;
import david.model.persistence.RolePersistence;
import david.model.pojo.permission.Functionality;
import david.model.pojo.permission.Role;
import david.model.repository.RoleRepository;
import david.model.transformer.IRoleTransformer;

public class RoleModel implements DRoleModel {

	/**
	 * Atributo que almacena el repositorio de role
	 */
	private RoleRepository mRoleRepository;
	/**
	 * Atributo que almacena el transformador de role
	 */
	private IRoleTransformer mIRoleTransformer;

	/**
	 * Constructor
	 * 
	 * @param roleRepository
	 * @param roleTransformer
	 */
	public RoleModel(IRoleTransformer roleTransformer, RoleRepository roleRepository) {
		mRoleRepository = roleRepository;
		mIRoleTransformer = roleTransformer;
	}

	/**
	 * Método que gestiona la busqueda de un rol
	 * 
	 * @param Role
	 *            role
	 * @return Role
	 */
	@Override
	public Role findRole(Role role) {
		RolePersistence rolePersistence = mIRoleTransformer.entityToPersistence(role);
		Role newRole = mIRoleTransformer.persistenceToEntity(mRoleRepository.find(rolePersistence));
		newRole.setFunctionality(getFunctionality(newRole));
		return newRole;
	}

	/**
	 * Método que solicita las funcionalidades de un rol
	 * 
	 * @param Role
	 *            newRole
	 * @return List<Functionality>
	 */
	private List<Functionality> getFunctionality(Role newRole) {
		DFunctionalityModel functionalityModel = ModelFactory.createFunctionalityModel();
		return functionalityModel.listFunctionality(newRole);
	}
}
