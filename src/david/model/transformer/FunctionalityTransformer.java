/**
 * Clase que transforma la entidad Functionality
 * @author David Diaz Garcia
 * @date 31-05-2015
 */
package david.model.transformer;

import david.model.persistence.FunctionalityPersistence;
import david.model.pojo.builder.FunctionalityBuilder;
import david.model.pojo.permission.Functionality;

public class FunctionalityTransformer implements IFunctionalityTransformer {

	/**
	 * Método que transforma la entidad Functionality en la persistencia Functionality
	 * 
	 * @param Functionality
	 *            functionality
	 * @return FunctionalityPersistence
	 */
	@Override
	public FunctionalityPersistence entityToPersistence(Functionality functionality) {
		FunctionalityPersistence persistence = new FunctionalityPersistence();
		persistence.setDescription(functionality.getDescription());
		persistence.setName(functionality.getName());

		if (functionality.getId() != 0) {
			persistence.setId(functionality.getId());
		}

		return persistence;
	}

	/**
	 * Método que transforma la persistencia de Functionality en la entidad Functionality
	 * 
	 * @param FunctionalityPersistence
	 *            functionalityPersistence
	 * @return Functionality
	 */
	@Override
	public Functionality persistenceToEntity(FunctionalityPersistence functionalityPersistence) {
		FunctionalityBuilder builder = new FunctionalityBuilder();
		builder.description(functionalityPersistence.getDescription()).name(functionalityPersistence.getName()).id(functionalityPersistence.getId());

		return new Functionality(builder);
	}

}
