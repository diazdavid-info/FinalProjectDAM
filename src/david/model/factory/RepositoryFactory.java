/**
 * Factoria de repositorios
 * @author David Diaz Garcia
 * @date 24-04-2015
 */
package david.model.factory;

import david.model.repository.PersonRepository;
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

}
