/**
 * Clase que construye un user
 * @author David Díaz García
 * @date 19-04-2015
 * @version 1.0
 */
package david.model.pojo.builder;

import java.util.List;

import david.model.pojo.contact.Address;
import david.model.pojo.contact.Telephone;
import david.model.pojo.permission.Role;

public class UserBuilder {
	
	/**
	 * Atributo que almacena la dirección
	 */
	private Address mAddress;
	/**
	 * Atributo que almacena el ID
	 */
	private int mId;
	/**
	 * Atributo que almacena el rol
	 */
	private Role mRole;
	/**
	 * Atributo que almacena el password
	 */
	private String mPassword;
	/**
	 * Atributo que almacena el lista de telefonos
	 */
	private List<Telephone> mTelephone;
	
	/**
	 * Método que establece el valor al atributo mAddress
	 * @param Address address
	 * @return UserBuilder
	 */
	public UserBuilder setAddress(Address address){
		mAddress = address;
		return this;
	}
	
	public UserBuilder setId(int id){
		mId = id;
		return this;
	}

}
