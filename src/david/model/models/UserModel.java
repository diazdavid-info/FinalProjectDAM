/**
 * Modelo para todo lo relacionado con un usuario
 * @author David Díaz García
 * @date 19-04-2015
 * @version 1.0
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import david.model.persistence.AddressPersistence;
import david.model.persistence.PersonPersistence;
import david.model.persistence.RolePersistence;
import david.model.persistence.UserPersistence;
import david.model.pojo.builder.AddressBuilder;
import david.model.pojo.builder.PersonBuilder;
import david.model.pojo.builder.RoleBuilder;
import david.model.pojo.builder.UserBuilder;
import david.model.pojo.contact.Address;
import david.model.pojo.permission.Role;
import david.model.pojo.users.Person;
import david.model.pojo.users.User;
import david.model.repository.AddressRepository;
import david.model.repository.PersonRepository;
import david.model.repository.RoleRepository;
import david.model.repository.UserRepository;
import david.model.transformer.IAddressTransformer;
import david.model.transformer.IPersonTransformer;
import david.model.transformer.IRoleTransformer;
import david.model.transformer.IUserTransformer;
import david.model.validate.form.IWebCreateUser;
import david.model.validate.form.LoginForm;
import david.model.validate.form.UserCreateForm;
import david.security.Encryptor;
import david.utils.Message;

public class UserModel implements DUserModel {

	/**
	 * Atributo que almacena el transformador de usuarios
	 */
	private IUserTransformer mIUserTransformer;
	/**
	 * Atributo que almacena el transformador de personas
	 */
	private IPersonTransformer mIPersonTransformer;
	/**
	 * Atributo que almacena el transformador de direcciones
	 */
	private IAddressTransformer mIAddressTransformer;
	/**
	 * Atributo que almacena el transformer de los roles
	 */
	private IRoleTransformer mIRoleTransformer;
	/**
	 * Atributo que almacena el repositorio de usuarios
	 */
	private UserRepository mUserRepository;
	/**
	 * Atributo que almacena el repositorio de personas;
	 */
	private PersonRepository mPersonRepository;
	/**
	 * Atributo que almacena el repositorio de direcciones
	 */
	private AddressRepository mAddressRepository;
	/**
	 * Atributo que almacena el repositorio de los Roles
	 */
	private RoleRepository mRoleRepository;

	/**
	 * Constructor
	 */
	public UserModel(IUserTransformer userTransformer, UserRepository userRepository, IPersonTransformer personTransformer, PersonRepository personRepository, IAddressTransformer addressTransformer,
			AddressRepository addressRepository, IRoleTransformer roleTransformer, RoleRepository roleRepository) {

		mIUserTransformer = userTransformer;
		mUserRepository = userRepository;
		mIPersonTransformer = personTransformer;
		mPersonRepository = personRepository;
		mIAddressTransformer = addressTransformer;
		mAddressRepository = addressRepository;
		mIRoleTransformer = roleTransformer;
		mRoleRepository = roleRepository;
	}

	/**
	 * Método que gestiona el login de usuarios
	 * 
	 * @return User
	 */
	@Override
	public User loginUser(Map<String, String[]> parameter) {
		User user = null;
		LoginForm form = new LoginForm();
		if (form.validate(parameter)) {
			user = new User(new UserBuilder().setUsername(form.getUsername()).setPassword(form.getPassword()));
			System.out.println("PASSWORD CIFRADA: " + Encryptor.encriptionMD5(form.getPassword()));
			UserPersistence userPersistence = mIUserTransformer.entityToPersistence(user);
			if (mUserRepository.find(userPersistence).getId() == null) {
				user = null;
				Message.addMesagge("El usuario o la contraseña no coinciden");
			} else {
				user = mIUserTransformer.persistenceToEntity(userPersistence);
			}
		}
		return user;
	}

	/**
	 * Método que solicita y gestiona la lista de usuarios
	 * 
	 * @return List<User>
	 */
	@Override
	public List<User> listUser() {
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

	/**
	 * Método que gestiona la creación de usuarios
	 * 
	 * @param Map
	 *            <String, String[]> requestParameter
	 */
	@Override
	public void createUser(Map<String, String[]> parameter) {
		User user = null;
		Person person = null;
		Address address = null;
		Role role = null;
		IWebCreateUser form = new UserCreateForm();
		if (form.validate(parameter)) {
			address = new Address(new AddressBuilder().province(form.getProvince()).population(form.getPopulation()).description(form.getDescription()));
			AddressPersistence addressPersistence = mIAddressTransformer.entityToPersistence(address);
			address = mIAddressTransformer.persistenceToEntity(mAddressRepository.storage(addressPersistence));

			person = new Person(new PersonBuilder().name(form.getName()).nif(form.getNif()).surname1(form.getSurname1()).surname2(form.getSurname2()).email(form.getEmail()));
			PersonPersistence personPersistence = mIPersonTransformer.entityToPersistence(person);
			person = mIPersonTransformer.persistenceToEntity(mPersonRepository.storage(personPersistence));

			role = new Role(new RoleBuilder().id(Integer.parseInt(form.getRole())));
			RolePersistence rolePersistence = mIRoleTransformer.entityToPersistence(role);
			role = mIRoleTransformer.persistenceToEntity(mRoleRepository.find(rolePersistence));

			user = new User(new UserBuilder().setUsername(form.getUsername()).setPassword(form.getPassword()).setPerson(person).setAddress(address).setRole(role));
			UserPersistence userPersistence = mIUserTransformer.entityToPersistence(user);
			user = mIUserTransformer.persistenceToEntity(mUserRepository.storage(userPersistence));

			System.out.println("VALIDO");
		}
		System.out.println("NO VALIDO");
	}

	/**
	 * Método que gestiona la lista de tutores
	 * 
	 * @return List<User>
	 */
	@Override
	public List<User> listTutors() {
		Role role = new Role(new RoleBuilder().nameRol("Profesor"));
		RolePersistence rolePersistence = mIRoleTransformer.entityToPersistence(role);
		role = mIRoleTransformer.persistenceToEntity(mRoleRepository.find(rolePersistence));

		User user = new User(new UserBuilder().setRole(role));
		UserPersistence userPersistence = mIUserTransformer.entityToPersistence(user);
		List<UserPersistence> listUserPersistence = mUserRepository.findAll(userPersistence);

		List<User> listUser = new ArrayList<User>();
		for (UserPersistence persistence : listUserPersistence) {
			listUser.add(mIUserTransformer.persistenceToEntity(persistence));
		}
		return listUser;
	}

	/**
	 * Método que solicita y gestiona la busqueda de un user
	 * 
	 * @param User
	 *            user
	 * @return User
	 */
	@Override
	public User findUser(User user) {
		UserPersistence userPersistence = mIUserTransformer.entityToPersistence(user);
		return mIUserTransformer.persistenceToEntity(mUserRepository.find(userPersistence));
	}

	/**
	 * Método que solicita y gstiona la busqueda de alumnos
	 * 
	 * @return List<User>
	 */
	@Override
	public List<User> listPupils() {
		Role role = new Role(new RoleBuilder().nameRol("Alumno"));
		RolePersistence rolePersistence = mIRoleTransformer.entityToPersistence(role);
		role = mIRoleTransformer.persistenceToEntity(mRoleRepository.find(rolePersistence));

		User user = new User(new UserBuilder().setRole(role));
		UserPersistence userPersistence = mIUserTransformer.entityToPersistence(user);
		List<UserPersistence> listUserPersistence = mUserRepository.findAll(userPersistence);

		List<User> listUser = new ArrayList<User>();
		for (UserPersistence persistence : listUserPersistence) {
			listUser.add(mIUserTransformer.persistenceToEntity(persistence));
		}
		return listUser;
	}
}
