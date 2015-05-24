/**
 * Modelo para todo lo relacionado con un chapter
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.Map;

import david.model.persistence.ChapterPersistence;
import david.model.pojo.builder.ChapterBuilder;
import david.model.pojo.school.Chapter;
import david.model.repository.ChapterRepository;
import david.model.transformer.IChapterTransformer;
import david.model.validate.form.ChapterCreateForm;
import david.model.validate.form.IWebCreateChapter;

public class ChapterModel implements DChapterModel{
	
	/**
	 * Atributo que almacena el transformador de chapter
	 */
	private IChapterTransformer mIChapterTransformer;
	/**
	 * Atributo que almacena el repositorio de Chapter
	 */
	private ChapterRepository mChapterRepository;
	
	public ChapterModel(IChapterTransformer chapterTransformer, ChapterRepository chapterRepository) {
		mIChapterTransformer = chapterTransformer;
		mChapterRepository = chapterRepository;
	}
	
	/**
	 * Método que gestiona la creación de un chapter
	 * @param Map<String, String[]> requestParameter
	 */
	public void createChapter(Map<String, String[]> parameter){
		IWebCreateChapter form = new ChapterCreateForm();
		
		if(form.validate(parameter)){
			Chapter chapter = new Chapter(new ChapterBuilder().hour(Integer.parseInt(form.getHour())).name(form.getName()));
			ChapterPersistence chapterPersistence = mIChapterTransformer.entityToPersistence(chapter);
			chapterPersistence.setModule(Integer.parseInt(form.getModule()));
			chapter = mIChapterTransformer.persistenceToEntity(mChapterRepository.storage(chapterPersistence));
		}
	}

}
