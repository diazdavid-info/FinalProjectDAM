/**
 * Clase que construye un address
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.pojo.builder;

public class AddressBuilder {
	
	/**
	 * Atributo que almacena la descripción
	 */
	private String mDescription;
	/**
	 * Atributo que almacena el ID
	 */
	private int mId;
	/**
	 * Atributo que almacena la población
	 */
	private String mPopulation;
	/**
	 * Atributo que almacena la provincia
	 */
	private String mProvince;
	
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
	 * @return AddressBuilder
	 */
	public AddressBuilder description(String mDescription) {
		this.mDescription = mDescription;
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
	 * @return AddressBuilder
	 */
	public AddressBuilder id(int mId) {
		this.mId = mId;
		return this;
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
	public AddressBuilder population(String mPopulation) {
		this.mPopulation = mPopulation;
		return this;
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
	 * @return AddressBuilder
	 */
	public AddressBuilder province(String mProvince) {
		this.mProvince = mProvince;
		return this;
	}
	
	

}
