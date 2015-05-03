package david.model.pojo.contact;

import david.model.pojo.builder.AddressBuilder;


/**
 * Clase dirección
 * @author David Díaz
 * @version 1.0
 * @updated 13-mar-2015 15:53:42
 */
public class Address {

	/**
	 * Descripción de la dirección
	 */
	private String mDescription;
	/**
	 * Identificador de la dirección
	 */
	private int mId;
	/**
	 * Población de la dirección
	 */
	private String mPopulation;
	/**
	 * Provincia de la dirección
	 */
	private String mProvince;

	/**
	 * Constructor default
	 */
	public Address(){}
	
	/**
	 * Constructor con un parametro
	 * @param AddressBuilder addressBuilder
	 */
	public Address(AddressBuilder addressBuilder){
		mDescription = addressBuilder.getDescription();
		mId = addressBuilder.getId();
		mPopulation = addressBuilder.getPopulation();
		mProvince = addressBuilder.getProvince();
	}

	public void finalize() throws Throwable {

	}

	/**
	 * Descripción de la dirección
	 */
	public String getDescription(){
		return mDescription;
	}

	/**
	 * Identificador de la dirección
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Población de la dirección
	 */
	public String getPopulation(){
		return mPopulation;
	}

	/**
	 * Provincia de la dirección
	 */
	public String getProvince(){
		return mProvince;
	}

	/**
	 * Descripción de la dirección
	 * 
	 * @param newVal
	 */
	public void setDescription(String newVal){
		mDescription = newVal;
	}

	/**
	 * Identificador de la dirección
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

	/**
	 * Población de la dirección
	 * 
	 * @param newVal
	 */
	public void setPopulation(String newVal){
		mPopulation = newVal;
	}

	/**
	 * Provincia de la dirección
	 * 
	 * @param newVal
	 */
	public void setProvince(String newVal){
		mProvince = newVal;
	}

}