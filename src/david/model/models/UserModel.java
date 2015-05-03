/**
 * Modelo para todo lo relacionado con un usuario
 * @author David Díaz García
 * @date 19-05-2015
 * @version 1.0
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import david.model.persistence.PersonPersistence;
import david.model.persistence.UserPersistence;
import david.model.pojo.builder.PersonBuilder;
import david.model.pojo.builder.UserBuilder;
import david.model.pojo.users.Person;
import david.model.pojo.users.User;
import david.model.repository.PersonRepository;
import david.model.repository.UserRepository;
import david.model.transformer.IPersonTransformer;
import david.model.transformer.IUserTransformer;
import david.model.validate.form.LoginForm;
import david.utils.Message;

public class UserModel implements DUserModel{
	
	/**
	 * Atributo que almacena el transformador de usuarios
	 */
	private IUserTransformer mIUserTransformer;
	/**
	 * Atributo que almacena el transformador de personas
	 */
	private IPersonTransformer mIPersonTransformer;
	/**
	 * Atributo que almacena el repositorio de usuarios
	 */
	private UserRepository mUserRepository;
	/**
	 * Atributo que almacena el repositorio de personas;
	 */
	private PersonRepository mPersonRepository;
	
	/**
	 * Constructor
	 */
	public UserModel(IUserTransformer userTransformer, UserRepository userRepository, IPersonTransformer personTransformer, PersonRepository personRepository) {
		mIUserTransformer = userTransformer;
		mUserRepository = userRepository;
		mIPersonTransformer = personTransformer;
		mPersonRepository = personRepository;
	}
	
	/**
	 * Método que gestiona el login de usuarios
	 * @return User
	 */
	public User loginUser(Map<String, String[]> parameter){
		User user = null;
		LoginForm form = new LoginForm();
		if(form.validate(parameter)){
			user = new User(new UserBuilder().setUsername(form.getUsername()).setPassword(form.getPassword()));
			UserPersistence userPersistence = mIUserTransformer.entityToPersistence(user);
			if(mUserRepository.find(userPersistence).getId() == null){
				user = null;
				Message.addMesagge("El usuario o la contraseña no coinciden");
			}else{
				user = mIUserTransformer.persistenceToEntity(userPersistence);
			}
		}
		System.out.println("Estoy en el UserModel");
		return user;
	}
	
	/**
	 * Método que solicita y gestiona la lista de usuarios
	 * @return List<User>
	 */
	public List<User> listUser(){
		List<User> listUser = new ArrayList<User>();
		List<UserPersistence> usersPersistence = mUserRepository.findAll(new UserPersistence());
		for (UserPersistence userPersistence : usersPersistence) {
			PersonPersistence personPersistence = mIPersonTransformer.entityToPersistence(new Person(new PersonBuilder()));
			
			User user = mIUserTransformer.persistenceToEntity(userPersistence);
			
			personPersistence.setId(userPersistence.getIdPerson());
			personPersistence = mPersonRepository.find(personPersistence);
			
			user.setPerson(mIPersonTransformer.persistenceToEntity(personPersistence));
			
			listUser.add(user);
		}
		return listUser;
	}
}
