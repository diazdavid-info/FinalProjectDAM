/**
 * Intefaz que define el comportamiento de los transformadores de Subtype
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.transformer;

import david.model.persistence.SubtypePersistence;
import david.model.pojo.school.SubType;

public interface ISubtypeTransformer {
	
	/**
	 * Método que transforma la entidad SubType en la persistencia SubType
	 * @param SubType subtype
	 * @return SubtypePersistence 
	 */
	public SubtypePersistence entityToPersistence(SubType subtype);
	
	/**
	 * Método que transforma la SubType de School en la entidad SubType
	 * @param SubtypeTransformer subtypePersistence
	 * @return SubType
	 */
	public SubType persistenceToEntity(SubtypePersistence subtypePersistence);

}
