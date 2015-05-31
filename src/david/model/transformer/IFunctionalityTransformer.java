/**
 * Intefaz que define el comportamiento de los transformadores de Functionality
 * @author David Díaz García
 * @date 31-05-2015
 */
package david.model.transformer;

import david.model.persistence.FunctionalityPersistence;
import david.model.pojo.permission.Functionality;

public interface IFunctionalityTransformer {

	/**
	 * Método que transforma la entidad Functionality en la persistencia Functionality
	 * 
	 * @param Functionality
	 *            functionality
	 * @return FunctionalityPersistence
	 */
	public FunctionalityPersistence entityToPersistence(Functionality functionality);

	/**
	 * Método que transforma la persistencia de Functionality en la entidad Functionality
	 * 
	 * @param FunctionalityPersistence
	 *            functionalityPersistence
	 * @return Functionality
	 */
	public Functionality persistenceToEntity(FunctionalityPersistence functionalityPersistence);

}
