/**
 * Clase que transforma entidades en persistencia
 * @author David Díaz García
 * @date 23-04-2015
 */
package david.model.transformer;

import david.model.persistence.UserPersistence;
import david.model.pojo.builder.UserBuilder;
import david.model.pojo.users.User;

public class UserTransformer implements IUserTransformer{

	/**
	 * Método que transforma la entidad User en la persistencia User
	 * @param User user
	 * @return UserPersistence 
	 */
	public UserPersistence entityToPersistence(User user){
		UserPersistence userPersistence = new UserPersistence();
		
		if(user.getId() != 0){
			userPersistence.setId(user.getId());
		}
		
		userPersistence.setUsername(user.getUsername());
		userPersistence.setPassword(user.getPassword());
		
		if(user.getAddress() != null){
			userPersistence.setAddress(user.getAddress().getId());
		}
		
		if(user.getRole() != null){
			userPersistence.setRole(user.getRole().getId());
		}
		
		if(user.getPerson() != null){
			userPersistence.setIdPerson(user.getPerson().getId());
		}
		
		return userPersistence;
	}
	
	/**
	 * Método que transforma la persistencia de usuario en la entidad usuario
	 * @param UserPersistence userPersistence
	 * @return User
	 */
	public User persistenceToEntity(UserPersistence userPersistence){
		User user = new User(new UserBuilder()
			.setId(userPersistence.getId())
			.setUsername(userPersistence.getUsername())
			.setPassword(userPersistence.getPassword())
		);
		return user;
	}
}
