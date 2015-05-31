/**
 * Repositorio para la persistencia de Session
 * @author David Díaz García
 * @date 27-05-2015
 */
package david.model.repository;

import java.util.List;

import david.model.mapper.Mapper;
import david.model.persistence.SessionPersistence;
import david.model.provider.DProvider;

public class SessionRepository {

	/**
	 * Atributo que almacena el proveedor
	 */
	private DProvider mProvider;

	/**
	 * Constructor
	 * 
	 * @param providerLocalMysql
	 */
	public SessionRepository(DProvider provider) {
		mProvider = provider;
	}

	/**
	 * Método que guarda un SessionPersistence
	 * 
	 * @param SessionPersistence
	 *            sessionPersistence
	 * @return SessionPersistence
	 */
	public SessionPersistence storage(SessionPersistence sessionPersistence) {
		return (sessionPersistence.getId() == null) ? save(sessionPersistence) : update(sessionPersistence);

	}

	/**
	 * Método que actualiza un SessionPersistence
	 * 
	 * @param SchoolRepository
	 *            sessionPersistence
	 * @return SessionPersistence
	 */
	private SessionPersistence update(SessionPersistence sessionPersistence) {
		return null;
	}

	/**
	 * Método que almacena un SchoolRepository
	 * 
	 * @param SchoolRepository
	 *            sessionPersistence
	 * @return SchoolRepository
	 */
	private SessionPersistence save(SessionPersistence sessionPersistence) {
		Mapper<SessionPersistence> mapper = new Mapper<SessionPersistence>(sessionPersistence);
		mProvider.connect();
		sessionPersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		mProvider.disconnect();
		return sessionPersistence;
	}

	/**
	 * Método que solicita y gestiona el listado de session
	 * 
	 * @param SessionPersistence
	 *            persistence
	 * @return List<SessionPersistence>
	 */
	public List<SessionPersistence> findAll(SessionPersistence sessionPersistence) {
		Mapper<SessionPersistence> mapper = new Mapper<SessionPersistence>(sessionPersistence);
		mProvider.connect();
		List<SessionPersistence> list = mapper.mapperAllToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return list;
	}

}
