package david.model.pojo.school;

import java.util.List;


/**
 * Clase curso
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:32
 */
public class Course {

	/**
	 * Lista de ciclos
	 */
	private List<Cycle> mCycle;
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
	public Cycle mCourse;

	public Course(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Lista de ciclos
	 */
	public List<Cycle> getCycle(){
		return mCycle;
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
	 * Lista de ciclos
	 * 
	 * @param newVal
	 */
	public void setCycle(List<Cycle> newVal){
		mCycle = newVal;
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

}