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
import david.model.persistence.CoursePersistence;
import david.model.persistence.CourseSchoolPersistence;
import david.model.persistence.SchoolPersistence;
import david.model.pojo.builder.AddressBuilder;
import david.model.pojo.builder.CourseBuilder;
import david.model.pojo.builder.CourseSchoolBuilder;
import david.model.pojo.builder.SchoolBuilder;
import david.model.pojo.contact.Address;
import david.model.pojo.school.Course;
import david.model.pojo.school.CourseSchool;
import david.model.pojo.school.School;
import david.model.repository.AddressRepository;
import david.model.repository.CourseRepository;
import david.model.repository.CourseSchoolRepository;
import david.model.repository.SchoolRepository;
import david.model.transformer.IAddressTransformer;
import david.model.transformer.ICourseSchoolTransformer;
import david.model.transformer.ICourseTransformer;
import david.model.transformer.ISchoolTransformer;
import david.model.validate.form.CourseSchoolCreateForm;
import david.model.validate.form.IWebCreateCourseSchool;
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
	 * Atributo que almacena el transformador de cursos
	 */
	private ICourseTransformer mICourseTransformer;
	/**
	 * Atributo que almacena el repositorio de cursos
	 */
	private CourseRepository mCourseRepository;
	/**
	 * Atributo que almacena el transformador de la relación entre cursos e institutos
	 */
	private ICourseSchoolTransformer mICourseSchoolTransformer;
	/**
	 * Atributo que almacena el repositorio de CourseSchool
	 */
	private CourseSchoolRepository mCourseSchoolRepository;

	/**
	 * Constructor
	 */
	public SchoolModel(IAddressTransformer addressTransformer, 
			AddressRepository addressRepository, 
			ISchoolTransformer schoolTransformer, 
			SchoolRepository schoolRepository,
			ICourseTransformer courseTransformer,
			CourseRepository courseRepository,
			ICourseSchoolTransformer courseSchoolTransformer,
			CourseSchoolRepository courseSchoolRepository){
		
		mIAddressTransformer = addressTransformer;
		mAddressRepository = addressRepository;
		mISchoolTransformer = schoolTransformer;
		mSchoolRepository = schoolRepository;
		mICourseTransformer = courseTransformer;
		mCourseRepository = courseRepository;
		mICourseSchoolTransformer = courseSchoolTransformer;
		mCourseSchoolRepository = courseSchoolRepository;
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
	
	/**
	 * Método que gestiona la creación de la relación entre cursos e institutos
	 * @param Map<String, String[]> requestParameter
	 */
	public void createCourseSchools(Map<String, String[]> parameter){
		IWebCreateCourseSchool form = new CourseSchoolCreateForm();
		Course course = null;
		School school = null;
		CourseSchool courseSchool = null;
		
		if(form.validate(parameter)){
			course = new Course(new CourseBuilder().id(Integer.parseInt(form.getCourse())));
			CoursePersistence coursePersistence = mICourseTransformer.entityToPersistence(course);
			course = mICourseTransformer.persistenceToEntity(mCourseRepository.find(coursePersistence));
			
			for (String idSchool : form.getSchools()) {
				school = new School(new SchoolBuilder().id(Integer.parseInt(idSchool)));
				SchoolPersistence schoolPersistence = mISchoolTransformer.entityToPersistence(school);
				school = mISchoolTransformer.persistenceToEntity(mSchoolRepository.find(schoolPersistence));
				
				courseSchool = new CourseSchool(new CourseSchoolBuilder().course(course).school(school));
				CourseSchoolPersistence courseSchoolPersistence = mICourseSchoolTransformer.entityToPersistence(courseSchool);
				courseSchool = mICourseSchoolTransformer.persistenceToEntity(mCourseSchoolRepository.storage(courseSchoolPersistence));
			}
			
		}
	}
	
	/**
	 * Método que solicita los institutos de un curso
	 * @param int courseId
	 * @return List<School>
	 */
	public List<School> getSchoolByCourseId(int courseId){
		List<School> listSchool = new ArrayList<School>();
		
		CourseSchool courseSchool = new CourseSchool(new CourseSchoolBuilder().course(new Course(new CourseBuilder().id(courseId))));
		CourseSchoolPersistence courseSchoolPersistence = mICourseSchoolTransformer.entityToPersistence(courseSchool);
		List<CourseSchoolPersistence> listCourseSchoolPersistence = mCourseSchoolRepository.findAll(courseSchoolPersistence);
		
		for (CourseSchoolPersistence courseSchoolPersistence2 : listCourseSchoolPersistence) {
			School school = new School(new SchoolBuilder().id(courseSchoolPersistence2.getIdSchool()));
			SchoolPersistence schoolPersistence = mISchoolTransformer.entityToPersistence(school);
			listSchool.add(mISchoolTransformer.persistenceToEntity(mSchoolRepository.find(schoolPersistence)));
		}
		
		return listSchool;
	}
}
