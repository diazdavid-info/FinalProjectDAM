/**
 * Clase que construye un course
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.pojo.builder;


public class CourseBuilder {
	
	/**
	 * Atributo que almacena el año de finalización
	 */
	private int mFinishYear;
	/**
	 * Atributo que almacena el ID
	 */
	private int mId;
	/**
	 * Atributo que almacena el año de inicio
	 */
	private int mStartYear;
	
	/**
	 * Método que obtiene el valor del atributo mFinishYear
	 * @return int
	 */
	public int getFinishYear() {
		return mFinishYear;
	}
	
	/**
	 * Método que establece el valor del atributo mFinishYear
	 * @param int mFinishYear
	 * @return CourseBuilder
	 */
	public CourseBuilder finishYear(int mFinishYear) {
		this.mFinishYear = mFinishYear;
		return this;
	}
	
	/**
	 * Método que obtiene el valor del atributo mId
	 * @return int
	 */
	public int getId() {
		return mId;
	}
	
	/**
	 * Método que establece el valor del atributo mId
	 * @param mId
	 * @return CourseBuilder
	 */
	public CourseBuilder id(int mId) {
		this.mId = mId;
		return this;
	}
	
	/**
	 * Método que obtiene el valor del atributo mStartYear
	 * @return int
	 */
	public int getStartYear() {
		return mStartYear;
	}
	
	/**
	 * Método que establece el valor del atributo mFinishYear
	 * @param mStartYear
	 * @return CourseBuilder
	 */
	public CourseBuilder startYear(int mStartYear) {
		this.mStartYear = mStartYear;
		return this;
	}

	

}
