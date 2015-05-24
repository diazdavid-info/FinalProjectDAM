/**
 * Intefaz que define el comportamiento de los transformadores de Chapter
 * @author David Díaz García
 * @date 24-05-2015
 */
package david.model.transformer;

import david.model.persistence.ChapterPersistence;
import david.model.pojo.school.Chapter;

public interface IChapterTransformer {
	
	/**
	 * Método que transforma la entidad Chapter en la persistencia Chapter
	 * @param Chapter chapter
	 * @return ChapterPersistence 
	 */
	public ChapterPersistence entityToPersistence(Chapter chapter);
	
	/**
	 * Método que transforma la persistencia de Chapter en la entidad Chapter
	 * @param ChapterPersistence chapterPersistence
	 * @return Chapter
	 */
	public Chapter persistenceToEntity(ChapterPersistence chapterPersistence);

}
