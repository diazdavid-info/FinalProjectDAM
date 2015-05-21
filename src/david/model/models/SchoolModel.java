/**
 * Modelo para todo lo relacionado con un instituto
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import david.model.factory.ModelFactory;
import david.model.persistence.CourseSchoolPersistence;
import david.model.persistence.SchoolPersistence;
import david.model.pojo.builder.AddressBuilder;
import david.model.pojo.builder.SchoolBuilder;
import david.model.pojo.contact.Address;
import david.model.pojo.school.Course;
import david.model.pojo.school.School;
import david.model.repository.SchoolRepository;
import david.model.transformer.ISchoolTransformer;
import david.model.validate.form.IWebCreateSchool;
import david.model.validate.form.SchoolCreateForm;

public class SchoolModel implements DSchoolModel {
	
	/**
	 * Atributo que almacena el trasformador de institutos
	 */
	private ISchoolTransformer mISchoolTransformer;
	/**
	 * Atributo que almacena el repositorio de institutos
	 */
	private SchoolRepository mSchoolRepository;
	/**
	 * Atributo que almacena el transformador de la relación entre cursos e institutos
	 */

	/**
	 * Constructor
	 */
	public SchoolModel(ISchoolTransformer schoolTransformer, SchoolRepository schoolRepository){
		
		mISchoolTransformer = schoolTransformer;
		mSchoolRepository = schoolRepository;
	}
	
	/**
	 * Método que gestiona la creación de institutos
	 * @param Map<String, String[]> parameter
	 */
	public void createSchool(Map<String, String[]> parameter){
		IWebCreateSchool form = new SchoolCreateForm();
		DAddressModel addressModel = ModelFactory.createAddressModel();
		
		if(form.validate(parameter)){
			Address address = addressModel.createAddress(new Address(new AddressBuilder().province(form.getProvince()).population(form.getPopulation()).description(form.getDescription())));
			
			School school = new School(new SchoolBuilder().name(form.getName()).codeIdentification(form.getCode()).address(address));
			SchoolPersistence schoolPersistence = mISchoolTransformer.entityToPersistence(school);
			school = mISchoolTransformer.persistenceToEntity(mSchoolRepository.storage(schoolPersistence));
		}
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
	
	/**
	 * Método que solicita y gestiona la busqueda de institutos de un curso
	 * @param Curse course
	 * @return List<School>
	 */
	public List<School> findSchoolByCourse(Course course){
		List<School> listSchool = new ArrayList<School>();
		DCycleModel cycleModel = ModelFactory.createCycleModel();
		DCourseSchoolModel courseSchoolModel = ModelFactory.createCourseSchoolModel();
		
		List<CourseSchoolPersistence> listCourseSchoolPersistence = courseSchoolModel.findCourseSchoolByCourse(course);
		
		for (CourseSchoolPersistence courseSchoolPersistence2 : listCourseSchoolPersistence) {
			School school = new School(new SchoolBuilder().id(courseSchoolPersistence2.getIdSchool()));
			SchoolPersistence schoolPersistence = mISchoolTransformer.entityToPersistence(school);
			school = mISchoolTransformer.persistenceToEntity(mSchoolRepository.find(schoolPersistence));
			school.setCycle(cycleModel.findCycleBySchool(school));
			listSchool.add(school);
		}
		
		return listSchool;
	}
	
	/**
	 * Método que solicita y gestiona la busqueda de un instituto
	 * @param School school
	 * @return School
	 */
	public School findSchool(School school){
		SchoolPersistence schoolPersistence = mISchoolTransformer.entityToPersistence(school);
		return mISchoolTransformer.persistenceToEntity(mSchoolRepository.find(schoolPersistence));
	}
	
	
}
