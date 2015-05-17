/**
 * Clase que construye un cycle
 * @author David Díaz García
 * @date 17-05-2015
 */
package david.model.pojo.builder;

import java.util.List;

import david.model.pojo.school.Course;
import david.model.pojo.school.Module;
import david.model.pojo.school.School;
import david.model.pojo.users.User;

public class CycleBuilder {
	
	/**
	 * Atributo que almacena un curso
	 */
	private Course mCourse;
	/**
	 * Atributo que almacena el id
	 */
	private int mId;
	/**
	 * Atributo que almacena el identificador interno
	 */
	private String mIdentification;
	/**
	 * Atributo que almacena el listado de módulos
	 */
	private List<Module> mModule;
	/**
	 * Atributo que almacena el nombre
	 */
	private String mName;
	/**
	 * Atributo que almacena el instituto
	 */
	private School mSchool;
	/**
	 * Atributo que almacena el tutor 
	 */
	private User mTutor;

	
	/**
	 * Método que obtiene el valor del atributo mCourse
	 * @return Course
	 */
	public Course getCourse(){
		return mCourse;
	}

	/**
	 * Método que obtiene el valor del atributo mId
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Método que obtiene el valor del atributo mIdentification
	 * @return String
	 */
	public String getIdentification(){
		return mIdentification;
	}

	/**
	 * Método que obtiene el valor del atributo mModule
	 * @return List<Module>
	 */
	public List<Module> getModule(){
		return mModule;
	}

	/**
	 * Método que obtiene el valor del atributo mName
	 * @return String
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Método que obtiene el valor del atributo mTutor
	 * @return User
	 */
	public User getTutor(){
		return mTutor;
	}
	
	/**
	 * Método que obtiene el valor del atributo mSchool
	 * @return School
	 */
	public School getSchool(){
		return mSchool;
	}
	
	/**
	 * Método que establece el valor del atributo mCourse
	 * 
	 * @param Course newVal
	 * @return CycleBuilder
	 */
	public CycleBuilder course(Course newVal){
		mCourse = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mId
	 * 
	 * @param int newVal
	 * @return CycleBuilder
	 */
	public CycleBuilder id(int newVal){
		mId = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mIdentification
	 * 
	 * @param String newVal
	 * @return CycleBuilder
	 */
	public CycleBuilder identification(String newVal){
		mIdentification = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mModule
	 * 
	 * @param List<Module> newVal
	 * @return CycleBuilder
	 */
	public CycleBuilder module(List<Module> newVal){
		mModule = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mName
	 * 
	 * @param String newVal
	 * @return CycleBuilder
	 */
	public CycleBuilder name(String newVal){
		mName = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mTutor
	 * 
	 * @param User newVal
	 * @return CycleBuilder
	 */
	public CycleBuilder tutor(User newVal){
		mTutor = newVal;
		return this;
	}
	
	/**
	 * Método que establece el valor del atributo mSchool
	 * 
	 * @param School newVal
	 * @return CycleBuilder
	 */
	public CycleBuilder school(School newVal){
		mSchool = newVal;
		return this;
	}

}
