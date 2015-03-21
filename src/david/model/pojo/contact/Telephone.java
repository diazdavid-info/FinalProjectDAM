package david.model.pojo.contact;


/**
 * Clase teléfono
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:43
 */
public class Telephone {

	/**
	 * Identificador del teléfono
	 */
	private int mId;
	/**
	 * Teléfono
	 */
	private String mTelephone;
	/**
	 * Tipo del teléfono
	 */
	private TypeTelephone mType;

	public Telephone(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Identificador del teléfono
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Teléfono
	 */
	public String getTelephone(){
		return mTelephone;
	}

	/**
	 * Tipo del teléfono
	 */
	public TypeTelephone getType(){
		return mType;
	}

	/**
	 * Identificador del teléfono
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

	/**
	 * Teléfono
	 * 
	 * @param newVal
	 */
	public void setTelephone(String newVal){
		mTelephone = newVal;
	}

	/**
	 * Tipo del teléfono
	 * 
	 * @param newVal
	 */
	public void setType(TypeTelephone newVal){
		mType = newVal;
	}

}