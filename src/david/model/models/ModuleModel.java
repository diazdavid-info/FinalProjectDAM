/**
 * Modelo para todo lo relacionado con un module
 * @author David Díaz García
 * @date 18-05-2015
 */
package david.model.models;

import java.util.Map;

import david.model.factory.ModelFactory;
import david.model.persistence.ModulePersistence;
import david.model.pojo.builder.ModuleBuilder;
import david.model.pojo.builder.UserBuilder;
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
		DUserModel userModel = ModelFactory.createUserModel();
		
		IWebCreateModule form = new ModuleCreateForm();
		
		if(form.validate(parameter)) {
			User user = userModel.findUser(new User(new UserBuilder().setId(Integer.parseInt(form.getTutor()))));
			
			Module module = new Module(new ModuleBuilder().hour(Integer.parseInt(form.getHour())).identification(form.getCode()).name(form.getName()).teacher(user));
			ModulePersistence modulePersistence = mIModuleTransformer.entityToPersistence(module);
			modulePersistence.setCycle(Integer.parseInt(form.getCycle()));
			module = mIModuleTransformer.persistenceToEntity(mModuleRepository.storage(modulePersistence));
			
			System.out.println("FORMULARIO CRETE MODULE ES VALIDO");
		}
		System.out.println("FORMULARIO CRETE MODULE NO ES VALIDO");
	}

}
