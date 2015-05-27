/**
 * Intefaz que debe ser implementado por todos los validadores de create session
 * @author David Díaz García
 * @date 25-05-2015
 */
package david.model.validate.form;

import java.util.Map;

public interface IWebCreateSession {
	
	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter);

	/**
	 * Método que obtiene el valor del atributo mCourse
	 * @return String
	 */
	public String getCourse();

	/**
	 * Método que establece el valor del atributo mCourse
	 * @param String mCourse
	 */
	public void setCourse(String mCourse);

	/**
	 * Método que obtiene el valor del atributo mSchool
	 * @return String
	 */
	public String getSchool();

	/**
	 * Método que establece el valor del atributo mSchool
	 * @param String mSchool
	 */
	public void setSchool(String mSchool);

	/**
	 * Método que obtiene el valor del atributo mCycle
	 * @return String
	 */
	public String getCycle();

	/**
	 * Método que establece el valor del atributo mCycle
	 * @param String mCycle
	 */
	public void setCycle(String mCycle);

	/**
	 * Método que obtiene el valor del atributo mModule
	 * @return String
	 */
	public String getModule();

	/**
	 * Método que establece el valor del atributo mModule
	 * @param String mModule
	 */
	public void setModule(String mModule);

	/**
	 * Método que obtiene el valor del atributo mType
	 * @return String
	 */
	public String getType();

	/**
	 * Método que establece el valor del atributo mType
	 * @param String mType
	 */
	public void setType(String mType);

	/**
	 * Método que obtiene el valor del atributo mSubtype
	 * @return String
	 */
	public String getSubtype();

	/**
	 * Método que establece el valor del atributo mSubtype
	 * @param String mSubtype
	 */
	public void setSubtype(String mSubtype);

	/**
	 * Método que obtiene el valor del atributo mChapter
	 * @return String
	 */
	public String getChapter();

	/**
	 * Método que establece el valor del atributo mChapter
	 * @param String mChapter
	 */
	public void setChapter(String mChapter);

	/**
	 * Método que obtiene el valor del atributo mHour
	 * @return String
	 */
	public String getHour();

	/**
	 * Método que establece el valor del atributo mHour
	 * @param String mHour
	 */
	public void setHour(String mHour);

	/**
	 * Método que obtiene el valor del atributo mDescription
	 * @return String
	 */
	public String getDescription();

	/**
	 * Método que establece el valor del atributo mDescription
	 * @param String mDescription
	 */
	public void setDescription(String mDescription);

}
