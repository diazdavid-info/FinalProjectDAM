/**
 * Clase que transforma la entidad Session
 * @author David Diaz Garcia
 * @date 27-05-2015
 */
package david.model.transformer;

import david.model.persistence.SessionPersistence;
import david.model.pojo.builder.SessionBuilder;
import david.model.pojo.school.Session;

public class SessionTransformer implements ISessionTransformer {

	/**
	 * Método que transforma la entidad Session en la persistencia Session
	 * 
	 * @param Session
	 *            session
	 * @return SessionPersistence
	 */
	@Override
	public SessionPersistence entityToPersistence(Session session) {
		SessionPersistence persistece = new SessionPersistence();

		if (session.getChapter() != null) {
			persistece.setChapter(session.getChapter().getId());
		}

		persistece.setDescription(session.getDescription());

		if (session.getId() != 0) {
			persistece.setId(session.getId());
		}

		if (session.getType() != null) {
			persistece.setSubtype(session.getType().getId());
		}

		persistece.setTime(session.getTime());

		if (session.getSubType() != null) {
			persistece.setType(session.getSubType().getId());
		}

		return persistece;
	}

	/**
	 * Método que transforma la persistencia de Session en la entidad Session
	 * 
	 * @param SessionPersistence
	 *            sessionPersistence
	 * @return Session
	 */
	@Override
	public Session persistenceToEntity(SessionPersistence sessionPersistence) {
		SessionBuilder builder = new SessionBuilder();
		builder.description(sessionPersistence.getDescription())
				.id(sessionPersistence.getId())
				.time(sessionPersistence.getTime());

		return new Session(builder);
	}

}
