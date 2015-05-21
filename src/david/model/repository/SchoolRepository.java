/**
 * Repositorio para la persistencia de School
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.repository;

import java.util.List;

import david.model.mapper.Mapper;
import david.model.persistence.SchoolPersistence;
import david.model.provider.DProvider;

public class SchoolRepository {
	
	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;
	
	/**
	 * Constructor
	 * @param DProvider provider
	 */
	public SchoolRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que guarda un SchoolPersistence
	 * @param SchoolPersistence schoolPersistence
	 * @return SchoolPersistence
	 */
	public SchoolPersistence storage(SchoolPersistence schoolPersistence) {
		return (schoolPersistence.getId() == null) ? save(schoolPersistence) : update(schoolPersistence);
	}

	/**
	 * Método que actualiza un SchoolPersistence
	 * @param SchoolPersistence schoolPersistence
	 * @return SchoolPersistence
	 */
	private SchoolPersistence update(SchoolPersistence schoolPersistence) {
		return null;
	}

	/**
	 * Método que almacena un SchoolRepository
	 * @param SchoolPersistence schoolPersistence
	 * @return SchoolPersistence
	 */
	private SchoolPersistence save(SchoolPersistence schoolPersistence) {
		Mapper<SchoolPersistence> mapper = new Mapper<SchoolPersistence>(schoolPersistence);
		mProvider.connect();
		schoolPersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		mProvider.disconnect();
		return schoolPersistence;
	}

	/**
	 * Método que busca todos los schoolPersistence que cumplan con los requisitos
	 * @param SchoolPersistence schoolPersistence
	 * @return List<SchoolPersistence>
	 */
	public List<SchoolPersistence> findAll(SchoolPersistence schoolPersistence) {
		Mapper<SchoolPersistence> mapper = new Mapper<SchoolPersistence>(schoolPersistence);
		mProvider.connect();
		List<SchoolPersistence> list = mapper.mapperAllToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return list;
	}

	/**
	 * Método que busca un schoolPersistence que cumpla con los requisitos
	 * @param SchoolPersistence schoolPersistence
	 * @return SchoolPersistence
	 */
	public SchoolPersistence find(SchoolPersistence schoolPersistence) {
		Mapper<SchoolPersistence> mapper = new Mapper<SchoolPersistence>(schoolPersistence);
		mProvider.connect();
		SchoolPersistence persistence = mapper.mapperToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return persistence;
	}
}
