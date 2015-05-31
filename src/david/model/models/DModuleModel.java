/**
 * Interfaz para que implemente el modelo de module
 * @author David Díaz García
 * @date 18-05-2015
 */
package david.model.models;

import java.util.List;
import java.util.Map;

import david.model.pojo.school.Cycle;
import david.model.pojo.school.Module;

public interface DModuleModel {

	/**
	 * Método que gestiona la creación de un modulo
	 * 
	 * @param Map
	 *            <String, String[]> requestParameter
	 */
	public void createModule(Map<String, String[]> requestParameter);

	/**
	 * Método que busca los módulos de un ciclo
	 * 
	 * @param Cycle
	 *            cycle
	 * @return List<Cycle>
	 */
	public List<Module> findModuleByCycle(Cycle cycle);

	/**
	 * Método que busca los módulos de un curso, instituto y ciclo
	 * 
	 * @param int courseId
	 * @param int schoolId
	 * @param int cycleId
	 * @return List<Module>
	 */
	public List<Module> listModule(int courseId, int schoolId, int cycleId);

	/**
	 * Método que solicita y gestiona la busqueda de un módulo
	 * 
	 * @param Module
	 *            module
	 * @return Module
	 */
	public Module findModule(Module module);

	/**
	 * Método que gestiona la asociación entre usuario y módulo
	 * 
	 * @param Map
	 *            <String, String[]> requestParameter
	 */
	public void createUserModule(Map<String, String[]> requestParameter);

	/**
	 * Método que solicita y gestiona la busqueda una lista de módulos
	 * 
	 * @param Module
	 *            module
	 * @return List<Module>
	 */
	public List<Module> findAllModule(Module module);

}
