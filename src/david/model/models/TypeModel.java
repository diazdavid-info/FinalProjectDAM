/**
 * Modelo para todo lo relacionado con un type
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.Map;

import david.model.persistence.TypePersistence;
import david.model.pojo.builder.TypeBuilder;
import david.model.pojo.school.Type;
import david.model.repository.TypeRepository;
import david.model.transformer.ITypeTransformer;
import david.model.validate.form.IWebCreateType;
import david.model.validate.form.TypeCreateForm;

public class TypeModel implements DTypeModel{
	
	/**
	 * Atributo que almacena el transformador de Type
	 */
	private ITypeTransformer mITypeTransformer;
	/**
	 * Atributo que almacena el repositorio de Type
	 */
	private TypeRepository mTypeRepository;
	
	public TypeModel(ITypeTransformer typeTransformer, TypeRepository typeRepository) {
		mITypeTransformer = typeTransformer;
		mTypeRepository = typeRepository;
	}
	
	/**
	 * Método que gestiona la creación de un tipo de sesión
	 * @param Map<String, String[]> parameter
	 */
	public void createType(Map<String, String[]> parameter){
		IWebCreateType form = new TypeCreateForm();
		
		if(form.validate(parameter)) {
			Type type = new Type(new TypeBuilder().name(form.getName()).description(form.getDescription()));
			TypePersistence typePersistence = mITypeTransformer.entityToPersistence(type);
			type = mITypeTransformer.persistenceToEntity(mTypeRepository.storage(typePersistence));
		}
	}

}
