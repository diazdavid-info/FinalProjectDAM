package david.model.pojo.school;

import java.util.List;

import david.model.pojo.builder.CourseBuilder;


/**
 * Clase curso
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:32
 */
public class Course{

	/**
	 * Año de fin del curso
	 */
	private int mFinishYear;
	/**
	 * Identificador del curso
	 */
	private int mId;
	/**
	 * Año de inicio del curso
	 */
	private int mStartYear;
	/**
	 * Listado de institutos
	 */
	private List<School> mSchool;

	/**
	 * Constructor con un parametro
	 * @param CourseBuilder courseBuilder
	 */
	public Course(CourseBuilder courseBuilder){
		mFinishYear = courseBuilder.getFinishYear();
		mId = courseBuilder.getId();
		mStartYear = courseBuilder.getStartYear();
	}

	public void finalize() throws Throwable {

	}

	/**
	 * Ano de fin del curso
	 */
	public int getFinishYear(){
		return mFinishYear;
	}

	/**
	 * Identificador del curso
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Año de inicio del curso
	 */
	public int getStartYear(){
		return mStartYear;
	}
	
	/**
	 * listado de institutos
	 */
	public List<School> getSchool(){
		return mSchool;
	}

	/**
	 * Año de finalización del curso
	 * 
	 * @param newVal
	 */
	public void setFinishYear(int newVal){
		mFinishYear = newVal;
	}

	/**
	 * Identificador del curso
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

	/**
	 * Año de inicio del curso
	 * 
	 * @param newVal
	 */
	public void setStartYear(int newVal){
		mStartYear = newVal;
	}
	
	/**
	 * Listado de institutos
	 * 
	 * @param newVal
	 */
	public void setSchool(List<School> newVal){
		mSchool = newVal;
	}

}