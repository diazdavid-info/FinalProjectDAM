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
import david.model.pojo.users.Person;

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
	 * Atributo que almacena el Username
	 */
	private String mUsername;
	/**
	 * Atributo que almacena la persona
	 */
	private Person mPerson;
	
	/**
	 * Método que establece el valor al atributo mAddress
	 * @param Address address
	 * @return UserBuilder
	 */
	public UserBuilder setAddress(Address address){
		mAddress = address;
		return this;
	}
	
	/**
	 * Método que establece el valor al atributo mId
	 * @param int id
	 * @return UserBuilder
	 */
	public UserBuilder setId(int id){
		mId = id;
		return this;
	}
	
	/**
	 * Método que establece el valor al atributo mRole
	 * @param Role role
	 * @return UserBuilder
	 */
	public UserBuilder setRole(Role role){
		mRole = role;
		return this;
	}
	
	/**
	 * Método que establece el valor al atributo mPassword
	 * @param String password
	 * @return UserBuilder
	 */
	public UserBuilder setPassword(String password){
		mPassword = password;
		return this;
	}
	
	/**
	 * Método que establece el valor al atributo mTelephone
	 * @param List<Telephone> telephone
	 * @return UserBuilder
	 */
	public UserBuilder setTelephone(List<Telephone> telephone){
		mTelephone = telephone;
		return this;
	}
	
	/**
	 * Método que establece el valor al atributo mUsername
	 * @param String username
	 * @return UserBuilder
	 */
	public UserBuilder setUsername(String username){
		mUsername = username;
		return this;
	}
	
	/**
	 * Método que establece el valor del atributo mPerson
	 * @param Person person
	 * @return UserBuilder
	 */
	public UserBuilder setPerson(Person person){
		mPerson = person;
		return this;
	}
	
	/**
	 * Método que obtiene el valor del atributo mAddress
	 * @return Address
	 */
	public Address getAddress(){
		return mAddress;
	}
	
	/**
	 * Método que obtiene el valor del atributo mId
	 * @return int
	 */
	public int getId(){
		return mId;
	}
	
	/**
	 * Método que obtiene el valor del atributo mRole
	 * @return Role
	 */
	public Role getRole(){
		return mRole;
	}

	/**
	 * Método que obtiene el valor del atributo mPassword
	 * @return String
	 */
	public String getPassword(){
		return mPassword;
	}
	
	/**
	 * Método que obtiene el valor del atributo mTelephone
	 * @return
	 */
	public List<Telephone> getTelephone(){
		return mTelephone;
	}
	
	/**
	 * Método que obtiene el valor del atributo mUsername
	 * @return String
	 */
	public String getUsername(){
		return mUsername;
	}

	/**
	 * Método que obtiene la persona
	 * @return Person
	 */
	public Person getPerson() {
		return mPerson;
	}
}
