package david.model.pojo.users;

import java.util.List;

import david.model.pojo.builder.UserBuilder;
import david.model.pojo.contact.Address;
import david.model.pojo.contact.Telephone;
import david.model.pojo.permission.Role;


/**
 * Clase de usuarios de la aplicación
 * @author David Díaz
 * @version 1.0
 * @updated 13-mar-2015 15:53:23
 */
public class User {

	/**
	 * Dirección del usuario
	 */
	private Address mAddress;
	/**
	 * Identificador del usuario
	 */
	private int mId;
	/**
	 * Role del usuario
	 */
	private Role mRole;
	/**
	 * Contraseña de login
	 */
	private String mPassword;
	/**
	 * Lista de teléfonos
	 */
	private List<Telephone> mTelephone;
	/**
	 * Nombre de usuario
	 */
	private String mUsername;

	public User(UserBuilder userBuilder){
		mAddress = userBuilder.getAddress();
		mId = userBuilder.getId();
		mRole = userBuilder.getRole();
		mPassword = userBuilder.getPassword();
		mTelephone = userBuilder.getTelephone();
		mUsername = userBuilder.getUsername();
	}

	public void finalize() throws Throwable {

	}

	/**
	 * Dirección del usuario
	 */
	public Address getAddress(){
		return mAddress;
	}

	/**
	 * Identificador del usuario
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Role del usuario
	 */
	public Role getRole(){
		return mRole;
	}

	/**
	 * Dirección del usuario
	 * 
	 * @param newVal
	 */
	public void setAddress(Address newVal){
		mAddress = newVal;
	}

	/**
	 * Identificador del usuario
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

	/**
	 * Role del usuario
	 * 
	 * @param newVal
	 */
	public void setRole(Role newVal){
		mRole = newVal;
	}

	/**
	 * Contraseña de login
	 */
	public String getPassword(){
		return mPassword;
	}

	/**
	 * Lista de teléfonos
	 */
	public List<Telephone> getTelephone(){
		return mTelephone;
	}

	/**
	 * Contraseña de login
	 * 
	 * @param newVal
	 */
	public void setPassword(String newVal){
		mPassword = newVal;
	}

	/**
	 * Lista de teléfonos
	 * 
	 * @param newVal
	 */
	public void setTelephone(List<Telephone> newVal){
		mTelephone = newVal;
	}
	
	/**
	 * Nombre usuario del login
	 * 
	 * @param newVal
	 */
	public void setUsername(String newVal){
		mUsername = newVal;
	}
	
	/**
	 * Nombre usuario del login
	 */
	public String getUsername(){
		return mUsername;
	}

}