/**
 * Repositorio para la persistencia de CourseSchool
 * @author David Díaz García
 * @date 15-05-2015
 */
package david.model.repository;

import java.util.List;

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
		return courseSchoolPersistence;
	}

	/**
	 * Método que guarda un CourseSchoolPersistence 
	 * @param CourseSchoolPersistence courseSchoolPersistence
	 * @return CourseSchoolPersistence
	 */
	private CourseSchoolPersistence save(CourseSchoolPersistence courseSchoolPersistence) {
		Mapper<CourseSchoolPersistence> mapper = new Mapper<CourseSchoolPersistence>(courseSchoolPersistence);
		mProvider.connect();
		mProvider.executeUpdate(mapper.mapperStorageToDbb());
		mProvider.disconnect();
		return courseSchoolPersistence;
	}

	/**
	 * Método que busca un CourseSchoolPersistence que cumpla con los requisitos
	 * @param CourseSchoolPersistence coursePersistence
	 * @return CourseSchoolPersistence
	 */
	public CourseSchoolPersistence find(CourseSchoolPersistence courseSchoolPersistence) {
		Mapper<CourseSchoolPersistence> mapper = new Mapper<CourseSchoolPersistence>(courseSchoolPersistence);
		mProvider.connect();
		CourseSchoolPersistence peristence = mapper.mapperToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return peristence;
	}

	/**
	 * Método que busca todos los courseSchoolPersistence que cumplan con los requisitos
	 * @param CourseSchoolPersistence courseSchoolPersistence
	 * @return List<CourseSchoolPersistence>
	 */
	public List<CourseSchoolPersistence> findAll(CourseSchoolPersistence courseSchoolPersistence) {
		Mapper<CourseSchoolPersistence> mapper = new Mapper<CourseSchoolPersistence>(courseSchoolPersistence);
		mProvider.connect();
		List<CourseSchoolPersistence> persistence = mapper.mapperAllToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return persistence;
	}

}
