/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class AddressPersistence implements Cloneable{
	
	/**
	 * Atributo que almacena el ID
	 */
	@column(name="mId", type="int")
	private Integer mId;
	/**
	 * Atributo que almacena el province
	 */
	@column(name="mProvince", type="varchar")
	private String mProvince;
	/**
	 * Atributo que almacena el population
	 */
	@column(name="mPopulation", type="varchar")
	private String mPopulation;
	/**
	 * Atributo que almacena el description
	 */
	@column(name="mDescription", type="varchar")
	private String mDescription;
	
	/**
	 * Método que obtiene el nombre de la tabla
	 * @return String
	 */
	public String getTable(){
		return "address";
	}
	
	/**
	 * Método que clona el objeto
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public AddressPersistence clone() throws CloneNotSupportedException{
		return (AddressPersistence) super.clone();
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
	 * Método que obtiene el valor del atributo mProvince
	 * @return String
	 */
	public String getProvince() {
		return mProvince;
	}

	/**
	 * Método que establece el valor del atributo mProvince
	 * @param String mProvince
	 */
	public void setProvince(String mProvince) {
		this.mProvince = mProvince;
	}

	/**
	 * Método que obtiene el valor del atributo mPopulation
	 * @return String
	 */
	public String getPopulation() {
		return mPopulation;
	}

	/**
	 * Método que establece el valor del atributo mPopulation
	 * @param String mPopulation
	 */
	public void setPopulation(String mPopulation) {
		this.mPopulation = mPopulation;
	}

	/**
	 * Método que obtiene el valor del atributo mDescription
	 * @return String
	 */
	public String getDescription() {
		return mDescription;
	}

	/**
	 * Método que establece el valor del atributo mDescription
	 * @param String mDescription
	 */
	public void setDescription(String mDescription) {
		this.mDescription = mDescription;
	}
	
	

}
