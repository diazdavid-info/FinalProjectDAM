/**
 * Intefaz que define el comportamiento de los transformadores de Course
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.transformer;

import david.model.persistence.CoursePersistence;
import david.model.pojo.school.Course;

public interface ICourseTransformer {
	
	/**
	 * Método que transforma la entidad Course en la persistencia Course
	 * @param Course course
	 * @return CoursePersistence 
	 */
	public CoursePersistence entityToPersistence(Course course);
	
	/**
	 * Método que transforma la persistencia de Course en la entidad Course
	 * @param CoursePersistence coursePersistence
	 * @return Course
	 */
	public Course persistenceToEntity(CoursePersistence coursePersistence);

}
