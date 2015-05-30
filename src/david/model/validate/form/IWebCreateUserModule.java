/**
 * Intefaz que debe ser implementado por todos los validadores del create user module
 * @author David Díaz García
 * @date 30-05-2015
 */
package david.model.validate.form;

import java.util.Map;

public interface IWebCreateUserModule {

	/**
	 * Método que valida los campos del formulario
	 * 
	 * @param Map
	 *            <String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter);

	/**
	 * Método que obtiene el valor del atributo mCourse
	 * 
	 * @return String
	 */
	public String getCourse();

	/**
	 * Método que establece el valor del atributo mCourse
	 * 
	 * @param String
	 *            mCourse
	 */
	public void setCourse(String mCourse);

	/**
	 * Método que obtiene el valor del atributo mSchool
	 * 
	 * @return String
	 */
	public String getSchool();

	/**
	 * Método que establece el valor del atributo mSchool
	 * 
	 * @param String
	 *            mSchool
	 */
	public void setSchool(String mSchool);

	/**
	 * Método que obtiene el valor del atributo mCycle
	 * 
	 * @return String
	 */
	public String getCycle();

	/**
	 * Método que establece el valor del atributo mCycle
	 * 
	 * @param String
	 *            mCycle
	 */
	public void setCycle(String mCycle);

	/**
	 * Método que obtiene el valor del atributo mModule
	 * 
	 * @return String
	 */
	public String getModule();

	/**
	 * Método que establece el valor del atributo mModule
	 * 
	 * @param String
	 *            mModule
	 */
	public void setModule(String mModule);

	/**
	 * Método que obtiene el valor del atributo mPupils
	 * 
	 * @return String[]
	 */
	public String[] getPupils();

	/**
	 * Método que establece el valor del atributo mPupils
	 * 
	 * @param String
	 *            [] pupils
	 */
	public void setPupils(String[] pupils);

}
