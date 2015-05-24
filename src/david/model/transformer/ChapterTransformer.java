/**
 * Clase que transforma la entidad Chapter
 * @author David Diaz Garcia
 * @date 26-05-2015
 */
package david.model.transformer;

import david.model.persistence.ChapterPersistence;
import david.model.pojo.builder.ChapterBuilder;
import david.model.pojo.school.Chapter;

public class ChapterTransformer implements IChapterTransformer {

	/**
	 * Método que transforma la entidad Chapter en la persistencia Chapter
	 * @param Chapter chapter
	 * @return ChapterPersistence 
	 */
	public ChapterPersistence entityToPersistence(Chapter chapter){
		ChapterPersistence persistence = new ChapterPersistence();
		persistence.setHour(chapter.getHour());
		
		if(chapter.getId() != 0){
			persistence.setId(chapter.getId());
		}
		
		persistence.setName(chapter.getName());
		
		return persistence;
	}
	
	/**
	 * Método que transforma la persistencia de Chapter en la entidad Chapter
	 * @param ChapterPersistence chapterPersistence
	 * @return Chapter
	 */
	public Chapter persistenceToEntity(ChapterPersistence chapterPersistence){
		ChapterBuilder chapterBuilder = new ChapterBuilder();
		chapterBuilder
		.hour(chapterPersistence.getHour())
		.id(chapterPersistence.getId())
		.name(chapterPersistence.getName());
		return new Chapter(chapterBuilder);
	}

}
