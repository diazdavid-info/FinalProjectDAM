/**
 * Clase que construye un module
 * @author David Díaz García
 * @date 18-05-2015
 */
package david.model.pojo.builder;

import java.util.List;

import david.model.pojo.school.Chapter;
import david.model.pojo.school.Session;
import david.model.pojo.users.User;

public class ModuleBuilder {
	
	/**
	 * Listado de capitulos del temario
	 */
	private List<Chapter> mChapter;
	/**
	 * Horas disponibles para impartir el módulo
	 */
	private int mHour;
	/**
	 * Identificador del módulo
	 */
	private int mId;
	/**
	 * Identificador interno del módulo
	 */
	private String mIdentification;
	/**
	 * Nombre del módulo
	 */
	private String mName;
	/**
	 * Lista de sessiones que se imparten
	 */
	private List<Session> mSession;
	/**
	 * Lista de estudiantes matriculados en el módulo.
	 */
	private List<User> mStudent;
	/**
	 * Profesor que imparte este módulo
	 */
	private User mTeacher;


	/**
	 * Listado de capitulos del temario
	 */
	public List<Chapter> getChapter(){
		return mChapter;
	}

	/**
	 * Horas disponibles para impartir el módulo
	 */
	public int getHour(){
		return mHour;
	}

	/**
	 * Identificador del módulo
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Identificador interno del módulo
	 */
	public String getIdentification(){
		return mIdentification;
	}

	/**
	 * Nombre del módulo
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Lista de sessiones que se imparten
	 */
	public List<Session> getSession(){
		return mSession;
	}
	
	/**
	 * Listado de estudiantes
	 */
	public List<User> getStudent(){
		return mStudent;
	}
	
	/**
	 * Profesor que imparte este módulo
	 */
	public User getTeacher(){
		return mTeacher;
	}

	/**
	 * Listado de capitulos del temario
	 * 
	 * @param newVal
	 * @return ModuleBuilder
	 */
	public ModuleBuilder chapter(List<Chapter> newVal){
		mChapter = newVal;
		return this;
	}

	/**
	 * Horas disponibles para impartir el módulo
	 * 
	 * @param newVal
	 * @return ModuleBuilder
	 */
	public ModuleBuilder hour(int newVal){
		mHour = newVal;
		return this;
	}

	/**
	 * Identificador del módulo
	 * 
	 * @param newVal
	 * @return ModuleBuilder
	 */
	public ModuleBuilder id(int newVal){
		mId = newVal;
		return this;
	}

	/**
	 * Identificador interno del módulo
	 * 
	 * @param newVal
	 * @return ModuleBuilder
	 */
	public ModuleBuilder identification(String newVal){
		mIdentification = newVal;
		return this;
	}

	/**
	 * Nombre del módulo
	 * 
	 * @param newVal
	 * @return ModuleBuilder
	 */
	public ModuleBuilder name(String newVal){
		mName = newVal;
		return this;
	}

	/**
	 * Lista de sessiones que se imparten
	 * 
	 * @param newVal
	 * @return ModuleBuilder
	 */
	public ModuleBuilder session(List<Session> newVal){
		mSession = newVal;
		return this;
	}
	
	/**
	 * Listado de estudiantes
	 * 
	 * @param newVal
	 * @return ModuleBuilder
	 */
	public ModuleBuilder student(List<User> newVal){
		mStudent = newVal;
		return this;
	}

	/**
	 * Profesor que imparte este módulo
	 * 
	 * @param newVal
	 * @return ModuleBuilder
	 */
	public ModuleBuilder teacher(User newVal){
		mTeacher = newVal;
		return this;
	}

}
