/**
 * Modelo para todo lo relacionado con un module
 * @author David Díaz García
 * @date 18-05-2015
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import david.model.factory.ModelFactory;
import david.model.persistence.ModulePersistence;
import david.model.pojo.builder.CycleBuilder;
import david.model.pojo.builder.ModuleBuilder;
import david.model.pojo.builder.UserBuilder;
import david.model.pojo.school.Cycle;
import david.model.pojo.school.Module;
import david.model.pojo.users.User;
import david.model.repository.ModuleRepository;
import david.model.transformer.IModuleTransformer;
import david.model.validate.form.IWebCreateModule;
import david.model.validate.form.ModuleCreateForm;

public class ModuleModel implements DModuleModel{
	
	/**
	 * Atributo que almacena el transformador de modulos
	 */
	private IModuleTransformer mIModuleTransformer;
	/**
	 * Atributo que almcena el repositorio de modulos
	 */
	private ModuleRepository mModuleRepository;
	
	/**
	 * Constructor
	 * @param moduleTransformer
	 * @param moduleRepository
	 */
	public ModuleModel(IModuleTransformer moduleTransformer, ModuleRepository moduleRepository) {
		mIModuleTransformer = moduleTransformer;
		mModuleRepository = moduleRepository;
	}
	
	/**
	 * Método que gestiona la creación de un modulo
	 * @param Map<String, String[]> parameter
	 */
	public void createModule(Map<String, String[]> parameter){
		IWebCreateModule form = new ModuleCreateForm();
		DUserModel userModel = ModelFactory.createUserModel();
		
		if(form.validate(parameter)) {
			User user = userModel.findUser(new User(new UserBuilder().setId(Integer.parseInt(form.getTutor()))));
			
			Module module = new Module(new ModuleBuilder().hour(Integer.parseInt(form.getHour())).identification(form.getCode()).name(form.getName()).teacher(user));
			ModulePersistence modulePersistence = mIModuleTransformer.entityToPersistence(module);
			modulePersistence.setCycle(Integer.parseInt(form.getCycle()));
			module = mIModuleTransformer.persistenceToEntity(mModuleRepository.storage(modulePersistence));
		}
	}
	
	/**
	 * Método que busca los módulos de un ciclo
	 * @param Cycle cycle
	 * @return List<Cycle>
	 */
	public List<Module> findModuleByCycle(Cycle cycle){
		List<Module> listModule = new ArrayList<Module>();
		DUserModel userModel = ModelFactory.createUserModel();
		
		ModulePersistence modulePersistence = new ModulePersistence();
		modulePersistence.setCycle(cycle.getId());
		List<ModulePersistence> listPersistence = mModuleRepository.findAll(modulePersistence);
		
		for (ModulePersistence persistence : listPersistence) {
			Module module = mIModuleTransformer.persistenceToEntity(persistence);
			module.setTeacher(userModel.findUser(new User(new UserBuilder().setId(persistence.getTeacher()))));
			listModule.add(module);
		}
		
		return listModule;
	}
	
	/**
	 * Método que busca los módulos de un curso, instituto y ciclo
	 * @param int courseId
	 * @param int schoolId
	 * @param int cycleId
	 * @return List<Module>
	 */
	public List<Module> listModule(int courseId, int schoolId, int cycleId){
		DCycleModel cycleModel = ModelFactory.createCycleModel();
		Cycle cycle = cycleModel.findCycle(new Cycle(new CycleBuilder().id(cycleId)));
		return cycle.getModule();
	}
	
	/**
	 * Método que solicita y gestiona la busqueda de un módulo
	 * @param Module module
	 * @return Module
	 */
	public Module findModule(Module module){
		ModulePersistence modulePersistence = mIModuleTransformer.entityToPersistence(module);
		return mIModuleTransformer.persistenceToEntity(mModuleRepository.find(modulePersistence));
	}

}
