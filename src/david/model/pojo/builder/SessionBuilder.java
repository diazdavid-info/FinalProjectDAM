/**
 * Clase que construye un session
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.pojo.builder;

import david.model.pojo.school.Chapter;
import david.model.pojo.school.SubType;
import david.model.pojo.school.Type;

public class SessionBuilder {
	
	/**
	 * Atributo que almacena el capitulo
	 */
	private Chapter mChapter;
	/**
	 * Atributo que almacena la descripción
	 */
	private String mDescription;
	/**
	 * Atributo que almacena el ID
	 */
	private int mId;
	/**
	 * Atributo que almacena el subtipo
	 */
	private SubType mSubType;
	/**
	 * Atributo que almacena el tiempo
	 */
	private int mTime;
	/**
	 * Atributo que almacena el tipo
	 */
	private Type mType;

	/**
	 * Método que obtiene el valor del atributo mChapter
	 * @return Chapter
	 */
	public Chapter getChapter(){
		return mChapter;
	}

	/**
	 * Método que obtiene el valor del atributo mDescription
	 * @return String
	 */
	public String getDescription(){
		return mDescription;
	}

	/**
	 * Método que obtiene el valor del atributo mId
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Método que obtiene el valor del atributo mSubType
	 * @return SubType
	 */
	public SubType getSubType(){
		return mSubType;
	}

	/**
	 * Método que obtiene el valor del atributo mTime
	 * @return int
	 */
	public int getTime(){
		return mTime;
	}

	/**
	 * Método que obtiene el valor del atributo mType
	 * @return Type
	 */
	public Type getType(){
		return mType;
	}

	/**
	 * Método que establece el valor del atributo mChapter
	 * @param Chapter newVal
	 * @return SessionBuilder
	 */
	public SessionBuilder chapter(Chapter newVal){
		mChapter = newVal;
		return this;
	}

	/**
	 * Método que establece el valro del atributo mDescription
	 * @param String newVal
	 * @return SessionBuilder
	 */
	public SessionBuilder description(String newVal){
		mDescription = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mId
	 * @param int newVal
	 * @return SessionBuilder
	 */
	public SessionBuilder id(int newVal){
		mId = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mSubType
	 * @param SubType newVal
	 * @return SessionBuilder
	 */
	public SessionBuilder subType(SubType newVal){
		mSubType = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mTime
	 * @param int newVal
	 * @return SessionBuilder
	 */
	public SessionBuilder time(int newVal){
		mTime = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mType
	 * @param Type newVal
	 * @return SessionBuilder
	 */
	public SessionBuilder type(Type newVal){
		mType = newVal;
		return this;
	}

}
