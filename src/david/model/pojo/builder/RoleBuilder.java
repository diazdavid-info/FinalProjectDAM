/**
 * Clase que construye un role
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.pojo.builder;

import java.util.List;

import david.model.pojo.permission.Functionality;

public class RoleBuilder {
	
	/**
	 * Atributo que almacena la descripcion
	 */
	private String mDescription;
	/**
	 * Atributo que almacena el listado de funcionalidades
	 */
	private List<Functionality> mFunctionality;
	/**
	 * Atributo que almacena el ID
	 */
	private int mId;
	/**
	 * Atributo que almacena el nombre del rol
	 */
	private String mNameRol;
	
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
	 * @return RoleBuilder
	 */
	public RoleBuilder description(String mDescription) {
		this.mDescription = mDescription;
		return this;
	}
	
	/**
	 * Método que obtiene el valor del atributo mFuncionality
	 * @return List<Functionality>
	 */
	public List<Functionality> getFunctionality() {
		return mFunctionality;
	}
	
	/**
	 * Método que establece el valor del atributo mFuncionality
	 * @param List<Functionality> mFunctionality
	 * @return RoleBuilder
	 */
	public RoleBuilder functionality(List<Functionality> mFunctionality) {
		this.mFunctionality = mFunctionality;
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
	 * @return RoleBuilder
	 */
	public RoleBuilder id(int mId) {
		this.mId = mId;
		return this;
	}
	
	/**
	 * Método que obtiene el valor del atributo mNameRol
	 * @return String
	 */
	public String getNameRol() {
		return mNameRol;
	}
	
	/**
	 * Método que establece el valor del atributo mNameRol
	 * @param String mNameRol
	 * @return RoleBuilder
	 */
	public RoleBuilder nameRol(String mNameRol) {
		this.mNameRol = mNameRol;
		return this;
	}
	
	

}
