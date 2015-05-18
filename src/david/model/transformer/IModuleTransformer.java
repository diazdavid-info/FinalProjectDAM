/**
 * Intefaz que define el comportamiento de los transformadores de Module
 * @author David Díaz García
 * @date 18-05-2015
 */
package david.model.transformer;

import david.model.persistence.ModulePersistence;
import david.model.pojo.school.Module;

public interface IModuleTransformer {
	
	/**
	 * Método que transforma la entidad Module en la persistencia Module
	 * @param Module module
	 * @return ModulePersistence 
	 */
	public ModulePersistence entityToPersistence(Module module);
	
	/**
	 * Método que transforma la persistencia de Module en la entidad Module
	 * @param ModulePersistence modulePersistence
	 * @return Module
	 */
	public Module persistenceToEntity(ModulePersistence modulePersistence);

}
