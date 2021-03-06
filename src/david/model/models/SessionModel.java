/**
 * Modelo para todo lo relacionado con una session
 * @author David Díaz García
 * @date 25-05-2015
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import david.model.factory.ModelFactory;
import david.model.persistence.SessionPersistence;
import david.model.pojo.builder.ChapterBuilder;
import david.model.pojo.builder.ModuleBuilder;
import david.model.pojo.builder.SessionBuilder;
import david.model.pojo.builder.SubtypeBuilder;
import david.model.pojo.builder.TypeBuilder;
import david.model.pojo.school.Chapter;
import david.model.pojo.school.Module;
import david.model.pojo.school.Session;
import david.model.pojo.school.SubType;
import david.model.pojo.school.Type;
import david.model.pojo.users.User;
import david.model.repository.SessionRepository;
import david.model.transformer.ISessionTransformer;
import david.model.validate.form.IWebCreateSession;
import david.model.validate.form.SessionCreateForm;

public class SessionModel implements DSessionModel {

	/**
	 * Atributo que almacena el valor del transformador
	 */
	private ISessionTransformer mISessionTransformer;
	/**
	 * Atributo que almacena el valor del arepositorio
	 */
	private SessionRepository mSessionRepository;

	/**
	 * Constructor
	 * 
	 * @param sessionTransformer
	 * @param sessionRepository
	 */
	public SessionModel(ISessionTransformer sessionTransformer, SessionRepository sessionRepository) {
		mISessionTransformer = sessionTransformer;
		mSessionRepository = sessionRepository;
	}

	/**
	 * Método que se encarga de gestionar la creación de una session
	 * 
	 * @param Map
	 *            <String, String[]> requestParameter
	 */
	@Override
	public void createSession(Map<String, String[]> parameter) {
		IWebCreateSession form = new SessionCreateForm();
		DTypeModel typeModel = ModelFactory.createTypeModel();
		DSubtypeModel subtypeModel = ModelFactory.createSubtypeModel();
		DChapterModel chapterModel = ModelFactory.createChapterModel();

		if (form.validate(parameter)) {
			Type type = typeModel.findType(new Type(new TypeBuilder().id(Integer.parseInt(form.getType()))));

			SubType subtype = subtypeModel.findSubtype(new SubType(new SubtypeBuilder().id(Integer.parseInt(form.getSubtype()))));

			Chapter chapter = chapterModel.findChapter(new Chapter(new ChapterBuilder().id(Integer.parseInt(form.getChapter()))));

			Session session = new Session(new SessionBuilder().chapter(chapter).description(form.getDescription()).subType(subtype).time(Integer.parseInt(form.getHour())).type(type)
					.date(form.getDate()));

			SessionPersistence sessionPersistence = mISessionTransformer.entityToPersistence(session);
			sessionPersistence.setModule(Integer.parseInt(form.getModule()));

			session = mISessionTransformer.persistenceToEntity(mSessionRepository.storage(sessionPersistence));
		}
	}

	/**
	 * Método encargado de buscar todas las sessiones de un módulo
	 * 
	 * @param Module
	 *            module
	 * @return List<Session>
	 */
	@Override
	public List<Session> findAllSession(Module module) {
		List<Session> listSession = new ArrayList<Session>();
		SessionPersistence persistence = new SessionPersistence();
		persistence.setModule(module.getId());
		List<SessionPersistence> listPersistence = mSessionRepository.findAll(persistence);

		for (SessionPersistence sessionPersistence : listPersistence) {
			listSession.add(mISessionTransformer.persistenceToEntity(sessionPersistence));
		}

		return listSession;
	}

	/**
	 * Método encargado de buscar las sessiones de un usuario
	 * 
	 * @param User
	 *            user
	 * @return List<Session>
	 */
	@Override
	public List<Module> listSession(User user) {
		DModuleModel moduleModel = ModelFactory.createModuleModel();
		return moduleModel.findAllModule(new Module(new ModuleBuilder().teacher(user)));
	}

}
