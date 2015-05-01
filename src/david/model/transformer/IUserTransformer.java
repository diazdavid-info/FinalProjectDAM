/**
 * Intefaz que define el comportamiento de los transformadores de User
 * @author David Díaz García
 * @date 23-04-2015
 */
package david.model.transformer;

import david.model.persistence.UserPersistence;
import david.model.pojo.users.User;

public interface IUserTransformer {

	/**
	 * Método que transforma la entidad User en la persistencia User
	 * @param User user
	 * @return UserPersistence 
	 */
	public UserPersistence entityToPersistence(User user);
	
	/**
	 * Método que transforma la persistencia de usuario en la entidad usuario
	 * @param UserPersistence userPersistence
	 * @return User
	 */
	public User persistenceToEntity(UserPersistence userPersistence);
}
