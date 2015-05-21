/**
 * Interfaz para que implemente el modelo de address
 * @author David Díaz García
 * @date 20-05-2015
 */
package david.model.models;

import david.model.pojo.contact.Address;

public interface DAddressModel {

	/**
	 * Método que gestiona la creación de una dirección
	 * @param Address address
	 * @return Address
	 */
	public Address createAddress(Address address);

}
