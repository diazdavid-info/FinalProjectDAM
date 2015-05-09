package david.model.pojo.school;

import java.util.List;

import david.model.pojo.contact.Address;
import david.model.pojo.users.User;

/**
 * Clase Instituto
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:34
 */
public class School extends User {

	/**
	 * Dirección school
	 */
	private Address mAddress;
	/**
	 * Código de identificación del intituto
	 */
	private String mCodeIdentification;
	/**
	 * Lista de cursos
	 */
	private List<Course> mCourse;
	/**
	 * Identificador del instituto
	 */
	private int mId;

	public School(){
		super(null);
	}

	public void finalize() throws Throwable {
		super.finalize();
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
	 * Lista de cursos
	 */
	public List<Course> getCourse(){
		return mCourse;
	}

	/**
	 * Identificador del instituto
	 */
	public int getId(){
		return mId;
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
	 * Lista de cursos
	 * 
	 * @param newVal
	 */
	public void setCourse(List<Course> newVal){
		mCourse = newVal;
	}

	/**
	 * Identificador del instituto
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

}