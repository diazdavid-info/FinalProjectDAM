/**
 * Repositorio para la persistencia de Role
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.repository;

import david.model.mapper.Mapper;
import david.model.persistence.RolePersistence;
import david.model.provider.DProvider;

public class RoleRepository {
	
	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;
	
	/**
	 * Constructor
	 * @param DProvider provider
	 */
	public RoleRepository(DProvider provider) {
		mProvider = provider;
	}
	
	/**
	 * Método que busca un RolePersistence que cumplan con los requisitos
	 * @param RolePersistence rolePersistence
	 * @return RolePersistence
	 */
	public RolePersistence find(RolePersistence rolePersistence){
		Mapper<RolePersistence> mapper = new Mapper<RolePersistence>(rolePersistence);
		return mapper.mapperToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
	}

}
