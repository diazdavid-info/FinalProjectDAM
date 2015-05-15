/**
 * Intefaz que define el comportamiento de los transformadores de CourseSchool
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.transformer;

import david.model.persistence.CourseSchoolPersistence;
import david.model.pojo.school.CourseSchool;

public interface ICourseSchoolTransformer {
	
	/**
	 * Método que transforma la entidad CourseSchool en la persistencia CourseSchool
	 * @param CourseSchool courseSchool
	 * @return CourseSchoolPersistence 
	 */
	public CourseSchoolPersistence entityToPersistence(CourseSchool courseSchool);
	
	/**
	 * Método que transforma la persistencia de CourseSchool en la entidad CourseSchool
	 * @param CourseSchoolPersistence courseSchoolPersistence
	 * @return CourseSchool
	 */
	public CourseSchool persistenceToEntity(CourseSchoolPersistence courseSchoolPersistence);

}
