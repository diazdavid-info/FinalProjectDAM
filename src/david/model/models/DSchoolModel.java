/**
 * Interfaz para que implemente el modelo de school
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.models;

import java.util.List;
import java.util.Map;

import david.model.pojo.school.Course;
import david.model.pojo.school.School;

public interface DSchoolModel {
	
	/**
	 * Método que gestiona la creación de institutos
	 * @param Map<String, String[]> parameter
	 */
	public void createSchool(Map<String, String[]> parameter);

	/**
	 * Método que solicita y gestiona el listado de institutos
	 * @return List<School>
	 */
	public List<School> listSchool();

	/**
	 * Método que solicita y gestiona la busqueda de un instituto
	 * @param School school
	 * @return School
	 */
	public School findSchool(School school);

	/**
	 * Método que solicita y gestiona la busqueda de institutos de un curso
	 * @param Curse course
	 * @return List<School>
	 */
	public List<School> findSchoolByCourse(Course course);

}
