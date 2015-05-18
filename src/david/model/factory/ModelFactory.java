/**
 * Clase encargada de construir modelos
 * @author David Díaz García
 * @date 19-04-2015
 * @version 1.0
 */
package david.model.factory;

import david.model.models.CourseModel;
import david.model.models.CycleModel;
import david.model.models.DCourseModel;
import david.model.models.DCycleModel;
import david.model.models.DModuleModel;
import david.model.models.DSchoolModel;
import david.model.models.DUserModel;
import david.model.models.ModuleModel;
import david.model.models.SchoolModel;
import david.model.models.UserModel;

public class ModelFactory {
	
	/**
	 * Método que fabrica el modelo de usuarios
	 * @return DUserModel
	 */
	public static DUserModel createUserModel(){
		return new UserModel(TransformerFactory.createUserTransformer(), 
				RepositoryFactory.createUserRepository(), 
				TransformerFactory.createPersonTransformer(), 
				RepositoryFactory.createPersonRepository(),
				TransformerFactory.createAddressTransformer(),
				RepositoryFactory.createAddressRepository(),
				TransformerFactory.createRoletransformer(),
				RepositoryFactory.createRoleRepository());
	}

	/**
	 * Método que fabrica el modelo de institutos
	 * @return DSchoolModel
	 */
	public static DSchoolModel createSchoolModel() {
		return new SchoolModel(TransformerFactory.createAddressTransformer(),
				RepositoryFactory.createAddressRepository(),
				TransformerFactory.createSchoolTransformer(),
				RepositoryFactory.createSchoolRepository(),
				TransformerFactory.createCourseTransformer(),
				RepositoryFactory.createCourseRepository(),
				TransformerFactory.createCourseSchoolTransformer(),
				RepositoryFactory.createCourseSchoolRepository());
	}

	/**
	 * Método que fabrica el modelo de cursos
	 * @return DCourseModel
	 */
	public static DCourseModel createCourseModel() {
		return new CourseModel(TransformerFactory.createCourseTransformer(), 
				RepositoryFactory.createCourseRepository());
	}

	/**
	 * Método que fabrica el modelo de ciclos
	 * @return DCycleModel
	 */
	public static DCycleModel createCycleModel() {
		return new CycleModel(TransformerFactory.createCourseTransformer(),
				RepositoryFactory.createCourseRepository(),
				TransformerFactory.createSchoolTransformer(),
				RepositoryFactory.createSchoolRepository(),
				TransformerFactory.createUserTransformer(),
				RepositoryFactory.createUserRepository(),
				TransformerFactory.createCycleTransformer(),
				RepositoryFactory.createCycleRepository());
	}

	/**
	 * Método que fabrica el modelo de módulos
	 * @return DModuleModel
	 */
	public static DModuleModel createModuleModel() {
		return new ModuleModel(TransformerFactory.createModuleTransformer(), RepositoryFactory.createModuleRepository());
	}
}
