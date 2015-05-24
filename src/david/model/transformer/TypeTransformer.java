/**
 * Clase que transforma la entidad Type
 * @author David Diaz Garcia
 * @date 26-05-2015
 */
package david.model.transformer;

import david.model.persistence.TypePersistence;
import david.model.pojo.builder.TypeBuilder;
import david.model.pojo.school.Type;

public class TypeTransformer implements ITypeTransformer{
	
	/**
	 * Método que transforma la entidad Type en la persistencia Type
	 * @param Type type
	 * @return TypePersistence 
	 */
	public TypePersistence entityToPersistence(Type type){
		TypePersistence persistence = new TypePersistence();
		persistence.setDescription(type.getDescription());
		
		if(type.getId() != 0){
			persistence.setId(type.getId());
		}
		
		persistence.setName(type.getName());
		
		return persistence;
	}
	
	/**
	 * Método que transforma la Type de School en la entidad Type
	 * @param TypePersistence typePersistence
	 * @return Type
	 */
	public Type persistenceToEntity(TypePersistence typePersistence){
		TypeBuilder typeBuilder = new TypeBuilder();
		typeBuilder
		.description(typePersistence.getDescription())
		.id(typePersistence.getId())
		.name(typePersistence.getName());
		
		return new Type(typeBuilder);
	}

}
