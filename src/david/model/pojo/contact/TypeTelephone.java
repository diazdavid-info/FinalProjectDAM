package david.model.pojo.contact;


/**
 * Clase del tipo de teléfono
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:44
 */
public class TypeTelephone {

	/**
	 * Identificador del tipo
	 */
	private int mId;
	/**
	 * El tipo de teléfono
	 */
	private String mType;

	public TypeTelephone(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Identificador del tipo
	 */
	public int getId(){
		return mId;
	}

	/**
	 * El tipo de teléfono
	 */
	public String getType(){
		return mType;
	}

	/**
	 * Identificador del tipo
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

	/**
	 * El tipo de teléfono
	 * 
	 * @param newVal
	 */
	public void setType(String newVal){
		mType = newVal;
	}

}