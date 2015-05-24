/**
 * Repositorio para la persistencia de SubType
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.repository;

import david.model.mapper.Mapper;
import david.model.persistence.SubtypePersistence;
import david.model.provider.DProvider;

public class SubtypeRepository {
	
	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;

	/**
	 * Constructor
	 * @param DProvider provider
	 */
	public SubtypeRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que guarda un SubtypePersistence
	 * @param SubtypePersistence subtypePersistence
	 * @return SubtypePersistence
	 */
	public SubtypePersistence storage(SubtypePersistence subtypePersistence) {
		return (subtypePersistence.getId() == null) ? save(subtypePersistence) : update(subtypePersistence);
	}

	/**
	 * Método que actualiza un SubtypePersistence
	 * @param SubtypePersistence subtypePersistence
	 * @return SubtypePersistence
	 */
	private SubtypePersistence update(SubtypePersistence subtypePersistence) {
		return null;
	}

	/**
	 * Método que almacena un SubtypePersistence
	 * @param SubtypePersistence subtypePersistence
	 * @return SubtypePersistence
	 */
	private SubtypePersistence save(SubtypePersistence subtypePersistence) {
		Mapper<SubtypePersistence> mapper = new Mapper<SubtypePersistence>(subtypePersistence);
		mProvider.connect();
		subtypePersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		mProvider.disconnect();
		return subtypePersistence;
	}

}
