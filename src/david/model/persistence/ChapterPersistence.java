/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class ChapterPersistence implements Cloneable{
	
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
	 * Atributo que almacena el hour
	 */
	@column(name="mHour", type="int")
	private Integer mHour;
	/**
	 * Atributo que almacena el id de Module
	 */
	@column(name="mIdModule", type="int")
	private Integer mModule;
	
	/**
	 * Método que obtiene el nombre de la tabla
	 * @return String
	 */
	public String getTable(){
		return "chapter";
	}
	
	/**
	 * Método que clona el objeto
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public ChapterPersistence clone() throws CloneNotSupportedException{
		return (ChapterPersistence) super.clone();
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
	 * Método que obtiene el valor del atributo mHour
	 * @return Integer
	 */
	public Integer getHour(){
		return mHour;
	}
	
	/**
	 * Método que establece el valor del atributo mHour
	 * @param Integer hour
	 */
	public void setHour(Integer hour){
		mHour = hour;
	}
	
	/**
	 * Método que obtiene el valor del atributo mModule
	 * @return Integer
	 */
	public Integer getModule(){
		return mModule;
	}
	
	/**
	 * Método que establece el valor del atributo mModule
	 * @param Integer module
	 */
	public void setModule(Integer module){
		mModule = module;
	}

}
