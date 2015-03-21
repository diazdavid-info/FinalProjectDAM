package david.model.pojo.school;

import java.util.List;

import david.model.pojo.users.Person;

/**
 * Clase ciclo
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:31
 */
public class Cycle {

	/**
	 * Identificador del ciclo
	 */
	private int mId;
	/**
	 * Identificador interno del ciclo
	 */
	private String mIdentification;
	/**
	 * Listado de módulos del ciclo
	 */
	private List<Module> mModule;
	/**
	 * Nombre del ciclo
	 */
	private String mName;
	/**
	 * Tutor del ciclo
	 */
	private Person mTutor;

	public Cycle(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Identificador del ciclo
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Identificador interno del ciclo
	 */
	public String getIdentification(){
		return mIdentification;
	}

	/**
	 * Listado de módulos del ciclo
	 */
	public List<Module> getModule(){
		return mModule;
	}

	/**
	 * Nombre del ciclo
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Tutor del ciclo
	 */
	public Person getTutor(){
		return mTutor;
	}

	/**
	 * Identificador del ciclo
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

	/**
	 * Identificador interno del ciclo
	 * 
	 * @param newVal
	 */
	public void setIdentification(String newVal){
		mIdentification = newVal;
	}

	/**
	 * Listado de módulos del ciclo
	 * 
	 * @param newVal
	 */
	public void setModule(List<Module> newVal){
		mModule = newVal;
	}

	/**
	 * Nombre del ciclo
	 * 
	 * @param newVal
	 */
	public void setName(String newVal){
		mName = newVal;
	}

	/**
	 * Tutor del ciclo
	 * 
	 * @param newVal
	 */
	public void setTutor(Person newVal){
		mTutor = newVal;
	}

}