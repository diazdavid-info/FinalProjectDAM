package david.model.pojo.school;

import java.util.List;

import david.model.pojo.builder.SchoolBuilder;
import david.model.pojo.contact.Address;

/**
 * Clase Instituto
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:34
 */
public class School {

	/**
	 * Dirección school
	 */
	private Address mAddress;
	/**
	 * Código de identificación del intituto
	 */
	private String mCodeIdentification;
	/**
	 * Lista de ciclos
	 */
	private List<Cycle> mCycle;
	/**
	 * Identificador del instituto
	 */
	private int mId;
	/**
	 * Nombre del School
	 */
	private String mName;

	public School(SchoolBuilder schoolBuilder){
		mAddress = schoolBuilder.getAddress();
		mCodeIdentification = schoolBuilder.getCodeIdentification();
		mCycle = schoolBuilder.getCycle();
		mId = schoolBuilder.getId();
		mName = schoolBuilder.getName();
	}

	public void finalize() throws Throwable {
		
	}
	
	/**
	 * Dirección School
	 */
	public Address getAddress(){
		return mAddress;
	}

	/**
	 * Código de identificación del intituto
	 */
	public String getCodeIdentification(){
		return mCodeIdentification;
	}

	/**
	 * Lista de ciclo
	 */
	public List<Cycle> getCycle(){
		return mCycle;
	}

	/**
	 * Identificador del instituto
	 */
	public int getId(){
		return mId;
	}
	
	/**
	 * Nombre del instituto
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Dirección School
	 * @param Address address
	 */
	public void setSchool(Address address){
		mAddress = address;
	}
	
	/**
	 * Código de identificación del intituto
	 * 
	 * @param newVal
	 */
	public void setCodeIdentification(String newVal){
		mCodeIdentification = newVal;
	}

	/**
	 * Lista de ciclo
	 * 
	 * @param newVal
	 */
	public void setCycle(List<Cycle> newVal){
		mCycle = newVal;
	}

	/**
	 * Identificador del instituto
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}
	
	/**
	 * Nombre del instituto
	 * 
	 * @param newVal
	 */
	public void setName(String newVal){
		mName = newVal;
	}

}