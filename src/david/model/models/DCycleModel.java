/**
 * Interfaz para que implemente el modelo de cycle
 * @author David Díaz García
 * @date 17-05-2015
 */
package david.model.models;

import java.util.List;
import java.util.Map;

import david.model.pojo.school.Cycle;

public interface DCycleModel {
	
	/**
	 * Método que gestiona la creación de un ciclo
	 * @param Map<String, String[]> parameter
	 */
	public void createCycle(Map<String, String[]> parameter);

	/**
	 * Método que solicita y gestiona el listado de ciclos
	 * @return List<Cycle>
	 */
	public List<Cycle> listCycles();
	
	/**
	 * Método que solicita y gestiona el listado de ciclos
	 * @param int courseId
	 * @param int schoolId
	 * @return List<Cycle>
	 */
	public List<Cycle> listCycles(int courseId, int schoolId);

	/**
	 * Método que solicita y gestiona el listado de ciclos
	 * @param int courseId
	 * @param int schoolId
	 * @param int tutorId
	 * @return List<Cycle>
	 */
	public List<Cycle> listCycles(int courseId, int schoolId, int tutorId);

	/**
	 * Método que solicita y gestiona la busqueda de un ciclo
	 * @param Cycle cycle
	 * @return Cycle
	 */
	public Cycle findCycle(Cycle cycle);

	
}
