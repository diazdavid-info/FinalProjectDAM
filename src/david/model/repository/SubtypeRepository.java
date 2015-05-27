/**
 * Repositorio para la persistencia de SubType
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.repository;

import java.util.List;

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

	/**
	 * Método que busca todos los subtypePersistence que cumplan con los requisitos
	 * @param SubtypePersistence subtypePersistence
	 * @return List<SubtypePersistence>
	 */
	public List<SubtypePersistence> findAll(SubtypePersistence subtypePersistence) {
		Mapper<SubtypePersistence> mapper = new Mapper<SubtypePersistence>(subtypePersistence);
		mProvider.connect();
		List<SubtypePersistence> list = mapper.mapperAllToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return list;
	}

	/**
	 * Método que busca un subtypePersistence que cumplan con los requisitos
	 * @param SubtypePersistence subtypePersistence
	 * @return SubtypePersistence
	 */
	public SubtypePersistence find(SubtypePersistence subtypePersistence) {
		Mapper<SubtypePersistence> mapper = new Mapper<SubtypePersistence>(subtypePersistence);
		mProvider.connect();
		SubtypePersistence persistence = mapper.mapperToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return persistence;
	}

}
