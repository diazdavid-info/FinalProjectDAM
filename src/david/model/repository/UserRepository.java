/**
 * Repositorio para la persistencia de User
 * @author David Díaz García
 * @date 24-04-2015
 */
package david.model.repository;

import java.util.List;

import david.model.mapper.Mapper;
import david.model.persistence.UserPersistence;
import david.model.provider.DProvider;

public class UserRepository {
	
	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;
	
	public UserRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que almacena la persistencia de user
	 * @param UserPersistence userPersistence
	 */
	public void storage(UserPersistence userPersistence) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Método que busca un UserPersistence que cumplan con los requisitos
	 * @param UserPersistence userPersistence
	 * @return UserPersistence
	 */
	public UserPersistence find(UserPersistence userPersistence) {
		Mapper<UserPersistence> mapper = new Mapper<UserPersistence>(userPersistence);
		return mapper.mapperToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
	}

	/**
	 * Método que busca todos los userPersistence que cumplan con los requisitos
	 * @param UserPersistence userPersistence
	 * @return List<UserPersistence>
	 */
	public List<UserPersistence> findAll(UserPersistence userPersistence) {
		Mapper<UserPersistence> mapper = new Mapper<UserPersistence>(userPersistence);
		System.out.println(mapper.mapperToDbb());
		return mapper.mapperAllToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
	}

}
