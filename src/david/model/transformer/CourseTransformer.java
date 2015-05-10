/**
 * Clase que transforma la entidad Course
 * @author David Diaz Garcia
 * @date 10-05-2015
 */
package david.model.transformer;

import david.model.persistence.CoursePersistence;
import david.model.pojo.builder.CourseBuilder;
import david.model.pojo.school.Course;

public class CourseTransformer implements ICourseTransformer {
	
	/**
	 * Método que transforma la entidad Course en la persistencia Course
	 * @param Course course
	 * @return CoursePersistence 
	 */
	public CoursePersistence entityToPersistence(Course course){
		CoursePersistence coursePersistence = new CoursePersistence();
		coursePersistence.setFinishYear(course.getFinishYear());
		
		if(course.getId() != 0){
			coursePersistence.setId(course.getId());
		}
		
		coursePersistence.setStartYear(course.getStartYear());
		
		return coursePersistence;
	}
	
	/**
	 * Método que transforma la persistencia de Course en la entidad Course
	 * @param CoursePersistence coursePersistence
	 * @return Course
	 */
	public Course persistenceToEntity(CoursePersistence coursePersistence){
		CourseBuilder courseBuilder = new CourseBuilder();
		courseBuilder
		.finishYear(coursePersistence.getFinishYear())
		.id(coursePersistence.getId())
		.startYear(coursePersistence.getStartYear());
		return new Course(courseBuilder);
	}

}
