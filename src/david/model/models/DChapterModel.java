/**
 * Interfaz para que implemente el modelo de chapter
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.List;
import java.util.Map;

import david.model.pojo.school.Chapter;

public interface DChapterModel {

	/**
	 * Método que gestiona la creación de un chapter
	 * @param Map<String, String[]> requestParameter
	 */
	public void createChapter(Map<String, String[]> requestParameter);

	/**
	 * Método que gestiona la busqueda de los temarios de un módulo
	 * @param int moduleId
	 * @return List<Chapter>
	 */
	public List<Chapter> listChapterByModule(int moduleId);

	/**
	 * Método que gestiona la busqueda de un temario
	 * @param Chapter chapter
	 * @return Chapter
	 */
	public Chapter findChapter(Chapter chapter);

}
