/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 23-04-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class UserPersistence implements Cloneable{

	/**
	 * Atributo que almacena el ID
	 */
	@column(name="mId", type="int")
	private Integer mId;
	/**
	 * Atributo que almacena el username
	 */
	@column(name="mUserName", type="varchar")
	private String mUsername;
	/**
	 * Atributo que almacena la password
	 */
	@column(name="mPassword", type="char")
	private String mPassword;
	/**
	 * Atributo que almacena al ID de address
	 */
	@column(name="mAddress", type="int")
	private Integer mAddress;
	/**
	 * Atributo que almacena el ID de rol
	 */
	@column(name="mRole", type="int")
	private Integer mRole;
	/**
	 * Atributo que almacena el ID de person
	 */
	@column(name="mIdPerson", type="int")
	private Integer mIdPerson;
	/**
	 * Atributo que almacena le ID del school
	 */
	@column(name="mIdSchool", type="int")
	private Integer mIdSchool;
	
	/**
	 * Método que devuelve el nombre de la tabla
	 * @return
	 */
	public String getTable(){
		return "user";
	}
	
	/**
	 * Método que obtiene le valor del atributo mId
	 * @return Integer
	 */
	public Integer getId() {
		return mId;
	}
	
	/**
	 * Método que establece el valor del atributo mId
	 * @param Integer mId
	 */
	public void setId(Integer mId) {
		this.mId = mId;
	}
	
	/**
	 * Método que obtiene el valor del atributo mUsername
	 * @return String
	 */
	public String getUsername() {
		return mUsername;
	}
	
	/**
	 * Método establece el valor del atributo mUsername
	 * @param String mUsername
	 */
	public void setUsername(String mUsername) {
		this.mUsername = mUsername;
	}
	
	/**
	 * Método que obtiene el valor del atributo mPassword
	 * @return String
	 */
	public String getPassword() {
		return mPassword;
	}
	
	/**
	 * Método que establece el valor del atributo mPassword
	 * @param String mPassword
	 */
	public void setPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	
	/**
	 * Método que obtiene el valor del atributo mAddress
	 * @return int
	 */
	public int getAddress() {
		return mAddress;
	}
	
	/**
	 * Método que establece el valor del atributo mAddress
	 * @param int mAddress
	 */
	public void setAddress(int mAddress) {
		this.mAddress = mAddress;
	}
	
	/**
	 * Método que obtiene el valor del atributo mRole
	 * @return int
	 */
	public int getRole() {
		return mRole;
	}
	
	/**
	 * Método que establece el valor del atributo mRole
	 * @param int mRole
	 */
	public void setRole(int mRole) {
		this.mRole = mRole;
	}
	
	/**
	 * Método que obtiene el valor del atributo mIdPerson
	 * @return int
	 */
	public int getIdPerson() {
		return mIdPerson;
	}
	
	/**
	 * Método que obtiene el valor del atributo mIdPerson
	 * @param int mIdPerson
	 */
	public void setIdPerson(int mIdPerson) {
		this.mIdPerson = mIdPerson;
	}
	
	/**
	 * Método que obtiene el valor del atributo mIdSchool
	 * @return int
	 */
	public int getIdSchool() {
		return mIdSchool;
	}
	
	/**
	 * Método que establece el valor del atributo mIdSchool
	 * @param mIdSchool
	 */
	public void setIdSchool(int mIdSchool) {
		this.mIdSchool = mIdSchool;
	}
}
