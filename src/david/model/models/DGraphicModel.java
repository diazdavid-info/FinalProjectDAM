/**
 * Interfaz para que implemente el modelo de graphic
 * @author David Díaz García
 * @date 31-05-2015
 */
package david.model.models;

import david.model.pojo.graphic.Graphic;

public interface DGraphicModel {

	/**
	 * Método que solicita una lista de graphic de un teacher
	 * 
	 * @param int teacherId
	 * @return List<Graphic>
	 */
	public Graphic listGraphicByTeacher(int teacherId);

}
