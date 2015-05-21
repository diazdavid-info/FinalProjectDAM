/**
 * Modelo para todo lo relacionado con un address
 * @author David Díaz García
 * @date 20-05-2015
 */
package david.model.models;

import david.model.persistence.AddressPersistence;
import david.model.pojo.contact.Address;
import david.model.repository.AddressRepository;
import david.model.transformer.IAddressTransformer;

public class AddressModel implements DAddressModel{
	
	/**
	 * Atributo que almacena el transformador de direcciones
	 */
	private IAddressTransformer mIAddressTransformer;
	/**
	 * Atributo que almacena el repositorio de direcciones
	 */
	private AddressRepository mAddressRepository;
	
	/**
	 * Constructor
	 * @param addressTransformer
	 * @param addressRepository
	 */
	public AddressModel(IAddressTransformer addressTransformer, AddressRepository addressRepository) {
		mIAddressTransformer = addressTransformer;
		mAddressRepository = addressRepository;
	}
	
	/**
	 * Método que gestiona la creación de una dirección
	 * @param Address address
	 * @return Address
	 */
	public Address createAddress(Address address){
		AddressPersistence addressPersistence = mIAddressTransformer.entityToPersistence(address);
		return mIAddressTransformer.persistenceToEntity(mAddressRepository.storage(addressPersistence));
	}


}
