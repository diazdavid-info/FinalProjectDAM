/**
 * Clase encargada de construir modelos
 * @author David Díaz García
 * @date 19-04-2015
 * @version 1.0
 */
package david.model.factory;

import david.model.models.AddressModel;
import david.model.models.ChapterModel;
import david.model.models.CourseModel;
import david.model.models.CourseSchoolModel;
import david.model.models.CycleModel;
import david.model.models.DAddressModel;
import david.model.models.DChapterModel;
import david.model.models.DCourseModel;
import david.model.models.DCourseSchoolModel;
import david.model.models.DCycleModel;
import david.model.models.DFunctionalityModel;
import david.model.models.DGraphicModel;
import david.model.models.DModuleModel;
import david.model.models.DRoleModel;
import david.model.models.DSchoolModel;
import david.model.models.DSessionModel;
import david.model.models.DSubtypeModel;
import david.model.models.DTypeModel;
import david.model.models.DUserModel;
import david.model.models.FunctionalityModel;
import david.model.models.GraphicModel;
import david.model.models.ModuleModel;
import david.model.models.RoleModel;
import david.model.models.SchoolModel;
import david.model.models.SessionModel;
import david.model.models.SubtypeModel;
import david.model.models.TypeModel;
import david.model.models.UserModel;

public class ModelFactory {

	/**
	 * Método que fabrica el modelo de usuarios
	 * 
	 * @return DUserModel
	 */
	public static DUserModel createUserModel() {
		return new UserModel(TransformerFactory.createUserTransformer(), RepositoryFactory.createUserRepository(), TransformerFactory.createPersonTransformer(),
				RepositoryFactory.createPersonRepository(), TransformerFactory.createAddressTransformer(), RepositoryFactory.createAddressRepository(), TransformerFactory.createRoletransformer(),
				RepositoryFactory.createRoleRepository());
	}

	/**
	 * Método que fabrica el modelo de institutos
	 * 
	 * @return DSchoolModel
	 */
	public static DSchoolModel createSchoolModel() {
		return new SchoolModel(TransformerFactory.createSchoolTransformer(), RepositoryFactory.createSchoolRepository());
	}

	/**
	 * Método que fabrica el modelo de cursos
	 * 
	 * @return DCourseModel
	 */
	public static DCourseModel createCourseModel() {
		return new CourseModel(TransformerFactory.createCourseTransformer(), RepositoryFactory.createCourseRepository());
	}

	/**
	 * Método que fabrica el modelo de ciclos
	 * 
	 * @return DCycleModel
	 */
	public static DCycleModel createCycleModel() {
		return new CycleModel(TransformerFactory.createCycleTransformer(), RepositoryFactory.createCycleRepository());
	}

	/**
	 * Método que fabrica el modelo de módulos
	 * 
	 * @return DModuleModel
	 */
	public static DModuleModel createModuleModel() {
		return new ModuleModel(TransformerFactory.createModuleTransformer(), RepositoryFactory.createModuleRepository(), RepositoryFactory.createUserModuleRepository());
	}

	/**
	 * Método que fabrica el modelo de direcciones
	 * 
	 * @return DAddressModel
	 */
	public static DAddressModel createAddressModel() {
		return new AddressModel(TransformerFactory.createAddressTransformer(), RepositoryFactory.createAddressRepository());
	}

	/**
	 * Método que fabrica el modelo de curso instituto
	 * 
	 * @return DCourseSchoolModel
	 */
	public static DCourseSchoolModel createCourseSchoolModel() {
		return new CourseSchoolModel(TransformerFactory.createCourseSchoolTransformer(), RepositoryFactory.createCourseSchoolRepository());
	}

	/**
	 * Método que fabrica el modelo de tipo de sesión
	 * 
	 * @return DTypeModel
	 */
	public static DTypeModel createTypeModel() {
		return new TypeModel(TransformerFactory.createTypeTransformer(), RepositoryFactory.createTypeRepository());
	}

	/**
	 * Método que fabrica el modelo de subtipo de sesión
	 * 
	 * @return DSubtypeModel
	 */
	public static DSubtypeModel createSubtypeModel() {
		return new SubtypeModel(TransformerFactory.createSubtypeTransformer(), RepositoryFactory.createSubtypeRepository());
	}

	/**
	 * Método que fabrica el modelo de chapter
	 * 
	 * @return DChapterModel
	 */
	public static DChapterModel createChapterModel() {
		return new ChapterModel(TransformerFactory.createChapterTransformer(), RepositoryFactory.createChapterRepository());
	}

	/**
	 * Método que fabrica el modelo de session
	 * 
	 * @return DChapterModel
	 */
	public static DSessionModel createSessionModel() {
		return new SessionModel(TransformerFactory.createSessionTransformer(), RepositoryFactory.createSessionRepository());
	}

	/**
	 * Método que fabrica el modelo de graphic
	 * 
	 * @return DGraphicModel
	 */
	public static DGraphicModel createGraphicModel() {
		return new GraphicModel();
	}

	/**
	 * Método que fabrica el modelo de role
	 * 
	 * @return DRoleModel
	 */
	public static DRoleModel createRoleModel() {
		return new RoleModel(TransformerFactory.createRoletransformer(), RepositoryFactory.createRoleRepository());
	}

	/**
	 * Método que fabrica el modelo de functionality
	 * 
	 * @return DFunctionalityModel
	 */
	public static DFunctionalityModel createFunctionalityModel() {
		return new FunctionalityModel(TransformerFactory.createFunctionalityTransformer(), RepositoryFactory.createFunctionalityRepository(), RepositoryFactory.createRoleFunctionalityRepository());
	}
}
