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

}
