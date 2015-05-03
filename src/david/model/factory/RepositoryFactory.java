/**
 * Factoria de repositorios
 * @author David Diaz Garcia
 * @date 24-04-2015
 */
package david.model.factory;

import david.model.repository.AddressRepository;
import david.model.repository.PersonRepository;
import david.model.repository.RoleRepository;
import david.model.repository.UserRepository;

public class RepositoryFactory {

	/**
	 * Método que fabrica un UserRepository
	 * @return UserRepository
	 */
	public static UserRepository createUserRepository() {
		return new UserRepository(ProviderFactory.createMysqlProvider());
	}
	
	/**
	 * Método que fabricca un PersonRepository
	 * @return PersonRepository
	 */
	public static PersonRepository createPersonRepository() {
		return new PersonRepository(ProviderFactory.createMysqlProvider());
	}

	/**
	 * Método que fabrica un AddressRepository
	 * @return AddressRepository
	 */
	public static AddressRepository createAddressRepository() {
		return new AddressRepository(ProviderFactory.createMysqlProvider());
	}

	/**
	 * Método que fabrica un RoleRepository
	 * @return RoleRepository
	 */
	public static RoleRepository createRoleRepository() {
		return new RoleRepository(ProviderFactory.createMysqlProvider());
	}

}
