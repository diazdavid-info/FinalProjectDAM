package david.model.pojo.school;

import david.model.pojo.builder.SessionBuilder;

/**
 * Clase que recoge las sessiones impartidas
 * 
 * @author David Díaz
 * @version 1.0
 * @created 13-mar-2015 15:53:36
 */
public class Session {

	/**
	 * Capítulo que se ha impartido en la sessión
	 */
	private Chapter mChapter;
	/**
	 * Fecha de la sesión
	 */
	private String mDate;
	/**
	 * Descripción de lo que se ha realizado en la sessión
	 */
	private String mDescription;
	/**
	 * Identificador de la sessión
	 */
	private int mId;
	/**
	 * Subtipo de la sessión
	 */
	private SubType mSubType;
	/**
	 * Tiempo de la sessión
	 */
	private int mTime;
	/**
	 * Tipo de la sessión
	 */
	private Type mType;

	public Session(SessionBuilder sessionBuilder) {
		mChapter = sessionBuilder.getChapter();
		mDescription = sessionBuilder.getDescription();
		mId = sessionBuilder.getId();
		mSubType = sessionBuilder.getSubType();
		mTime = sessionBuilder.getTime();
		mType = sessionBuilder.getType();
		mDate = sessionBuilder.getDate();
	}

	@Override
	public void finalize() throws Throwable {

	}

	/**
	 * Capítulo que se ha impartido en la sessión
	 */
	public Chapter getChapter() {
		return mChapter;
	}

	/**
	 * Fecha en la que se ha impartida la sesión
	 */
	public String getDate() {
		return mDate;
	}

	/**
	 * Descripción de lo que se ha realizado en la sessión
	 */
	public String getDescription() {
		return mDescription;
	}

	/**
	 * Identificador de la sessión
	 */
	public int getId() {
		return mId;
	}

	/**
	 * Subtipo de la sessión
	 */
	public SubType getSubType() {
		return mSubType;
	}

	/**
	 * Tiempo de la sessión
	 */
	public int getTime() {
		return mTime;
	}

	/**
	 * Tipo de la sessión
	 */
	public Type getType() {
		return mType;
	}

	/**
	 * Capítulo que se ha impartido en la sessión
	 * 
	 * @param newVal
	 */
	public void setChapter(Chapter newVal) {
		mChapter = newVal;
	}

	/**
	 * Fecha en la que se imparte la sesión
	 * 
	 * @param date
	 */
	public void setDate(String date) {
		mDate = date;
	}

	/**
	 * Descripción de lo que se ha realizado en la sessión
	 * 
	 * @param newVal
	 */
	public void setDescription(String newVal) {
		mDescription = newVal;
	}

	/**
	 * Identificador de la sessión
	 * 
	 * @param newVal
	 */
	public void setId(int newVal) {
		mId = newVal;
	}

	/**
	 * Subtipo de la sessión
	 * 
	 * @param newVal
	 */
	public void setSubType(SubType newVal) {
		mSubType = newVal;
	}

	/**
	 * Tiempo de la sessión
	 * 
	 * @param newVal
	 */
	public void setTime(int newVal) {
		mTime = newVal;
	}

	/**
	 * Tipo de la sessión
	 * 
	 * @param newVal
	 */
	public void setType(Type newVal) {
		mType = newVal;
	}

}