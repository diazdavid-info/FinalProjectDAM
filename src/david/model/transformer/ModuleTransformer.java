/**
 * Intefaz que define el comportamiento de los transformadores de Module
 * @author David Díaz García
 * @date 18-05-2015
 */
package david.model.transformer;

import david.model.persistence.ModulePersistence;
import david.model.pojo.builder.ModuleBuilder;
import david.model.pojo.school.Module;

public class ModuleTransformer implements IModuleTransformer{

	/**
	 * Método que transforma la entidad Module en la persistencia Module
	 * @param Module module
	 * @return ModulePersistence 
	 */
	public ModulePersistence entityToPersistence(Module module){
		ModulePersistence persistence = new ModulePersistence();
		persistence.setCode(module.getIdentification());
		persistence.setHour(module.getHour());
		
		if(module.getId() != 0){
			persistence.setId(module.getId());
		}
		
		persistence.setName(module.getName());
		
		if(module.getTeacher() != null){
			persistence.setTeacher(module.getTeacher().getId());
		}
		
		return persistence;
	}
	
	/**
	 * Método que transforma la persistencia de Module en la entidad Module
	 * @param ModulePersistence modulePersistence
	 * @return Module
	 */
	public Module persistenceToEntity(ModulePersistence modulePersistence){
		ModuleBuilder moduleBuilder = new ModuleBuilder();
		moduleBuilder
		.identification(modulePersistence.getCode())
		.hour(modulePersistence.getHour())
		.id(modulePersistence.getId())
		.name(modulePersistence.getName());
		return new Module(moduleBuilder);
	}
	
}
