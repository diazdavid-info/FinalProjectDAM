/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 02-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class PersonPersistence implements Cloneable{
	
	/**
	 * Atributo que almacena el ID
	 */
	@column(name="mId", type="int")
	private Integer mId;
	/**
	 * Atributo que almacena el name
	 */
	@column(name="mName", type="varchar")
	private String mName;
	/**
	 * Atributo que almacena el NIF
	 */
	@column(name="mNif", type="varchar")
	private String mNif;
	/**
	 * Atributo que almacena el Surname
	 */
	@column(name="mSurname1", type="varchar")
	private String mSurname1;
	/**
	 * Atributo que almacena el Surname2
	 */
	@column(name="mSurname2", type="varchar")
	private String mSurname2;
	/**
	 * Atributo que almacena el e-mail
	 */
	@column(name="mEmail", type="varchar")
	private String mEmail;
	
	/**
	 * Método que obtiene el nombre de la tabla
	 * @return String
	 */
	public String getTable(){
		return "person";
	}
	
	/**
	 * Método que obtiene el valor del atributo mId
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
	 * Método que obtiene el valor del atributo mName
	 * @return String
	 */
	public String getName() {
		return mName;
	}
	
	/**
	 * Método que establece el valor del atributo mName
	 * @param String mName
	 */
	public void setName(String mName) {
		this.mName = mName;
	}
	
	/**
	 * Método que obtiene el valor del atributo mNif
	 * @return String
	 */
	public String getNif() {
		return mNif;
	}
	
	/**
	 * Método que establece el valor del atributo mNif
	 * @param String mNif
	 */
	public void setNif(String mNif) {
		this.mNif = mNif;
	}
	
	/**
	 * Método que obtiene el valor del atributo mSurname1
	 * @return String
	 */
	public String getSurname1() {
		return mSurname1;
	}
	
	/**
	 * Método que establece el valor del atributo mSurname1
	 * @param String mSurname1
	 */
	public void setSurname1(String mSurname1) {
		this.mSurname1 = mSurname1;
	}
	
	/**
	 * Método que obtiene el valor del atributo mSurname2
	 * @return String
	 */
	public String getSurname2() {
		return mSurname2;
	}
	
	/**
	 * Método que establece el valor del atributo mSurname2
	 * @param String mSurname2
	 */
	public void setmSurname2(String mSurname2) {
		this.mSurname2 = mSurname2;
	}
	
	/**
	 * Método que obtiene el valor del atributo mEmail
	 * @return String
	 */
	public String getEmail() {
		return mEmail;
	}
	
	/**
	 * Método que establece el valor del atributo mEmail
	 * @param String mEmail
	 */
	public void setEmail(String mEmail) {
		this.mEmail = mEmail;
	}
	
	/**
	 * Método que clona el objeto
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public PersonPersistence clone() throws CloneNotSupportedException{
		return (PersonPersistence) super.clone();
	}

	
}
