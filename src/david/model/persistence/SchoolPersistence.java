/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class SchoolPersistence implements Cloneable{
	
	/**
	 * Atributo que almacena el ID
	 */
	@column(name="mId", type="int")
	private Integer mId;
	/**
	 * Atributo que almacena el code identification
	 */
	@column(name="mCodeIdentification", type="varchar")
	private String mCodeIdentification;
	/**
	 * Atributo que almacena el name
	 */
	@column(name="mName", type="varchar")
	private String mName;
	/**
	 * Atributo que almacena el description
	 */
	@column(name="mIdAddress", type="int")
	private Integer mIdAddress;
	
	/**
	 * Método que obtiene el nombre de la tabla
	 * @return String
	 */
	public String getTable(){
		return "school";
	}
	
	/**
	 * Método que clona el objeto
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public SchoolPersistence clone() throws CloneNotSupportedException{
		return (SchoolPersistence) super.clone();
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
	 * Método que obtiene el valor del atributo mCodeIdentification
	 * @return String
	 */
	public String getCodeIdentification() {
		return mCodeIdentification;
	}

	/**
	 * Método que establece el valor del atributo mCodeIdentification
	 * @param String mCodeIdentification
	 */
	public void setCodeIdentification(String mCodeIdentification) {
		this.mCodeIdentification = mCodeIdentification;
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
	 * Método que obtiene el valor del atributo mIdAddress
	 * @return Integer
	 */
	public Integer getIdAddress() {
		return mIdAddress;
	}

	/**
	 * Método que establece el valor del atributo mIdAddress
	 * @param Integer mIdAddress
	 */
	public void setIdAddress(Integer mIdAddress) {
		this.mIdAddress = mIdAddress;
	}
	
	

}
