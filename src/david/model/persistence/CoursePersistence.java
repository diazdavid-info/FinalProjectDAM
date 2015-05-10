/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;


public class CoursePersistence implements Cloneable{
	
	/**
	 * Atributo que almacena el ID
	 */
	@column(name="mId", type="int")
	private Integer mId;
	/**
	 * Atributo que almacena el año de inicio
	 */
	@column(name="mStartYear", type="int")
	private Integer mStartYear;
	/**
	 * Atributo que almacena el año de fin
	 */
	@column(name="mFinishYear", type="int")
	private Integer mFinishYear;
	
	/**
	 * Método que obtiene el nombre de la tabla
	 * @return String
	 */
	public String getTable(){
		return "course";
	}
	
	/**
	 * Método que clona el objeto
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public CoursePersistence clone() throws CloneNotSupportedException{
		return (CoursePersistence) super.clone();
	}

	/**
	 * Método que obtiene el valor del atributo mId
	 * @return Integer
	 */
	public Integer getId() {
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
	 * Método que obtiene el valor del atributo mStartYear
	 * @return Integer
	 */
	public Integer getStartYear() {
		return mStartYear;
	}
	
	/**
	 * Método que establece el valor del atributo mStartYear
	 * @param Integer startYear
	 */
	public void setStartYear(Integer startYear){
		mStartYear = startYear;
	}

	/**
	 * Método que obtiene el valor del atributo mFinishYear
	 * @return Integer
	 */
	public Integer getFinishYear() {
		return mFinishYear;
	}
	
	/**
	 * Método que establece el valor del atributo mFinishYear
	 * @param Integer finishYear
	 */
	public void setFinishYear(Integer finishYear){
		mFinishYear = finishYear;
	}

}
