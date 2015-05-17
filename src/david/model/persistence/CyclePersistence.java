/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 17-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class CyclePersistence implements Cloneable{
	
	/**
	 * Atributo que almacena el ID
	 */
	@column(name="mId", type="int")
	private Integer mId;
	/**
	 * Atributo que almacena el id del curso
	 */
	@column(name="mIdCourse", type="int")
	private Integer mIdCourse;
	/**
	 * Atributo que almacena el id del instituto
	 */
	@column(name="mIdSchool", type="int")
	private Integer mIdSchool;
	/**
	 * Atributo que almacena el codigo interno
	 */
	@column(name="mCodeIdentification", type="varchar")
	private String mCodeIdentification;
	/**
	 * Atributo que almacena el id del tutor
	 */
	@column(name="mTutor", type="int")
	private Integer mTutor;
	/**
	 * Atributo que almacena el nombre del ciclo
	 */
	@column(name="mName", type="varchar")
	private String mName;
	
	/**
	 * Método que obtiene el nombre de la tabla
	 * @return String
	 */
	public String getTable(){
		return "cycle";
	}
	
	/**
	 * Método que clona el objeto
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public CyclePersistence clone() throws CloneNotSupportedException{
		return (CyclePersistence) super.clone();
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
	 * Método que obtiene el valor del atributo mIdCourse
	 * @return Integer
	 */
	public Integer getIdCourse(){
		return mIdCourse;
	}
	
	/**
	 * Método que establece el valor del atributo mIdCourse
	 * @param Integer idCourse
	 */
	public void setIdCourse(Integer idCourse){
		mIdCourse = idCourse;
	}
	
	/**
	 * Método que obtiene el valor del atributo mIdSchool
	 * @return Integer
	 */
	public Integer getIdSchool(){
		return mIdSchool;
	}
	
	/**
	 * Método que establece el valor del atributo mIdSchool
	 * @param Integer idSchool
	 */
	public void setIdSchool(Integer idSchool){
		mIdSchool = idSchool;
	}
	
	/**
	 * Método que obtiene el valor del atributo mCodeIdentification
	 * @return String
	 */
	public String getCodeIdentification(){
		return mCodeIdentification;
	}
	
	/**
	 * Método que establece el valor del atributo mCodeIdentification
	 * @param String codeIdentification
	 */
	public void setCodeIdentification(String codeIdentification){
		mCodeIdentification = codeIdentification;
	}
	
	/**
	 * Método que obtiene el valor del atributo mTutor
	 * @return Integer
	 */
	public Integer getTutor(){
		return mTutor;
	}
	
	/**
	 * Método que establece el valor del atributo mTutor
	 * @param Integer tutor
	 */
	public void setTutor(Integer tutor){
		mTutor = tutor;
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

}
