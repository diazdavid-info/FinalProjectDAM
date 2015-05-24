/**
 * Interfaz para que implemente el modelo de chapter
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.Map;

public interface DChapterModel {

	/**
	 * Método que gestiona la creación de un chapter
	 * @param Map<String, String[]> requestParameter
	 */
	public void createChapter(Map<String, String[]> requestParameter);

}
