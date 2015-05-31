/**
 * Modelo para todo lo relacionado con un functionality
 * @author David Díaz García
 * @date 31-05-2015
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;

import david.model.persistence.FunctionalityPersistence;
import david.model.persistence.RoleFunctionalityPersistence;
import david.model.pojo.builder.FunctionalityBuilder;
import david.model.pojo.permission.Functionality;
import david.model.pojo.permission.Role;
import david.model.repository.FunctionalityRepository;
import david.model.repository.RoleFunctionalityRepository;
import david.model.transformer.IFunctionalityTransformer;

public class FunctionalityModel implements DFunctionalityModel {

	/**
	 * Atributo que almacena el repositorio de funcionalidad
	 */
	private FunctionalityRepository mFunctionalityRepository;
	/**
	 * Atributo que almacena el transformador de funcionalidad
	 */
	private IFunctionalityTransformer mIFunctionalityTrasformer;
	/**
	 * Atributo que almacena el repositorio de roleFunctionality
	 */
	private RoleFunctionalityRepository mRoleFunctionalityRepository;

	/**
	 * Constructor
	 * 
	 * @param functionalityTrasformer
	 * @param functionalityRepository
	 */
	public FunctionalityModel(IFunctionalityTransformer functionalityTrasformer, FunctionalityRepository functionalityRepository, RoleFunctionalityRepository roleFunctionalityRepository) {
		mIFunctionalityTrasformer = functionalityTrasformer;
		mFunctionalityRepository = functionalityRepository;
		mRoleFunctionalityRepository = roleFunctionalityRepository;
	}

	/**
	 * Método que gestiona la busqueda de las functionalidades de un rol
	 * 
	 * @param Role
	 *            role
	 * @return List<Functionality>
	 */
	@Override
	public List<Functionality> listFunctionality(Role role) {
		List<Functionality> list = new ArrayList<Functionality>();
		RoleFunctionalityPersistence roleFunctionality = new RoleFunctionalityPersistence();
		roleFunctionality.setIdRole(role.getId());
		List<RoleFunctionalityPersistence> roleFunctionalityPersistence = mRoleFunctionalityRepository.findAll(roleFunctionality);

		for (RoleFunctionalityPersistence roleFunctionalityPersistence2 : roleFunctionalityPersistence) {
			FunctionalityPersistence functionalityPersistence = mIFunctionalityTrasformer.entityToPersistence(new Functionality(new FunctionalityBuilder().id(roleFunctionalityPersistence2
					.getIdFunctionality())));
			list.add(mIFunctionalityTrasformer.persistenceToEntity(mFunctionalityRepository.find(functionalityPersistence)));
		}
		return list;
	}

}
