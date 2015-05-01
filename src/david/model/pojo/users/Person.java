package david.model.pojo.users;



/**
 * Clase Persona
 * @author David Díaz
 * @version 1.0
 * @updated 13-mar-2015 15:53:23
 */
public class Person extends User {

	/**
	 * Email de la persona
	 */
	private String mEmail;
	/**
	 * Nombre de la persona
	 */
	private String mName;
	/**
	 * Identificador de la persona
	 */
	private int mNif;
	/**
	 * Primer apellido de la persona
	 */
	private String mSurname1;
	/**
	 * Segundo apellido de la persona
	 */
	private String mSurname2;
	/**
	 * Identificador de la persona
	 */
	private int mId;

	public Person(){
		super(null);
	}

	public void finalize() throws Throwable {

	}

	/**
	 * Email de la persona
	 */
	public String getEmail(){
		return mEmail;
	}

	/**
	 * Nombre de la persona
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Identificador de la persona
	 */
	public int getNif(){
		return mNif;
	}

	/**
	 * Primer apellido de la persona
	 */
	public String getSurname1(){
		return mSurname1;
	}

	/**
	 * Segundo apellido de la persona
	 */
	public String getSurname2(){
		return mSurname2;
	}

	/**
	 * Email de la persona
	 * 
	 * @param newVal
	 */
	public void setEmail(String newVal){
		mEmail = newVal;
	}

	/**
	 * Nombre de la persona
	 * 
	 * @param newVal
	 */
	public void setName(String newVal){
		mName = newVal;
	}

	/**
	 * Identificador de la persona
	 * 
	 * @param newVal
	 */
	public void setNif(int newVal){
		mNif = newVal;
	}

	/**
	 * Primer apellido de la persona
	 * 
	 * @param newVal
	 */
	public void setSurname1(String newVal){
		mSurname1 = newVal;
	}

	/**
	 * Segundo apellido de la persona
	 * 
	 * @param newVal
	 */
	public void setSurname2(String newVal){
		mSurname2 = newVal;
	}

	/**
	 * Identificador de la persona
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Identificador de la persona
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

}