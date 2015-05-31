/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 31-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class FunctionalityPersistence implements Cloneable {

	/**
	 * Atributo que almacena el ID
	 */
	@column(name = "mId", type = "int")
	private Integer mId;
	/**
	 * Atributo que almacena el nombre
	 */
	@column(name = "mName", type = "varchar")
	private String mName;
	/**
	 * Atributo que almacena el descripción
	 */
	@column(name = "mDescription", type = "varchar")
	private String mDescription;

	/**
	 * Método que obtiene el nombre de la tabla
	 * 
	 * @return String
	 */
	public String getTable() {
		return "functionality";
	}

	/**
	 * Método que clona el objeto
	 * 
	 * @throws CloneNotSupportedException
	 */
	@Override
	public FunctionalityPersistence clone() throws CloneNotSupportedException {
		return (FunctionalityPersistence) super.clone();
	}

	/**
	 * Método que obtiene el valor del atributo mId
	 * 
	 * @return Integer
	 */
	public Integer getId() {
		return mId;
	}

	/**
	 * Método que establece el valor del atributo mId
	 * 
	 * @param Integer
	 *            id
	 */
	public void setId(Integer id) {
		mId = id;
	}

	/**
	 * Método que obtiene el valor del atributo mName
	 * 
	 * @return String
	 */
	public String getName() {
		return mName;
	}

	/**
	 * Método que establece el valor del atributo mName
	 * 
	 * @param String
	 *            name
	 */
	public void setName(String name) {
		mName = name;
	}

	/**
	 * Método que obtiene el valor del atributo mDescription
	 * 
	 * @return String
	 */
	public String getDescription() {
		return mDescription;
	}

	/**
	 * Método que establece el valor del atributo mDescription
	 * 
	 * @param String
	 *            description
	 */
	public void setDescription(String description) {
		mDescription = description;
	}

}
