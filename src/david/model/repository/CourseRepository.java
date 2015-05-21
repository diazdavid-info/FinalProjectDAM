/**
 * Repositorio para la persistencia de Course
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.repository;

import java.util.List;

import david.model.mapper.Mapper;
import david.model.persistence.CoursePersistence;
import david.model.provider.DProvider;

public class CourseRepository {
	
	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;
	
	/**
	 * Constructor
	 * @param DProvider provider
	 */
	public CourseRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que almacena un coursePersistence
	 * @param coursePersistence
	 * @return CoursePersistence
	 */
	public CoursePersistence storage(CoursePersistence coursePersistence) {
		return (coursePersistence.getId() == null) ? save(coursePersistence) : update(coursePersistence);
	}

	/**
	 * Método que actualiza un CoursePersistence
	 * @param CoursePersistence coursePersistence
	 * @return CoursePersistence
	 */
	private CoursePersistence update(CoursePersistence coursePersistence) {
		return null;
	}

	/**
	 * Método que guarda un CoursePersistence
	 * @param CoursePersistence coursePersistence
	 * @return CoursePersistence
	 */
	private CoursePersistence save(CoursePersistence coursePersistence) {
		Mapper<CoursePersistence> mapper = new Mapper<CoursePersistence>(coursePersistence);
		mProvider.connect();
		coursePersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		mProvider.disconnect();
		return coursePersistence;
	}

	/**
	 * Método que busca todos los schoolPersistence que cumplan con los requisitos
	 * @param CoursePersistence coursePersistence
	 * @return List<CoursePersistence>
	 */
	public List<CoursePersistence> findAll(CoursePersistence coursePersistence) {
		Mapper<CoursePersistence> mapper = new Mapper<CoursePersistence>(coursePersistence);
		mProvider.connect();
		List<CoursePersistence> list = mapper.mapperAllToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return list;
	}

	/**
	 * Método que busca un CoursePersistence que cumpla con los requisitos
	 * @param CoursePersistence coursePersistence
	 * @return CoursePersistence
	 */
	public CoursePersistence find(CoursePersistence coursePersistence) {
		Mapper<CoursePersistence> mapper = new Mapper<CoursePersistence>(coursePersistence);
		mProvider.connect();
		CoursePersistence persistence = mapper.mapperToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return persistence;
	}

}
