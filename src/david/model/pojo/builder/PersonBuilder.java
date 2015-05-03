/**
 * Clase que construye un person
 * @author David Díaz García
 * @date 02-05-2015
 */
package david.model.pojo.builder;

public class PersonBuilder {
	
	/**
	 * Email de la persona
	 */
	private String mEmail;
	/**
	 * Nombre de la persona
	 */
	private String mName;
	/**
	 * Identificador de la persona
	 */
	private String mNif;
	/**
	 * Primer apellido de la persona
	 */
	private String mSurname1;
	/**
	 * Segundo apellido de la persona
	 */
	private String mSurname2;
	/**
	 * Identificador de la persona
	 */
	private int mId;
	
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
	 * @return PersonBuilder
	 */
	public PersonBuilder email(String mEmail) {
		this.mEmail = mEmail;
		return this;
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
	 * @return PersonBuilder
	 */
	public PersonBuilder name(String mName) {
		this.mName = mName;
		return this;
	}
	
	/**
	 * Método que obtiene el valor del atributo mNif
	 * @return int
	 */
	public String getNif() {
		return mNif;
	}
	
	/**
	 * Método que establece el valor del atributo mNif
	 * @param int mNif
	 * @return PersonBuilder
	 */
	public PersonBuilder nif(String mNif) {
		this.mNif = mNif;
		return this;
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
	 * @return PersonBuilder
	 */
	public PersonBuilder surname1(String mSurname1) {
		this.mSurname1 = mSurname1;
		return this;
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
	 * @return PersonBuilder
	 */
	public PersonBuilder surname2(String mSurname2) {
		this.mSurname2 = mSurname2;
		return this;
	}
	
	/**
	 * Método que obtiene el valor del atributo mId
	 * @return int
	 */
	public int getId() {
		return mId;
	}
	
	/**
	 * Método que establece el valor del atributo mId
	 * @param int mId
	 * @return PersonBuilder
	 */
	public PersonBuilder id(int mId) {
		this.mId = mId;
		return this;
	}
	
	

}
