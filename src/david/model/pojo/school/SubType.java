package david.model.pojo.school;

import david.model.pojo.builder.SubtypeBuilder;


/**
 * Clase que recoge los subtipos de los tipo de sessiones
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:37
 */
public class SubType {

	/**
	 * Descripción del subtipo
	 */
	private String mDescription;
	/**
	 * Identificador del subtipo
	 */
	private int mId;
	/**
	 * Nombre del subtipo
	 */
	private String mName;

	public SubType(SubtypeBuilder subtypeBuilder){
		mDescription = subtypeBuilder.getDescription();
		mId = subtypeBuilder.getId();
		mName = subtypeBuilder.getName();
	}

	public void finalize() throws Throwable {

	}

	/**
	 * Descripción del subtipo
	 */
	public String getDescription(){
		return mDescription;
	}

	/**
	 * Identificador del subtipo
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Nombre del subtipo
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Descripción del subtipo
	 * 
	 * @param newVal
	 */
	public void setDescription(String newVal){
		mDescription = newVal;
	}

	/**
	 * Identificador del subtipo
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

	/**
	 * Nombre del subtipo
	 * 
	 * @param newVal
	 */
	public void setName(String newVal){
		mName = newVal;
	}

}