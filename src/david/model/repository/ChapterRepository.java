/**
 * Repositorio para la persistencia de Chapter
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.repository;

import java.util.List;

import david.model.mapper.Mapper;
import david.model.persistence.ChapterPersistence;
import david.model.provider.DProvider;

public class ChapterRepository {
	
	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;
	
	/**
	 * Constructor
	 * @param DProvider provider
	 */
	public ChapterRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que guarda un ChapterPersistence
	 * @param chapterPersistence
	 * @return ChapterRepository
	 */
	public ChapterPersistence storage(ChapterPersistence chapterPersistence) {
		return (chapterPersistence.getId() == null) ? save(chapterPersistence) : update(chapterPersistence);
	}

	/**
	 * Método que actualiza un ChapterPersistence
	 * @param ChapterPersistence chapterPersistence
	 * @return ChapterPersistence
	 */
	private ChapterPersistence update(ChapterPersistence chapterPersistence) {
		return null;
	}

	/**
	 * Método que almacena un ChapterPersistence
	 * @param ChapterPersistence chapterPersistence
	 * @return ChapterPersistence
	 */
	private ChapterPersistence save(ChapterPersistence chapterPersistence) {
		Mapper<ChapterPersistence> mapper = new Mapper<ChapterPersistence>(chapterPersistence);
		mProvider.connect();
		chapterPersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		mProvider.disconnect();
		return chapterPersistence;
	}

	/**
	 * Método que busca todos los chapterPersistence que cumplan con los requisitos
	 * @param ChapterPersistence chapterPersistence
	 * @return List<ChapterPersistence>
	 */
	public List<ChapterPersistence> findAll(ChapterPersistence chapterPersistence) {
		Mapper<ChapterPersistence> mapper = new Mapper<ChapterPersistence>(chapterPersistence);
		mProvider.connect();
		List<ChapterPersistence> list = mapper.mapperAllToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return list;
	}

	/**
	 * Método que busca un chapterPersistence que cumplan con los requisitos
	 * @param ChapterPersistence chapterPersistence
	 * @return ChapterPersistence
	 */
	public ChapterPersistence find(ChapterPersistence chapterPersistence) {
		Mapper<ChapterPersistence> mapper = new Mapper<ChapterPersistence>(chapterPersistence);
		mProvider.connect();
		ChapterPersistence persistence = mapper.mapperToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return persistence;
	}

}
