/**
 * Clase que transforma la entidad SubType
 * @author David Diaz Garcia
 * @date 26-05-2015
 */
package david.model.transformer;

import david.model.persistence.SubtypePersistence;
import david.model.pojo.builder.SubtypeBuilder;
import david.model.pojo.school.SubType;

public class SubtypeTransformer implements ISubtypeTransformer{
	
	/**
	 * Método que transforma la entidad SubType en la persistencia SubType
	 * @param SubType subtype
	 * @return SubtypePersistence 
	 */
	public SubtypePersistence entityToPersistence(SubType subtype){
		SubtypePersistence persistence = new SubtypePersistence();
		persistence.setDescription(subtype.getDescription());
		
		if(subtype.getId() != 0){
			persistence.setId(subtype.getId());
		}
		
		persistence.setName(subtype.getName());
		
		return persistence;
	}
	
	/**
	 * Método que transforma la SubType de School en la entidad SubType
	 * @param SubtypeTransformer subtypePersistence
	 * @return SubType
	 */
	public SubType persistenceToEntity(SubtypePersistence subtypePersistence){
		SubtypeBuilder subtypeBuilder = new SubtypeBuilder();
		subtypeBuilder
		.description(subtypePersistence.getDescription())
		.id(subtypePersistence.getId())
		.name(subtypePersistence.getName());
		
		return new SubType(subtypeBuilder);
	}

}
