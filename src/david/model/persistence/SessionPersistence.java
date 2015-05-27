/**
 * Clase que representa la persistencia de la BDD
 * @author David Díaz García
 * @date 27-05-2015
 */
package david.model.persistence;

import david.model.annotation.column;

public class SessionPersistence implements Cloneable {

	/**
	 * Atributo que almacena el ID
	 */
	@column(name = "mId", type = "int")
	private Integer mId;
	/**
	 * Atributo que almacena el chapter
	 */
	@column(name = "mChapter", type = "int")
	private Integer mChapter;
	/**
	 * Atributo que almacena el time
	 */
	@column(name = "mTime", type = "int")
	private Integer mTime;
	/**
	 * Atributo que almacena el type
	 */
	@column(name = "mType", type = "int")
	private Integer mType;
	/**
	 * Atributo que almacena el description
	 */
	@column(name = "mDescription", type = "varchar")
	private String mDescription;
	/**
	 * Atributo que almacena el module
	 */
	@column(name = "mModule", type = "int")
	private Integer mModule;
	/**
	 * Atributo que almacena el subtype
	 */
	@column(name = "mSubtype", type = "int")
	private Integer mSubtype;

	/**
	 * Método que obtiene el nombre de la tabla
	 * 
	 * @return String
	 */
	public String getTable() {
		return "session";
	}

	/**
	 * Método que clona el objeto
	 * 
	 * @throws CloneNotSupportedException
	 */
	@Override
	public SessionPersistence clone() throws CloneNotSupportedException {
		return (SessionPersistence) super.clone();
	}

	/**
	 * Método que obtiene el valor del atributo ID
	 * 
	 * @return Integer
	 */
	public Integer getId() {
		return mId;
	}

	/**
	 * Método que establece el valor del atributo mId
	 * 
	 * @param Integer
	 *            mId
	 */
	public void setId(Integer mId) {
		this.mId = mId;
	}

	/**
	 * Método que obtiene el valor del atributo mChapter
	 * 
	 * @return Integer
	 */
	public Integer getChapter() {
		return mChapter;
	}

	/**
	 * Método que establece el valor del atributo mChapter
	 * 
	 * @param Integer
	 *            mChapter
	 */
	public void setChapter(Integer mChapter) {
		this.mChapter = mChapter;
	}

	/**
	 * Método que obtiene el valor del atributo mTime
	 * 
	 * @return Integer
	 */
	public Integer getTime() {
		return mTime;
	}

	/**
	 * Método que establece el valor del atributo mTime
	 * 
	 * @param Integer
	 *            mTime
	 */
	public void setTime(Integer mTime) {
		this.mTime = mTime;
	}

	/**
	 * Método que obtiene el valor del atributo mType
	 * 
	 * @return Integer
	 */
	public Integer getType() {
		return mType;
	}

	/**
	 * Método que establece el valor del atributo mType
	 * 
	 * @param Integer
	 *            mType
	 */
	public void setType(Integer mType) {
		this.mType = mType;
	}

	/**
	 * Método que obtiene el valor del atributo mDescription
	 * 
	 * @return String
	 */
	public String getDescription() {
		return mDescription;
	}

	/**
	 * Método que establece el valor del atributo mDescription
	 * 
	 * @param String
	 *            mDescription
	 */
	public void setDescription(String mDescription) {
		this.mDescription = mDescription;
	}

	/**
	 * Método que obtiene el valor del atributo mModule
	 * 
	 * @return Integer
	 */
	public Integer getModule() {
		return mModule;
	}

	/**
	 * Método que establece el valor del atributo mModule
	 * 
	 * @param Integer
	 *            mModule
	 */
	public void setModule(Integer mModule) {
		this.mModule = mModule;
	}

	/**
	 * Método que obtiene el valor del atributo mSubtype
	 * 
	 * @return Integer
	 */
	public Integer getSubtype() {
		return mSubtype;
	}

	/**
	 * Método que establece el valor del atributo mSubtype
	 * 
	 * @param Integer
	 *            mSubtype
	 */
	public void setSubtype(Integer mSubtype) {
		this.mSubtype = mSubtype;
	}

}
