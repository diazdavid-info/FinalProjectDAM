/**
 * Clase encargada de construir modelos
 * @author David Díaz García
 * @date 19-04-2015
 * @version 1.0
 */
package david.model.factory;

import david.model.models.UserModel;

public class ModelFactory {
	
	/**
	 * Método que fabrica el modelo de usuarios
	 * @return UserModel
	 */
	public static UserModel createUserModel(){
		return new UserModel(TransformerFactory.createUserTransformer(), 
				RepositoryFactory.createUserRepository(), 
				TransformerFactory.createPersonTransformer(), 
				RepositoryFactory.createPersonRepository(),
				TransformerFactory.createAddressTransformer(),
				RepositoryFactory.createAddressRepository(),
				TransformerFactory.createRoletransformer(),
				RepositoryFactory.createRoleRepository());
	}

}
