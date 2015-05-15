/**
 * Clase que transforma la entidad CourseSchool
 * @author David Diaz Garcia
 * @date 03-05-2015
 */
package david.model.transformer;

import david.model.persistence.CourseSchoolPersistence;
import david.model.pojo.builder.CourseSchoolBuilder;
import david.model.pojo.school.CourseSchool;

public class CourseSchoolTransformer implements ICourseSchoolTransformer{

	/**
	 * Método que transforma la entidad CourseSchool en la persistencia CourseSchool
	 * @param CourseSchool courseSchool
	 * @return CourseSchoolPersistence 
	 */
	public CourseSchoolPersistence entityToPersistence(CourseSchool courseSchool){
		CourseSchoolPersistence courseSchoolPersistence = new CourseSchoolPersistence();
		
		if(courseSchool.getCourse() != null){
			courseSchoolPersistence.setIdCourse(courseSchool.getCourse().getId());
		}
		
		if(courseSchool.getSchool() != null){
			courseSchoolPersistence.setIdSchool(courseSchool.getSchool().getId());
		}
		
		return courseSchoolPersistence;
	}
	
	/**
	 * Método que transforma la persistencia de CourseSchool en la entidad CourseSchool
	 * @param CourseSchoolPersistence courseSchoolPersistence
	 * @return CourseSchool
	 */
	public CourseSchool persistenceToEntity(CourseSchoolPersistence courseSchoolPersistence){
		return new CourseSchool(new CourseSchoolBuilder());
	}
}
