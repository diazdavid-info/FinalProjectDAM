/**
 * Repositorio para la persistencia de UserModule
 * @author David Díaz García
 * @date 30-05-2015
 */
package david.model.repository;

import java.util.List;

import david.model.mapper.Mapper;
import david.model.persistence.UserModulePersistence;
import david.model.provider.DProvider;

public class UserModuleRepository {

	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;

	public UserModuleRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que almacena la persistencia de userModule
	 * 
	 * @param UserModulePersistence
	 *            userModulePersistence
	 * @return UserModulePersistence
	 */
	public UserModulePersistence save(UserModulePersistence userModulePersistence) {
		Mapper<UserModulePersistence> mapper = new Mapper<UserModulePersistence>(userModulePersistence);
		mProvider.connect();
		mProvider.executeUpdate(mapper.mapperStorageToDbb());
		mProvider.disconnect();
		return userModulePersistence;
	}

	/**
	 * Método que almacena una lista de persistencia de userModule
	 * 
	 * @param List
	 *            <UserModulePersistence> userModulePersistencee
	 */
	public void save(List<UserModulePersistence> userModulePersistence) {
		mProvider.connect();

		for (UserModulePersistence userModulePersistence2 : userModulePersistence) {
			Mapper<UserModulePersistence> mapper = new Mapper<UserModulePersistence>(userModulePersistence2);
			mProvider.executeUpdate(mapper.mapperStorageToDbb());
		}

		mProvider.disconnect();
	}

}
