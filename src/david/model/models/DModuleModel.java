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
	 * @param Map<String, String[]> requestParameter
	 */
	public void createModule(Map<String, String[]> requestParameter);

	/**
	 * Método que busca los módulos de un ciclo
	 * @param Cycle cycle
	 * @return List<Cycle>
	 */
	public List<Module> findModuleByCycle(Cycle cycle);

}
