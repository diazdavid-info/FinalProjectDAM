/**
 * Repositorio para la persistencia de Address
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.repository;

import david.model.mapper.Mapper;
import david.model.persistence.AddressPersistence;
import david.model.provider.DProvider;

public class AddressRepository {
	
	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;
	
	/**
	 * Constructor
	 * @param DProvider provider
	 */
	public AddressRepository(DProvider provider) {
		mProvider = provider;
	}
	
	/**
	 * Método que guarda un addressPersistence
	 * @param AddressPersistence addressPersistence
	 * @return AddressPersistence
	 */
	public AddressPersistence storage(AddressPersistence addressPersistence){
		return (addressPersistence.getId() == null) ? save(addressPersistence) : update(addressPersistence);
	}

	/**
	 * Método que actualiza un addressPersistence
	 * @param AddressPersistence addressPersistence
	 * @return AddressPersistence
	 */
	private AddressPersistence update(AddressPersistence addressPersistence) {
		return null;
	}

	/**
	 * Método que almacena un addressPersistence
	 * @param AddressPersistence addressPersistence
	 * @return AddressPersistence
	 */
	private AddressPersistence save(AddressPersistence addressPersistence) {
		mProvider.connect();
		Mapper<AddressPersistence> mapper = new Mapper<AddressPersistence>(addressPersistence);
		addressPersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		mProvider.disconnect();
		return addressPersistence;
	}
}
