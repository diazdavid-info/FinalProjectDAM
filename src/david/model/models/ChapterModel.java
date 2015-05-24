/**
 * Modelo para todo lo relacionado con un chapter
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.Map;

import david.model.validate.form.ChapterCreateForm;
import david.model.validate.form.IWebCreateChapter;

public class ChapterModel implements DChapterModel{
	
	/**
	 * Método que gestiona la creación de un chapter
	 * @param Map<String, String[]> requestParameter
	 */
	public void createChapter(Map<String, String[]> parameter){
		IWebCreateChapter form = new ChapterCreateForm();
		
		if(form.validate(parameter)){
			
		}
	}

}
