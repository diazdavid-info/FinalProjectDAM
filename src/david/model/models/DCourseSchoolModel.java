/**
 * Interfaz para que implemente el modelo de courseSchool
 * @author David Díaz García
 * @date 21-05-2015
 */
package david.model.models;

import java.util.List;
import java.util.Map;

import david.model.persistence.CourseSchoolPersistence;
import david.model.pojo.school.Course;

public interface DCourseSchoolModel {

	/**
	 * Método que busca los courseSchool de un curso
	 * @param Course course
	 * @return List<CourseSchoolPersistence>
	 */
	public List<CourseSchoolPersistence> findCourseSchoolByCourse(Course course);
	
	/**
	 * Método que gestiona la creación de la relación entre cursos e institutos
	 * @param Map<String, String[]> requestParameter
	 */
	public void createCourseSchools(Map<String, String[]> parameter);

}
