/**
 * Intefaz que define el comportamiento de los transformadores de Session
 * @author David Díaz García
 * @date 27-05-2015
 */
package david.model.transformer;

import david.model.persistence.SessionPersistence;
import david.model.pojo.school.Session;

public interface ISessionTransformer {

	/**
	 * Método que transforma la entidad Session en la persistencia Session
	 * 
	 * @param Session
	 *            session
	 * @return SessionPersistence
	 */
	public SessionPersistence entityToPersistence(Session session);

	/**
	 * Método que transforma la persistencia de Session en la entidad Session
	 * 
	 * @param SessionPersistence
	 *            sessionPersistence
	 * @return Session
	 */
	public Session persistenceToEntity(SessionPersistence sessionPersistence);

}
