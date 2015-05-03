/**
 * Intefaz que define el comportamiento de los transformadores de Person
 * @author David Díaz García
 * @date 02-05-2015
 */
package david.model.transformer;

import david.model.persistence.PersonPersistence;
import david.model.pojo.users.Person;

public interface IPersonTransformer {
	
	/**
	 * Método que transforma la entidad Person en la persistencia Person
	 * @param Person person
	 * @return PersonPersistence 
	 */
	public PersonPersistence entityToPersistence(Person person);
	
	/**
	 * Método que transforma la persistencia de usuario en la entidad usuario
	 * @param PersonPersistence personPersistence
	 * @return Person
	 */
	public Person persistenceToEntity(PersonPersistence personPersistence);

}
