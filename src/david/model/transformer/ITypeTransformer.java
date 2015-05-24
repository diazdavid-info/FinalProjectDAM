/**
 * Intefaz que define el comportamiento de los transformadores de Type
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.transformer;

import david.model.persistence.TypePersistence;
import david.model.pojo.school.Type;

public interface ITypeTransformer {
	
	/**
	 * Método que transforma la entidad Type en la persistencia Type
	 * @param Type type
	 * @return TypePersistence 
	 */
	public TypePersistence entityToPersistence(Type type);
	
	/**
	 * Método que transforma la Type de School en la entidad Type
	 * @param TypePersistence typePersistence
	 * @return Type
	 */
	public Type persistenceToEntity(TypePersistence typePersistence);

}
