/**
 * Repositorio para la persistencia de CourseSchool
 * @author David Díaz García
 * @date 15-05-2015
 */
package david.model.repository;

import david.model.mapper.Mapper;
import david.model.persistence.CourseSchoolPersistence;
import david.model.provider.DProvider;

public class CourseSchoolRepository {
	
	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;
	
	/**
	 * Constructor
	 * @param DProvider provider
	 */
	public CourseSchoolRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que almacena un courseSchoolPersistence
	 * @param CourseSchoolPersistence courseSchoolPersistence
	 * @return CourseSchoolPersistence 
	 */
	public CourseSchoolPersistence storage(CourseSchoolPersistence courseSchoolPersistence) {
		return save(courseSchoolPersistence);
	}
	
	/**
	 * Método que actualiza un CourseSchoolPersistence
	 * @param CourseSchoolPersistence courseSchoolPersistence
	 * @return CourseSchoolPersistence
	 */
	@SuppressWarnings("unused")
	private CourseSchoolPersistence update(CourseSchoolPersistence courseSchoolPersistence) {
		System.out.println("ESTOY EN EL UPDATE DE COURSESCHOOLREPOSITORY");
		return courseSchoolPersistence;
	}

	/**
	 * Método que guarda un CourseSchoolPersistence 
	 * @param CourseSchoolPersistence courseSchoolPersistence
	 * @return CourseSchoolPersistence
	 */
	private CourseSchoolPersistence save(CourseSchoolPersistence courseSchoolPersistence) {
		System.out.println("ESTOY EN EL SAVE DE COURSESCHOOLREPOSITORY");
		Mapper<CourseSchoolPersistence> mapper = new Mapper<CourseSchoolPersistence>(courseSchoolPersistence);
		mProvider.executeUpdate(mapper.mapperStorageToDbb());
		return courseSchoolPersistence;
	}

	/**
	 * Método que busca un CourseSchoolPersistence que cumpla con los requisitos
	 * @param CourseSchoolPersistence coursePersistence
	 * @return CourseSchoolPersistence
	 */
	public CourseSchoolPersistence find(CourseSchoolPersistence courseSchoolPersistence) {
		Mapper<CourseSchoolPersistence> mapper = new Mapper<CourseSchoolPersistence>(courseSchoolPersistence);
		return mapper.mapperToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
	}

}
