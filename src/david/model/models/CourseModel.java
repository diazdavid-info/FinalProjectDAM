/**
 * Modelo para todo lo relacionado con un curso
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.models;

import java.util.Map;

import david.model.persistence.CoursePersistence;
import david.model.pojo.builder.CourseBuilder;
import david.model.pojo.school.Course;
import david.model.repository.CourseRepository;
import david.model.transformer.ICourseTransformer;
import david.model.validate.form.CourseCreateForm;
import david.model.validate.form.IWebCreateCourse;

public class CourseModel implements DCourseModel{
	
	/**
	 * Atributo que almacena el valor del transformador de cursos
	 */
	private ICourseTransformer mICourseTransformer;
	/**
	 * Atributo que almacena el valor del repositorio de cursos
	 */
	private CourseRepository mCourseRepository;
	
	/**
	 * Constructor
	 */
	public CourseModel(ICourseTransformer courseTransformer, CourseRepository courseRepository){
		mICourseTransformer = courseTransformer;
		mCourseRepository = courseRepository;
	}
	
	/**
	 * Método que gestiona la creación de un curso
	 * @param Map<String, String[]> parameter
	 */
	public void createCourse(Map<String, String[]> parameter){
		Course course = null;
		
		IWebCreateCourse form = new CourseCreateForm();
		
		if(form.validate(parameter)){
			course = new Course(new CourseBuilder().startYear(Integer.parseInt(form.getStart())).finishYear(Integer.parseInt(form.getFinish())));
			CoursePersistence coursePersistence = mICourseTransformer.entityToPersistence(course);
			course = mICourseTransformer.persistenceToEntity(mCourseRepository.storage(coursePersistence));
			
			System.out.println("FORMULARIO CRETE COURSE ES VALIDO");
		}
		System.out.println("FORMULARIO CRETE COURSE NO ES VALIDO");
	}
}
