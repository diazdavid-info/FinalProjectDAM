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
		return mapper.mapperToPersistence(mProvider.executeQuery(mapper.mapperToDbb()));
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
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Método que guarda un PersonPersistence
	 * @param PersonPersistence personPersistence
	 * @return PersonPersistence
	 */
	private PersonPersistence save(PersonPersistence personPersistence) {
		System.out.println("SAVE PersonPersistence");
		Mapper<PersonPersistence> mapper = new Mapper<PersonPersistence>(personPersistence);
		personPersistence.setId(mProvider.executeUpdate(mapper.mapperStorageToDbb()));
		return personPersistence;
	}

}
