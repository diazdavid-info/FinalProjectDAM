﻿package david.model.pojo.school;

import java.util.List;

import david.model.pojo.builder.ModuleBuilder;
import david.model.pojo.users.User;

/**
 * Clase modulo
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:33
 */
public class Module {

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

	public Module(ModuleBuilder moduleBuilder){
		mChapter = moduleBuilder.getChapter();
		mHour = moduleBuilder.getHour();
		mId = moduleBuilder.getId();
		mIdentification = moduleBuilder.getIdentification();
		mName = moduleBuilder.getName();
		mSession = moduleBuilder.getSession();
		mStudent = moduleBuilder.getStudent();
		mTeacher = moduleBuilder.getTeacher();
	}

	public void finalize() throws Throwable {

	}

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
	 */
	public void setChapter(List<Chapter> newVal){
		mChapter = newVal;
	}

	/**
	 * Horas disponibles para impartir el módulo
	 * 
	 * @param newVal
	 */
	public void setHour(int newVal){
		mHour = newVal;
	}

	/**
	 * Identificador del módulo
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		mId = newVal;
	}

	/**
	 * Identificador interno del módulo
	 * 
	 * @param newVal
	 */
	public void setIdentification(String newVal){
		mIdentification = newVal;
	}

	/**
	 * Nombre del módulo
	 * 
	 * @param newVal
	 */
	public void setName(String newVal){
		mName = newVal;
	}

	/**
	 * Lista de sessiones que se imparten
	 * 
	 * @param newVal
	 */
	public void setSession(List<Session> newVal){
		mSession = newVal;
	}
	
	/**
	 * Listado de estudiantes
	 * 
	 * @param newVal
	 */
	public void setStudent(List<User> newVal){
		mStudent = newVal;
	}

	/**
	 * Profesor que imparte este módulo
	 * 
	 * @param newVal
	 */
	public void setTeacher(User newVal){
		mTeacher = newVal;
	}

}