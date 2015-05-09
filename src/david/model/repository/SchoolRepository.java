/**
 * Repositorio para la persistencia de School
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.repository;

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
		System.out.println("ESTOY EN EL UPDATE DE SCHOOLREPOSITORY");
		return null;
	}

	/**
	 * Método que almacena un SchoolRepository
	 * @param SchoolPersistence schoolPersistence
	 * @return SchoolPersistence
	 */
	private SchoolPersistence save(SchoolPersistence schoolPersistence) {
		System.out.println("ESTOY EN EL SAVE DE SCHOOLREPOSITORY");
		Mapper<SchoolPersistence> mapper = new Mapper<SchoolPersistence>(schoolPersistence);
		schoolPersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		return schoolPersistence;
	}
}
