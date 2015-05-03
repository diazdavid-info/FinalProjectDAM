/**
 * Intefaz que define el comportamiento de los transformadores de Address
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.transformer;

import david.model.persistence.AddressPersistence;
import david.model.pojo.contact.Address;

public interface IAddressTransformer {
	
	/**
	 * Método que transforma la entidad Address en la persistencia Address
	 * @param Address address
	 * @return AddressPersistence 
	 */
	public AddressPersistence entityToPersistence(Address address);
	
	/**
	 * Método que transforma la persistencia de Address en la entidad Address
	 * @param AddressPersistence addressPersistence
	 * @return Address
	 */
	public Address persistenceToEntity(AddressPersistence addressPersistence);

}
