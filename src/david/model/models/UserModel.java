/**
 * Modelo para todo lo relacionado con un usuario
 * @author David Díaz García
 * @date 19-05-2015
 * @version 1.0
 */
package david.model.models;

import java.util.Map;

import david.model.factory.RepositoryFactory;
import david.model.factory.TransformerFactory;
import david.model.persistence.UserPersistence;
import david.model.pojo.builder.UserBuilder;
import david.model.pojo.users.User;
import david.model.repository.UserRepository;
import david.model.transformer.IUserTransformer;
import david.model.validate.form.LoginForm;
import david.utils.Message;

public class UserModel implements DUserModel{
	
	/**
	 * Método que gestiona el login de usuarios
	 * @return User
	 */
	public User loginUser(Map<String, String[]> parameter){
		User user = null;
		LoginForm form = new LoginForm();
		if(form.validate(parameter)){
			user = new User(new UserBuilder().setUsername(form.getUsername()).setPassword(form.getPassword()));
			IUserTransformer userTranformer = TransformerFactory.createUserTransformer();
			UserPersistence userPersistence = userTranformer.entityToPersistence(user);
			UserRepository userRepository = RepositoryFactory.createUserRepository();
			if(userRepository.find(userPersistence).getId() == null){
				user = null;
				Message.addMesagge("El usuario o la contraseña no coinciden");
			}else{
				user = userTranformer.persistenceToEntity(userPersistence);
			}
		}
		System.out.println("Estoy en el UserModel");
		return user;
	}

}
