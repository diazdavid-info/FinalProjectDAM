/**
 * Repositorio para la persistencia de Module
 * @author David Díaz García
 * @date 18-05-2015
 */
package david.model.repository;

import java.util.List;

import david.model.mapper.Mapper;
import david.model.persistence.ModulePersistence;
import david.model.provider.DProvider;

public class ModuleRepository {

	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;

	/**
	 * Constructor
	 * @param DProvider provider
	 */
	public ModuleRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que almacena un modulePersistence
	 * @param ModulePersistence modulePersistence
	 * @return ModulePersistence
	 */
	public ModulePersistence storage(ModulePersistence modulePersistence) {
		return (modulePersistence.getId() == null) ? save(modulePersistence) : update(modulePersistence);
	}

	/**
	 * 
	 * @param ModulePersistence modulePersistence
	 * @return ModulePersistence
	 */
	private ModulePersistence update(ModulePersistence modulePersistence) {
		return null;
	}

	/**
	 * 
	 * @param ModulePersistence modulePersistence
	 * @return ModulePersistence
	 */
	private ModulePersistence save(ModulePersistence modulePersistence) {
		Mapper<ModulePersistence> mapper = new Mapper<ModulePersistence>(modulePersistence);
		mProvider.connect();
		modulePersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		mProvider.disconnect();
		return modulePersistence;
	}

	/**
	 * Método que busca todos los modulePersistence que cumplan con los requisitos
	 * @param ModulePersistence modulePersistence
	 * @return List<ModulePersistence>
	 */
	public List<ModulePersistence> findAll(ModulePersistence modulePersistence) {
		Mapper<ModulePersistence> mapper = new Mapper<ModulePersistence>(modulePersistence);
		mProvider.connect();
		List<ModulePersistence> persistence = mapper.mapperAllToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return persistence;
	}

}
