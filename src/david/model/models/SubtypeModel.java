/**
 * Modelo para todo lo relacionado con un subtype
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.Map;

import david.model.persistence.SubtypePersistence;
import david.model.pojo.builder.SubtypeBuilder;
import david.model.pojo.school.SubType;
import david.model.repository.SubtypeRepository;
import david.model.transformer.ISubtypeTransformer;
import david.model.validate.form.IWebCreateSubtype;
import david.model.validate.form.SubtypeCreateForm;

public class SubtypeModel implements DSubtypeModel {
	
	/**
	 * Atributo que almacena el transformador de Subtype
	 */
	private ISubtypeTransformer mISubtypeTransformer;
	/**
	 * Atributo que almacena el repositorio de Subtype
	 */
	private SubtypeRepository mSubtypeRepository;
	
	public SubtypeModel(ISubtypeTransformer subtypeTransformer, SubtypeRepository subtypeRepository) {
		mISubtypeTransformer = subtypeTransformer;
		mSubtypeRepository = subtypeRepository;
	}
	
	/**
	 * Método que gestiona la creación de un subtipo de sesión
	 * @param Map<String, String[]> parameter
	 */
	public void createSubtype(Map<String, String[]> parameter){
		IWebCreateSubtype form = new SubtypeCreateForm();
		
		if(form.validate(parameter)){
			SubType subtype = new SubType(new SubtypeBuilder().name(form.getName()).description(form.getDescription()));
			SubtypePersistence subtypePersistence = mISubtypeTransformer.entityToPersistence(subtype);
			subtype = mISubtypeTransformer.persistenceToEntity(mSubtypeRepository.storage(subtypePersistence));
		}
	}

}
