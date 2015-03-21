package david.model.pojo.permission;


/**
 * Clase de funcionalidades
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:40
 */
public class Functionality {

	/**
	 * Descripción de la funcionalidad
	 */
	private String mDescription;
	/**
	 * Identificador de la funcionalidad
	 */
	private int mId;
	/**
	 * Nombre de la funcionalidad
	 */
	private String mName;

	public Functionality(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Descripción de la funcionalidad
	 */
	public String getDescription(){
		return mDescription;
	}

	/**
	 * Identificador de la funcionalidad
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Nombre de la funcionalidad
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Descripción de la funcionalidad
	 * 
	 * @param newVal
	 */
	public void setDescription(String newVal){
		mDescription = newVal;
	}

	/**
	 * Identificador de la funcionalidad
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

	/**
	 * Nombre de la funcionalidad
	 * 
	 * @param newVal
	 */
	public void setName(String newVal){
		mName = newVal;
	}

}