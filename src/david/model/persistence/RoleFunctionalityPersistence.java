/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 02-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class RoleFunctionalityPersistence implements Cloneable {

	/**
	 * Atributo que almacena el id del rol
	 */
	@column(name = "mIdRol", type = "int")
	private Integer mIdRol;
	/**
	 * Atributo que almacena el id de functionality
	 */
	@column(name = "mIdFunctionality", type = "int")
	private Integer mIdFunctionality;

	/**
	 * Método que obtiene el nombre de la tabla
	 * 
	 * @return String
	 */
	public String getTable() {
		return "roleFunctionality";
	}

	/**
	 * Método que clona el objeto
	 * 
	 * @throws CloneNotSupportedException
	 */
	@Override
	public RoleFunctionalityPersistence clone() throws CloneNotSupportedException {
		return (RoleFunctionalityPersistence) super.clone();
	}

	/**
	 * Método que obtiene el valor del atributo mIdRole
	 * 
	 * @return Integer
	 */
	public Integer getIdRole() {
		return mIdRol;
	}

	/**
	 * Método que establece el valor del atributo mIdRole
	 * 
	 * @param Integer
	 *            idRole
	 */
	public void setIdRole(Integer idRole) {
		mIdRol = idRole;
	}

	/**
	 * Método que obtiene el valor del atributo mIdFunctionality
	 * 
	 * @return Integer
	 */
	public Integer getIdFunctionality() {
		return mIdFunctionality;
	}

	/**
	 * Método que establece el valor del atributo mIdFunctionality
	 * 
	 * @param Integer
	 *            idFunctionality
	 */
	public void setIdFunctionality(Integer idFunctionality) {
		mIdFunctionality = idFunctionality;
	}

}
