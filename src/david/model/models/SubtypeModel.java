/**
 * Modelo para todo lo relacionado con un subtype
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;
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
	
	/**
	 * Método que solicita y gestiona el listado de subtipos
	 * @return List<SubType>
	 */
	public List<SubType> listSubtype(){
		List<SubType> list = new ArrayList<SubType>();
		List<SubtypePersistence> listPersistence = mSubtypeRepository.findAll(new SubtypePersistence());
		
		for (SubtypePersistence subtypePersistence : listPersistence) {
			list.add(mISubtypeTransformer.persistenceToEntity(subtypePersistence));
		}
		return list;
	}
	
	/**
	 * Método que solicita y gestiona la busqueda de un Subtipo
	 * @param SubType subType
	 * @return SubType
	 */
	public SubType findSubtype(SubType subType){
		SubtypePersistence subtypePersistence = mISubtypeTransformer.entityToPersistence(subType);
		return mISubtypeTransformer.persistenceToEntity(mSubtypeRepository.find(subtypePersistence));
	}

}
