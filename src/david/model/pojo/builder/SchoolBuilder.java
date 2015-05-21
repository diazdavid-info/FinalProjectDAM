/**
 * Clase que construye un school
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.pojo.builder;

import java.util.List;

import david.model.pojo.contact.Address;
import david.model.pojo.school.Cycle;

public class SchoolBuilder {

	/**
	 * Atributo que almacena el valor de mAddress
	 */
	private Address mAddress;
	/**
	 * Atributo que almacena el valor de mCodeIdentification
	 */
	private String mCodeIdentification;
	/**
	 * Atributo que almacena el valor de mCycle
	 */
	private List<Cycle> mCycle;
	/**
	 * Atributo que almacena el valor de mId
	 */
	private int mId;
	/**
	 * Atributo que almacena el valor de mName
	 */
	private String mName;

	
	/**
	 * Método que obtiene el valor del atributo mAddress
	 * @return Address
	 */
	public Address getAddress(){
		return mAddress;
	}

	/**
	 * Método que obtiene el valor del atributo mCodeIdentification
	 * @return String
	 */
	public String getCodeIdentification(){
		return mCodeIdentification;
	}

	/**
	 * Método que obtiene el valor del atributo mCycle
	 * @return List<Cycle>
	 */
	public List<Cycle> getCycle(){
		return mCycle;
	}

	/**
	 * Método que obtiene el valor del atributo mId
	 * @return int
	 */
	public int getId(){
		return mId;
	}
	
	/**
	 * Método que obtiene el valor del atributo mName
	 * @return String
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Método que establece el valor del atributo mAddress
	 * @param Address address
	 * @return SchoolBuilder
	 */
	public SchoolBuilder address(Address address){
		mAddress = address;
		return this;
	}
	
	/**
	 * Método que establece el valor del atributo mCodeIdentification
	 * @param newVal
	 * @return SchoolBuilder
	 */
	public SchoolBuilder codeIdentification(String newVal){
		mCodeIdentification = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mCycle
	 * @param newVal
	 * @return SchoolBuilder
	 */
	public SchoolBuilder cycle(List<Cycle> newVal){
		mCycle = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mId
	 * @param newVal
	 * @return SchoolBuilder
	 */
	public SchoolBuilder id(int newVal){
		mId = newVal;
		return this;
	}
	
	/**
	 * Método que establece el valor al atributo mName
	 * @param newVal
	 * @return SchoolBuilder
	 */
	public SchoolBuilder name(String newVal){
		mName = newVal;
		return this;
	}
}
