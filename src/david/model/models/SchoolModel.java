/**
 * Modelo para todo lo relacionado con un instituto
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import david.model.persistence.AddressPersistence;
import david.model.persistence.SchoolPersistence;
import david.model.pojo.builder.AddressBuilder;
import david.model.pojo.builder.SchoolBuilder;
import david.model.pojo.contact.Address;
import david.model.pojo.school.School;
import david.model.repository.AddressRepository;
import david.model.repository.SchoolRepository;
import david.model.transformer.IAddressTransformer;
import david.model.transformer.ISchoolTransformer;
import david.model.validate.form.IWebCreateSchool;
import david.model.validate.form.SchoolCreateForm;

public class SchoolModel implements DSchoolModel {
	
	/**
	 * Atributo que almacena el transformador de direcciones
	 */
	private IAddressTransformer mIAddressTransformer;
	/**
	 * Atributo que almacena el repositorio de direcciones
	 */
	private AddressRepository mAddressRepository;
	/**
	 * Atributo que almacena el trasformador de institutos
	 */
	private ISchoolTransformer mISchoolTransformer;
	/**
	 * Atributo que almacena el repositorio de institutos
	 */
	private SchoolRepository mSchoolRepository;

	/**
	 * Constructor
	 */
	public SchoolModel(IAddressTransformer addressTransformer, AddressRepository addressRepository, ISchoolTransformer schoolTransformer, SchoolRepository schoolRepository){
		mIAddressTransformer = addressTransformer;
		mAddressRepository = addressRepository;
		mISchoolTransformer = schoolTransformer;
		mSchoolRepository = schoolRepository;
	}
	
	/**
	 * Método que gestiona la creación de institutos
	 * @param Map<String, String[]> parameter
	 */
	public void createSchool(Map<String, String[]> parameter){
		Address address = null;
		School school = null;
		IWebCreateSchool form = new SchoolCreateForm();
		
		if(form.validate(parameter)){
			address = new Address(new AddressBuilder().province(form.getProvince()).population(form.getPopulation()).description(form.getDescription()));
			AddressPersistence addressPersistence = mIAddressTransformer.entityToPersistence(address);
			address = mIAddressTransformer.persistenceToEntity(mAddressRepository.storage(addressPersistence));
			
			school = new School(new SchoolBuilder().name(form.getName()).codeIdentification(form.getCode()).address(address));
			SchoolPersistence schoolPersistence = mISchoolTransformer.entityToPersistence(school);
			school = mISchoolTransformer.persistenceToEntity(mSchoolRepository.storage(schoolPersistence));
			
			System.out.println("FORMULARIO CRETE SCHOOL ES VALIDO");
		}
		
		System.out.println("FORMULARIO CRETE SCHOOL NO ES VALIDO");
	}
	
	/**
	 * Método que solicita y gestiona el listado de institutos
	 * @return List<School>
	 */
	public List<School> listSchool(){
		List<School> listSchool = new ArrayList<School>();
		List<SchoolPersistence> schoolsPersistence = mSchoolRepository.findAll(new SchoolPersistence());
		
		for (SchoolPersistence schoolPersistence : schoolsPersistence) {
			School school = mISchoolTransformer.persistenceToEntity(schoolPersistence);
			
			listSchool.add(school);
		}
		
		return listSchool;
	}
}
