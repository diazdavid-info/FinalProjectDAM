/**
 * Repositorio para la persistencia de Type
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.repository;

import david.model.mapper.Mapper;
import david.model.persistence.TypePersistence;
import david.model.provider.DProvider;

public class TypeRepository {
	
	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;
	
	/**
	 * Constructor
	 * @param DProvider provider
	 */
	public TypeRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que guarda un TypePersistence
	 * @param TypePersistence typePersistence
	 * @return TypePersistence
	 */
	public TypePersistence storage(TypePersistence typePersistence) {
		return (typePersistence.getId() == null) ? save(typePersistence) : update(typePersistence);
	}

	/**
	 * Método que actualiza un TypePersistence
	 * @param TypePersistence typePersistence
	 * @return TypePersistence
	 */
	private TypePersistence update(TypePersistence typePersistence) {
		return null;
	}

	/**
	 * Método que almacena un TypePersistence
	 * @param TypePersistence typePersistence
	 * @return TypePersistence
	 */
	private TypePersistence save(TypePersistence typePersistence) {
		Mapper<TypePersistence> mapper = new Mapper<TypePersistence>(typePersistence);
		mProvider.connect();
		typePersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		mProvider.disconnect();
		return typePersistence;
	}

}
