/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 18-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class ModulePersistence implements Cloneable{
	
	/**
	 * Atributo que almacena el ID
	 */
	@column(name="mId", type="int")
	private Integer mId;
	/**
	 * Atributo que almacena las horas
	 */
	@column(name="mHour", type="int")
	private Integer mHour;
	/**
	 * Atributo que almacena el codigo interno
	 */
	@column(name="mCodeIdentification", type="varchar")
	private String mCodeIdentification;
	/**
	 * Atributo que almacena el nombre
	 */
	@column(name="mName", type="varchar")
	private String mName;
	/**
	 * Atributo que almacena el id del profesor
	 */
	@column(name="mTeacher", type="int")
	private Integer mTeacher;
	/**
	 * Atributo que almacena el id del ciclo
	 */
	@column(name="mCycle", type="int")
	private Integer mCycle;
	
	
	/**
	 * Método que obtiene el nombre de la tabla
	 * @return String
	 */
	public String getTable(){
		return "module";
	}
	
	/**
	 * Método que clona el objeto
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public ModulePersistence clone() throws CloneNotSupportedException{
		return (ModulePersistence) super.clone();
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
	 * Método que obtiene el valor del atributo mCodeIdentification
	 * @return String
	 */
	public String getCode(){
		return mCodeIdentification;
	}
	
	/**
	 * Método que establece el valor del atributo mCodeIdentification
	 * @param String code
	 */
	public void setCode(String code){
		mCodeIdentification = code;
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
	 * Método que obtiene el valor del atributo mTeacher
	 * @return Integer
	 */
	public Integer getTeacher(){
		return mTeacher;
	}
	
	/**
	 * Método que establece el valor del atributo mTeacher
	 * @param Integer teacher
	 */
	public void setTeacher(Integer teacher){
		mTeacher = teacher;
	}
	
	/**
	 * Método que obtiene el valor del atributo mCycle
	 * @return Integer
	 */
	public Integer getCycle(){
		return mCycle;
	}
	
	/**
	 * Método que establece el valor del atributo mCycle
	 * @param Integer cycle
	 */
	public void setCycle(Integer cycle){
		mCycle = cycle;
	}
	

}
