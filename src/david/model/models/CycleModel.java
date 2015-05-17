/**
 * Modelo para todo lo relacionado con un cycle
 * @author David Díaz García
 * @date 17-05-2015
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import david.model.persistence.CoursePersistence;
import david.model.persistence.CyclePersistence;
import david.model.persistence.SchoolPersistence;
import david.model.persistence.UserPersistence;
import david.model.pojo.builder.CourseBuilder;
import david.model.pojo.builder.CycleBuilder;
import david.model.pojo.builder.SchoolBuilder;
import david.model.pojo.builder.UserBuilder;
import david.model.pojo.school.Course;
import david.model.pojo.school.Cycle;
import david.model.pojo.school.School;
import david.model.pojo.users.User;
import david.model.repository.CourseRepository;
import david.model.repository.CycleRepository;
import david.model.repository.SchoolRepository;
import david.model.repository.UserRepository;
import david.model.transformer.ICourseTransformer;
import david.model.transformer.ICycleTransformer;
import david.model.transformer.ISchoolTransformer;
import david.model.transformer.IUserTransformer;
import david.model.validate.form.CycleCreateForm;
import david.model.validate.form.IWebCreateCycle;

public class CycleModel implements DCycleModel{
	
	/**
	 * Atributo que almacena el transformador de cursos
	 */
	private ICourseTransformer mICourseTransformer;
	/**
	 * Atributo que almacena el repositorio de cursos
	 */
	private CourseRepository mCourseRepository;
	/**
	 * Atributo que almacena el transformador de school
	 */
	private ISchoolTransformer mISchoolTransformer;
	/**
	 * Atributo que almacena el repositorio de school
	 */
	private SchoolRepository mSchoolRepository;
	/**
	 * Atributo que almacena el transformador de user
	 */
	private IUserTransformer mIUserTransformer;
	/**
	 * Atributo que almacena el repositorio de user
	 */
	private UserRepository mUserRepository;
	/**
	 * Atributo que almacena el transformador de ciclos
	 */
	private ICycleTransformer mICycleTransformer;
	/**
	 * Atributo que almacena el repositorio de ciclos
	 */
	private CycleRepository mCycleRepository;
	
	/**
	 * Constructor
	 */
	public CycleModel(ICourseTransformer courseTrasformer, 
			CourseRepository courseRepository,
			ISchoolTransformer schoolTransformer,
			SchoolRepository schoolRepository,
			IUserTransformer userTransformer,
			UserRepository userRepository,
			ICycleTransformer cycleTransformer,
			CycleRepository cycleRepository) {
		
		mICourseTransformer = courseTrasformer;
		mCourseRepository = courseRepository;
		mISchoolTransformer = schoolTransformer;
		mSchoolRepository = schoolRepository;
		mIUserTransformer = userTransformer;
		mUserRepository = userRepository;
		mICycleTransformer = cycleTransformer;
		mCycleRepository = cycleRepository;
	}
	
	/**
	 * Método que gestiona la creación de un ciclo
	 * @param Map<String, String[]> parameter
	 */
	public void createCycle(Map<String, String[]> parameter){
		Course course = null;
		School school = null;
		User user = null;
		Cycle cycle = null;
		
		IWebCreateCycle form = new CycleCreateForm();
		
		if(form.validate(parameter)){
			course = new Course(new CourseBuilder().id(Integer.parseInt(form.getCourse())));
			CoursePersistence coursePersistence = mICourseTransformer.entityToPersistence(course);
			course = mICourseTransformer.persistenceToEntity(mCourseRepository.find(coursePersistence));
			
			school = new School(new SchoolBuilder().id(Integer.parseInt(form.getSchool())));
			SchoolPersistence schoolPersistence = mISchoolTransformer.entityToPersistence(school);
			school = mISchoolTransformer.persistenceToEntity(mSchoolRepository.find(schoolPersistence));
			
			user = new User(new UserBuilder().setId(Integer.parseInt(form.getTutor())));
			UserPersistence userPersistence = mIUserTransformer.entityToPersistence(user);
			user = mIUserTransformer.persistenceToEntity(mUserRepository.find(userPersistence));
			
			cycle = new Cycle(new CycleBuilder().course(course).school(school).identification(form.getCode()).tutor(user).name(form.getName()));
			CyclePersistence cyclePersistence = mICycleTransformer.entityToPersistence(cycle);
			cycle = mICycleTransformer.persistenceToEntity(mCycleRepository.storage(cyclePersistence));
			
			System.out.println("FORMULARIO CRETE CYCLE ES VALIDO");
		}
		System.out.println("FORMULARIO CRETE CYCLE NO ES VALIDO");
	}
	
	/**
	 * Método que solicita y gestiona el listado de ciclos
	 * @return List<Cycle>
	 */
	public List<Cycle> listCycles(){
		List<Cycle> listCycle = new ArrayList<Cycle>();
		
		CyclePersistence cyclePersistence = mICycleTransformer.entityToPersistence(new Cycle(new CycleBuilder()));
		List<CyclePersistence> listCyclePersistence = mCycleRepository.findAll(cyclePersistence);
		
		for (CyclePersistence persistence : listCyclePersistence) {
			Course course = new Course(new CourseBuilder().id(persistence.getIdCourse()));
			CoursePersistence coursePersistence = mICourseTransformer.entityToPersistence(course);
			course = mICourseTransformer.persistenceToEntity(mCourseRepository.find(coursePersistence));
			
			School school = new School(new SchoolBuilder().id(persistence.getIdSchool()));
			SchoolPersistence schoolPersistence = mISchoolTransformer.entityToPersistence(school);
			school = mISchoolTransformer.persistenceToEntity(mSchoolRepository.find(schoolPersistence));
			
			User user = new User(new UserBuilder().setId(persistence.getTutor()));
			UserPersistence userPersistence = mIUserTransformer.entityToPersistence(user);
			user = mIUserTransformer.persistenceToEntity(mUserRepository.find(userPersistence));
			
			Cycle cycle = mICycleTransformer.persistenceToEntity(persistence);
			cycle.setCourse(course);
			cycle.setSchool(school);
			cycle.setTutor(user);
			listCycle.add(cycle);
		}
		
		return listCycle;
	}
	
	/**
	 * Método que solicita y gestiona el listado de ciclos
	 * @param int courseId
	 * @param int schoolId
	 * @param int tutorId
	 * @return List<Cycle>
	 */
	public List<Cycle> listCycles(int courseId, int schoolId, int tutorId){
		List<Cycle> listCycle = new ArrayList<Cycle>();
		
		CyclePersistence cyclePersistence = mICycleTransformer.entityToPersistence(new Cycle(new CycleBuilder()));
		cyclePersistence.setIdCourse(courseId);
		cyclePersistence.setIdSchool(schoolId);
		cyclePersistence.setTutor(tutorId);
		
		List<CyclePersistence> listCyclePersistence = mCycleRepository.findAll(cyclePersistence);
		
		for (CyclePersistence persistence : listCyclePersistence) {
			Course course = new Course(new CourseBuilder().id(persistence.getIdCourse()));
			CoursePersistence coursePersistence = mICourseTransformer.entityToPersistence(course);
			course = mICourseTransformer.persistenceToEntity(mCourseRepository.find(coursePersistence));
			
			School school = new School(new SchoolBuilder().id(persistence.getIdSchool()));
			SchoolPersistence schoolPersistence = mISchoolTransformer.entityToPersistence(school);
			school = mISchoolTransformer.persistenceToEntity(mSchoolRepository.find(schoolPersistence));
			
			User user = new User(new UserBuilder().setId(persistence.getTutor()));
			UserPersistence userPersistence = mIUserTransformer.entityToPersistence(user);
			user = mIUserTransformer.persistenceToEntity(mUserRepository.find(userPersistence));
			
			Cycle cycle = mICycleTransformer.persistenceToEntity(persistence);
			cycle.setCourse(course);
			cycle.setSchool(school);
			cycle.setTutor(user);
			listCycle.add(cycle);
		}
		
		return listCycle;
	}

}
