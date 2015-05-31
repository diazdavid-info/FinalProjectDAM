/**
 * Repositorio para la persistencia de RoleFunctionality
 * @author David Díaz García
 * @date 31-05-2015
 */
package david.model.repository;

import java.util.List;

import david.model.mapper.Mapper;
import david.model.persistence.RoleFunctionalityPersistence;
import david.model.provider.DProvider;

public class RoleFunctionalityRepository {

	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;

	/**
	 * Constructor
	 * 
	 * @param DProvider
	 *            provider
	 */
	public RoleFunctionalityRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que busca todos los schoolPersistence que cumplan con los requisitos
	 * 
	 * @param RoleFunctionalityPersistence
	 *            roleFunctionality
	 * @return List<RoleFunctionalityPersistence>
	 */
	public List<RoleFunctionalityPersistence> findAll(RoleFunctionalityPersistence roleFunctionality) {
		Mapper<RoleFunctionalityPersistence> mapper = new Mapper<RoleFunctionalityPersistence>(roleFunctionality);
		mProvider.connect();
		List<RoleFunctionalityPersistence> list = mapper.mapperAllToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return list;
	}

}
