/**
 * Repositorio para la persistencia de Chapter
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.repository;

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

}
