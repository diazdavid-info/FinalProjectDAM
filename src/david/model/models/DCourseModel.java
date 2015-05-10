/**
 * Interfaz para que implemente el modelo de course
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.models;

import java.util.List;
import java.util.Map;

import david.model.pojo.school.Course;

public interface DCourseModel {
	
	/**
	 * Método que gestiona la creación de un curso
	 * @param Map<String, String[]> parameter
	 */
	public void createCourse(Map<String, String[]> parameter);

	/**
	 * Método que solicita y gestiona el listado de cursos
	 * @return List<Course>
	 */
	public List<Course> listCourse();

}
