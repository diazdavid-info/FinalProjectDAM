/**
 * Repositorio para la persistencia de Person
 * @author David Díaz García
 * @date 02-05-2015
 */
package david.model.repository;

import david.model.mapper.Mapper;
import david.model.persistence.PersonPersistence;
import david.model.provider.DProvider;

public class PersonRepository {
	
	/**
	 * Atributo que almacena el proveedor de la BDD
	 */
	private DProvider mProvider;
	
	/**
	 * Constructor
	 * @param DProvider provider
	 */
	public PersonRepository(DProvider provider) {
		mProvider = provider;
	}
	
	/**
	 * Método que busca un PersonPersistence que cumplan con los requisitos
	 * @param PersonPersistence personPersistence
	 * @return PersonPersistence
	 */
	public PersonPersistence find(PersonPersistence personPersistence){
		Mapper<PersonPersistence> mapper = new Mapper<PersonPersistence>(personPersistence);
		mProvider.connect();
		PersonPersistence persistence = mapper.mapperToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
		mProvider.disconnect();
		return persistence;
	}

	/**
	 * Método que guarda un PersonsPersistence
	 * @param PersonPersistence personPersistence
	 */
	public PersonPersistence storage(PersonPersistence personPersistence) {
		return (personPersistence.getId() == null) ? save(personPersistence) : update(personPersistence);
	}

	/**
	 * Método que actualiza un PersonPersistence
	 * @param PersonPersistence personPersistence
	 * @return PersonPersistence
	 */
	private PersonPersistence update(PersonPersistence personPersistence) {
		return null;
	}

	/**
	 * Método que guarda un PersonPersistence
	 * @param PersonPersistence personPersistence
	 * @return PersonPersistence
	 */
	private PersonPersistence save(PersonPersistence personPersistence) {
		Mapper<PersonPersistence> mapper = new Mapper<PersonPersistence>(personPersistence);
		mProvider.connect();
		personPersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		mProvider.disconnect();
		return personPersistence;
	}

}
