/**
 * Modelo para todo lo relacionado con un chapter
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;
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
	
	/**
	 * Método que gestiona la busqueda de los temarios de un módulo
	 * @param int moduleId
	 * @return List<Chapter>
	 */
	public List<Chapter> listChapterByModule(int moduleId){
		List<Chapter> list = new ArrayList<Chapter>();
		ChapterPersistence chapterPersistence = new ChapterPersistence();
		chapterPersistence.setModule(moduleId);
		List<ChapterPersistence> listChapterPersistence = mChapterRepository.findAll(chapterPersistence);
		
		for (ChapterPersistence chapterPersistence2 : listChapterPersistence) {
			list.add(mIChapterTransformer.persistenceToEntity(chapterPersistence2));
		}
		
		return list;
	}
	
	/**
	 * Método que gestiona la busqueda de un temario
	 * @param Chapter chapter
	 * @return Chapter
	 */
	public Chapter findChapter(Chapter chapter){
		ChapterPersistence chapterPersistence = mIChapterTransformer.entityToPersistence(chapter);
		return mIChapterTransformer.persistenceToEntity(mChapterRepository.find(chapterPersistence));
	}

}
