/**
 * Intefaz que define el comportamiento de los transformadores de School
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.transformer;

import david.model.persistence.SchoolPersistence;
import david.model.pojo.school.School;

public interface ISchoolTransformer {

	/**
	 * Método que transforma la entidad School en la persistencia School
	 * @param School school
	 * @return SchoolPersistence 
	 */
	public SchoolPersistence entityToPersistence(School school);
	
	/**
	 * Método que transforma la persistencia de School en la entidad School
	 * @param SchoolPersistence schoolPersistence
	 * @return School
	 */
	public School persistenceToEntity(SchoolPersistence schoolPersistence);
}
