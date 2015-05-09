/**
 * Clase que transforma la entidad Address
 * @author David Diaz Garcia
 * @date 03-05-2015
 */
package david.model.transformer;

import david.model.persistence.AddressPersistence;
import david.model.pojo.builder.AddressBuilder;
import david.model.pojo.contact.Address;

public class AddressTransformer implements IAddressTransformer{

	/**
	 * Método que transforma la entidad Address en la persistencia Address
	 * @param Address address
	 * @return AddressPersistence 
	 */
	public AddressPersistence entityToPersistence(Address address){
		AddressPersistence addressPersistence = new AddressPersistence();
		addressPersistence.setDescription(address.getDescription());
		
		if(address.getId() != 0){
			addressPersistence.setId(address.getId());
		}
		
		addressPersistence.setPopulation(address.getPopulation());
		addressPersistence.setProvince(address.getProvince());
		return addressPersistence;
		
	}
	
	/**
	 * Método que transforma la persistencia de Address en la entidad Address
	 * @param AddressPersistence addressPersistence
	 * @return Address
	 */
	public Address persistenceToEntity(AddressPersistence addressPersistence){
		AddressBuilder addressBuilder = new AddressBuilder();
		addressBuilder
		.description(addressPersistence.getDescription())
		.id(addressPersistence.getId())
		.population(addressPersistence.getPopulation())
		.province(addressPersistence.getProvince());
		return new Address(addressBuilder);
	}
}
