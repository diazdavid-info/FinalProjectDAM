/**
 * Modelo para todo lo relacionado con un courseSchool
 * @author David Díaz García
 * @date 21-05-2015
 */
package david.model.models;

import java.util.List;
import java.util.Map;

import david.model.factory.ModelFactory;
import david.model.persistence.CourseSchoolPersistence;
import david.model.pojo.builder.CourseBuilder;
import david.model.pojo.builder.CourseSchoolBuilder;
import david.model.pojo.builder.SchoolBuilder;
import david.model.pojo.school.Course;
import david.model.pojo.school.CourseSchool;
import david.model.pojo.school.School;
import david.model.repository.CourseSchoolRepository;
import david.model.transformer.ICourseSchoolTransformer;
import david.model.validate.form.CourseSchoolCreateForm;
import david.model.validate.form.IWebCreateCourseSchool;

public class CourseSchoolModel implements DCourseSchoolModel {
	
	/**
	 * Atributo que almacena el transformador de CourseSchool
	 */
	private ICourseSchoolTransformer mICourseSchoolTransformer;
	/**
	 * Atributo que almacena el repositorio de CourseSchool
	 */
	private CourseSchoolRepository mCourseSchoolRepository;

	/**
	 * Constructor
	 * @param courseSchoolTransformer
	 * @param courseSchoolRepository
	 */
	public CourseSchoolModel(ICourseSchoolTransformer courseSchoolTransformer, CourseSchoolRepository courseSchoolRepository) {
		mICourseSchoolTransformer = courseSchoolTransformer;
		mCourseSchoolRepository = courseSchoolRepository;
	}
	
	/**
	 * Método que busca los courseSchool de un curso
	 * @param Course course
	 * @return List<CourseSchoolPersistence>
	 */
	public List<CourseSchoolPersistence> findCourseSchoolByCourse(Course course){
		CourseSchool courseSchool = new CourseSchool(new CourseSchoolBuilder().course(course));
		CourseSchoolPersistence courseSchoolPersistence = mICourseSchoolTransformer.entityToPersistence(courseSchool);
		
		return mCourseSchoolRepository.findAll(courseSchoolPersistence);
	}
	
	/**
	 * Método que gestiona la creación de la relación entre cursos e institutos
	 * @param Map<String, String[]> requestParameter
	 */
	public void createCourseSchools(Map<String, String[]> parameter){
		IWebCreateCourseSchool form = new CourseSchoolCreateForm();
		DCourseModel courseModel = ModelFactory.createCourseModel();
		DSchoolModel schoolModel = ModelFactory.createSchoolModel();
		
		
		if(form.validate(parameter)){
			Course course = courseModel.findCourse(new Course(new CourseBuilder().id(Integer.parseInt(form.getCourse()))));
						
			for (String idSchool : form.getSchools()) {
				School school = schoolModel.findSchool(new School(new SchoolBuilder().id(Integer.parseInt(idSchool))));
				
				CourseSchool courseSchool = new CourseSchool(new CourseSchoolBuilder().course(course).school(school));
				CourseSchoolPersistence courseSchoolPersistence = mICourseSchoolTransformer.entityToPersistence(courseSchool);
				courseSchool = mICourseSchoolTransformer.persistenceToEntity(mCourseSchoolRepository.storage(courseSchoolPersistence));
			}
			
		}
	}

}
