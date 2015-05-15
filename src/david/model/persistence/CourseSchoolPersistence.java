/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class CourseSchoolPersistence implements Cloneable{

	/**
	 * Atributo que almacena el id del instituto
	 */
	@column(name="mIdSchool", type="int")
	private Integer mIdSchool;
	/**
	 * Atributo que almacena el el id del curso
	 */
	@column(name="mIdCourse", type="int")
	private Integer mIdCourse;
	
	/**
	 * Método que obtiene el nombre de la tabla
	 * @return String
	 */
	public String getTable(){
		return "schoolCourse";
	}
	
	/**
	 * Método que clona el objeto
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public CourseSchoolPersistence clone() throws CloneNotSupportedException{
		return (CourseSchoolPersistence) super.clone();
	}

	/**
	 * Método que obtiene el valor del atributo mIdSchool
	 * @return Integer
	 */
	public Integer getIdSchool() {
		return mIdSchool;
	}

	/**
	 * Método que establece el valor del atributo mIdSchool
	 * @param Integer mIdSchool
	 */
	public void setIdSchool(Integer mIdSchool) {
		this.mIdSchool = mIdSchool;
	}

	/**
	 * Método que obtiene el valor del atributo mIdCourse
	 * @return Integer
	 */
	public Integer getIdCourse() {
		return mIdCourse;
	}

	/**
	 * Método que establece el valor del atributo mIdCourse
	 * @param Integer mIdCourse
	 */
	public void setIdCourse(Integer mIdCourse) {
		this.mIdCourse = mIdCourse;
	}
	
	
}
