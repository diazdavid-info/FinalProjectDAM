/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class RolePersistence implements Cloneable{
	
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
	 * Atributo que almacena el description
	 */
	@column(name="mDescription", type="varchar")
	private String mDescription;
	
	/**
	 * Método que obtiene el nombre de la tabla
	 * @return String
	 */
	public String getTable(){
		return "role";
	}
	
	/**
	 * Método que clona el objeto
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public RolePersistence clone() throws CloneNotSupportedException{
		return (RolePersistence) super.clone();
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
