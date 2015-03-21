package david.model.pojo.school;


/**
 * Clase que recoge el tipo de la sessión
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:39
 */
public class Type {

	/**
	 * Descripción del tipo
	 */
	private String mDescription;
	/**
	 * Identificador de la sessión
	 */
	private int mId;
	/**
	 * Nombre del tipo
	 */
	private String mName;

	public Type(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Descripción del tipo
	 */
	public String getDescription(){
		return mDescription;
	}

	/**
	 * Identificador de la sessión
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Nombre del tipo
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Descripción del tipo
	 * 
	 * @param newVal
	 */
	public void setDescription(String newVal){
		mDescription = newVal;
	}

	/**
	 * Identificador de la sessión
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

	/**
	 * Nombre del tipo
	 * 
	 * @param newVal
	 */
	public void setName(String newVal){
		mName = newVal;
	}

}