/**
 * Intefaz que debe ser implementado por todos los validadores del AddCourseSchoolCreate
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.validate.form;

import java.util.Map;

public interface IWebCreateCourseSchool {
	
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
	 * Método que obtiene el valor del atributo mSchools
	 * @return String[]
	 */
	public String[] getSchools();

}
