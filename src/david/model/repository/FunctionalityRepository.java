/**
 * Repositorio para la persistencia de Functionality
 * @author David Díaz García
 * @date 31-05-2015
 */
package david.model.repository;

import david.model.mapper.Mapper;
import david.model.persistence.FunctionalityPersistence;
import david.model.provider.DProvider;

public class FunctionalityRepository {

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
	public FunctionalityRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que gstiona la busqueda de una Functionality
	 * 
	 * @param FunctionalityPersistence
	 *            functionalityPersistence
	 * @return FunctionalityPersistence
	 */
	public FunctionalityPersistence find(FunctionalityPersistence functionalityPersistence) {
		Mapper<FunctionalityPersistence> mapper = new Mapper<FunctionalityPersistence>(functionalityPersistence);
		mProvider.connect();
		FunctionalityPersistence persistence = mapper.mapperToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return persistence;
	}
}
