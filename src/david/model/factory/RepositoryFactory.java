/**
 * Factoria de repositorios
 * @author David Diaz Garcia
 * @date 24-04-2015
 */
package david.model.factory;

import david.model.repository.AddressRepository;
import david.model.repository.CourseRepository;
import david.model.repository.CourseSchoolRepository;
import david.model.repository.PersonRepository;
import david.model.repository.RoleRepository;
import david.model.repository.SchoolRepository;
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
	
	/**
	 * Método que fabrica un SchoolRepository
	 * @return SchoolRepository
	 */
	public static SchoolRepository createSchoolRepository() {
		return new SchoolRepository(ProviderFactory.createMysqlProvider());
	}

	/**
	 * Método que fabrica un CourseRepository
	 * @return CourseRepository
	 */
	public static CourseRepository createCourseRepository() {
		return new CourseRepository(ProviderFactory.createMysqlProvider());
	}

	/**
	 * Método que fabrica un CourseSchoolRepository
	 * @return CourseSchoolRepository
	 */
	public static CourseSchoolRepository createCourseSchoolRepository() {
		return new CourseSchoolRepository(ProviderFactory.createMysqlProvider());
	}
	

}
