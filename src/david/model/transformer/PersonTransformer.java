/**
 * Clase que transforma entidades en persistencia
 * @author David Díaz García
 * @date 02-05-2015
 */
package david.model.transformer;

import david.model.persistence.PersonPersistence;
import david.model.pojo.builder.PersonBuilder;
import david.model.pojo.users.Person;

public class PersonTransformer implements IPersonTransformer{
	
	/**
	 * Método que transforma la entidad Person en la persistencia Person
	 * @param Person person
	 * @return PersonPersistence 
	 */
	public PersonPersistence entityToPersistence(Person person){
		PersonPersistence personPersistence = new PersonPersistence();
		personPersistence.setEmail(person.getEmail());
		
		if(person.getId() != 0){
			personPersistence.setId(person.getId());
		}
		
		personPersistence.setmSurname2(person.getSurname2());
		personPersistence.setName(person.getName());
		personPersistence.setNif(person.getNif());
		personPersistence.setSurname1(person.getSurname1());
		return personPersistence;
		
	}
	
	/**
	 * Método que transforma la persistencia de usuario en la entidad usuario
	 * @param PersonPersistence personPersistence
	 * @return Person
	 */
	public Person persistenceToEntity(PersonPersistence personPersistence){
		PersonBuilder personBuilder = new PersonBuilder();
		personBuilder
		.email(personPersistence.getEmail())
		.id(personPersistence.getId())
		.name(personPersistence.getName())
		.nif(personPersistence.getNif())
		.surname1(personPersistence.getSurname1())
		.surname2(personPersistence.getSurname2());
		return new Person(personBuilder);
	}

}
