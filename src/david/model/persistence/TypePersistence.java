package david.model.persistence;

import david.model.annotation.column;

public class TypePersistence implements Cloneable{
	
	/**
	 * Atributo que almacena el ID
	 */
	@column(name="mId", type="int")
	private Integer mId;
	/**
	 * Atributo que almacena el name
	 */
	@column(name="mName", type="varchar")
	private String mName;
	/**
	 * Atributo que almacena el description
	 */
	@column(name="mDescription", type="varchar")
	private String mDescription;
	
	/**
	 * Método que obtiene el nombre de la tabla
	 * @return String
	 */
	public String getTable(){
		return "type";
	}
	
	/**
	 * Método que clona el objeto
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public TypePersistence clone() throws CloneNotSupportedException{
		return (TypePersistence) super.clone();
	}
	
	/**
	 * Método que obtiene el valor del atributo mId
	 * @return Integer
	 */
	public Integer getId(){
		return mId;
	}
	
	/**
	 * Método que establece el valor del atributo mId
	 * @param Integer id
	 */
	public void setId(Integer id){
		mId = id;
	}
	
	/**
	 * Método que obtiene el valor del atributo mName
	 * @return String
	 */
	public String getName(){
		return mName;
	}
	
	/**
	 * Método que establece el valor del atributo mName
	 * @param String name
	 */
	public void setName(String name){
		mName = name;
	}
	
	/**
	 * Método que obtiene el valor del atributo mDescription
	 * @return String
	 */
	public String getDescription(){
		return mDescription;
	}
	
	/**
	 * Método que estabelce el valor del atributo mDescription
	 * @param String description
	 */
	public void setDescription(String description){
		mDescription = description;
	}

}
