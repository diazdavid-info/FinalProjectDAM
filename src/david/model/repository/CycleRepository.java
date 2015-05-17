/**
 * Repositorio para la persistencia de Course
 * @author David Díaz García
 * @date 17-05-2015
 */
package david.model.repository;

import java.util.List;

import david.model.mapper.Mapper;
import david.model.persistence.CyclePersistence;
import david.model.provider.DProvider;

public class CycleRepository {
	
	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;

	/**
	 * Constructor
	 * @param DProvider provider
	 */
	public CycleRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que almacena un cyclePersistence
	 * @param CyclePersistence cyclePersistence
	 * @return CyclePersistence
	 */
	public CyclePersistence storage(CyclePersistence cyclePersistence) {
		return (cyclePersistence.getId() == null) ? save(cyclePersistence) : update(cyclePersistence);
	}

	/**
	 * Método que guarda un CyclePersistence
	 * @param CyclePersistence cyclePersistence
	 * @return CyclePersistence
	 */
	private CyclePersistence save(CyclePersistence cyclePersistence) {
		System.out.println("ESTOY EN EL SAVE DE CYCLEREPOSITORY");
		Mapper<CyclePersistence> mapper = new Mapper<CyclePersistence>(cyclePersistence);
		cyclePersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		return cyclePersistence;
	}

	/**
	 * Método que actualiza un CyclePersistence
	 * @param CyclePersistence cyclePersistence
	 * @return CyclePersistence
	 */
	private CyclePersistence update(CyclePersistence cyclePersistence) {
		System.out.println("ESTOY EN EL UPDATE DE CYCLEREPOSITORY");
		return null;
	}

	/**
	 * Método que busca todos los schoolPersistence que cumplan con los requisitos
	 * @param CyclePersistence cyclePersistence
	 * @return List<CyclePersistence>
	 */
	public List<CyclePersistence> findAll(CyclePersistence cyclePersistence) {
		Mapper<CyclePersistence> mapper = new Mapper<CyclePersistence>(cyclePersistence);
		return mapper.mapperAllToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
	}
}
