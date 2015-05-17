/**
 * Intefaz que define el comportamiento de los transformadores de Cycle
 * @author David Díaz García
 * @date 17-05-2015
 */
package david.model.transformer;

import david.model.persistence.CyclePersistence;
import david.model.pojo.school.Cycle;

public interface ICycleTransformer {
	
	/**
	 * Método que transforma la entidad Cycle en la persistencia Cycle
	 * @param Cycle cycle
	 * @return CyclePersistence 
	 */
	public CyclePersistence entityToPersistence(Cycle cycle);
	
	/**
	 * Método que transforma la persistencia de Cycle en la entidad Cycle
	 * @param CyclePersistence cyclePersistence
	 * @return Cycle
	 */
	public Cycle persistenceToEntity(CyclePersistence cyclePersistence);

}
