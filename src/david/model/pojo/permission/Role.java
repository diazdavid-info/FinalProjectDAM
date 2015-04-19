package david.model.pojo.permission;

import java.util.List;


/**
 * Clase Rol
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:41
 */
public class Role {

	/**
	 * Descripción del rol
	 */
	private String mDescription;
	/**
	 * Lista de funcionalidades del rol
	 */
	private List<Functionality> mFunctionality;
	/**
	 * Identificador del rol
	 */
	private int mId;
	/**
	 * Nombre del rol
	 */
	private String mNameRol;

	public Role(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Descripción del rol
	 */
	public String getDescription(){
		return mDescription;
	}

	/**
	 * Lista de funcionalidades del rol
	 */
	public List<Functionality> getFunctionality(){
		return mFunctionality;
	}

	/**
	 * Identificador del rol
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Nombre del rol
	 */
	public String getNameRol(){
		return mNameRol;
	}

	/**
	 * Descripción del rol
	 * 
	 * @param newVal
	 */
	public void setDescription(String newVal){
		mDescription = newVal;
	}

	/**
	 * Lista de funcionalidades del rol
	 * 
	 * @param newVal
	 */
	public void setFunctionality(List<Functionality> newVal){
		mFunctionality = newVal;
	}

	/**
	 * Identificador del rol
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

	/**
	 * Nombre del rol
	 * 
	 * @param newVal
	 */
	public void setNameRol(String newVal){
		mNameRol = newVal;
	}

}