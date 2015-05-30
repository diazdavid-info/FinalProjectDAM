/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 30-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class UserModulePersistence implements Cloneable {

	/**
	 * Atributo que almacena el ID del usuario
	 */
	@column(name = "mIdUser", type = "int")
	private Integer mUserId;
	/**
	 * Atributo que almacena el ID del módulo
	 */
	@column(name = "mIdModule", type = "int")
	private Integer mModuleId;

	/**
	 * Método que obtiene el nombre de la tabla
	 * 
	 * @return String
	 */
	public String getTable() {
		return "userModule";
	}

	/**
	 * Método que clona el objeto
	 * 
	 * @throws CloneNotSupportedException
	 */
	@Override
	public UserModulePersistence clone() throws CloneNotSupportedException {
		return (UserModulePersistence) super.clone();
	}

	/**
	 * Método que obtiene el valor del atributo mUserId
	 * 
	 * @return Integer
	 */
	public Integer getUserId() {
		return mUserId;
	}

	/**
	 * Método que establece el valor del atributo mUserId
	 * 
	 * @param Integer
	 *            userId
	 */
	public void setUserId(Integer userId) {
		mUserId = userId;
	}

	/**
	 * Método que obtiene el valor del atributo mModuleId
	 * 
	 * @return Integer
	 */
	public Integer getModuleId() {
		return mModuleId;
	}

	/**
	 * Método que establece el valor del atributo mModuleId
	 * 
	 * @param Integer
	 *            moduleId
	 */
	public void setModuleId(Integer moduleId) {
		mModuleId = moduleId;
	}

}
