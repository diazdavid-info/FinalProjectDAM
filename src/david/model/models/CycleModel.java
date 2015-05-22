/**
 * Modelo para todo lo relacionado con un cycle
 * @author David Díaz García
 * @date 17-05-2015
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import david.model.factory.ModelFactory;
import david.model.persistence.CyclePersistence;
import david.model.pojo.builder.CourseBuilder;
import david.model.pojo.builder.CycleBuilder;
import david.model.pojo.builder.SchoolBuilder;
import david.model.pojo.builder.UserBuilder;
import david.model.pojo.school.Course;
import david.model.pojo.school.Cycle;
import david.model.pojo.school.School;
import david.model.pojo.users.User;
import david.model.repository.CycleRepository;
import david.model.transformer.ICycleTransformer;
import david.model.validate.form.CycleCreateForm;
import david.model.validate.form.IWebCreateCycle;

public class CycleModel implements DCycleModel{
	
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
	public CycleModel(ICycleTransformer cycleTransformer, CycleRepository cycleRepository) {
		mICycleTransformer = cycleTransformer;
		mCycleRepository = cycleRepository;
	}
	
	/**
	 * Método que gestiona la creación de un ciclo
	 * @param Map<String, String[]> parameter
	 */
	public void createCycle(Map<String, String[]> parameter){
		DCourseModel courseModel = ModelFactory.createCourseModel();
		DSchoolModel schoolModel = ModelFactory.createSchoolModel();
		DUserModel userModel = ModelFactory.createUserModel();
		IWebCreateCycle form = new CycleCreateForm();
		
		if(form.validate(parameter)){
			Course course = courseModel.findCourse(new Course(new CourseBuilder().id(Integer.parseInt(form.getCourse()))));
			
			School school = schoolModel.findSchool(new School(new SchoolBuilder().id(Integer.parseInt(form.getSchool()))));
			
			User user = userModel.findUser(new User(new UserBuilder().setId(Integer.parseInt(form.getTutor()))));
			
			Cycle cycle = new Cycle(new CycleBuilder().course(course).school(school).identification(form.getCode()).tutor(user).name(form.getName()));
			CyclePersistence cyclePersistence = mICycleTransformer.entityToPersistence(cycle);
			cycle = mICycleTransformer.persistenceToEntity(mCycleRepository.storage(cyclePersistence));
		}
	}
	
	/**
	 * Método que solicita y gestiona el listado de ciclos
	 * @return List<Cycle>
	 */
	public List<Cycle> listCycles(){
		List<Cycle> listCycle = new ArrayList<Cycle>();
		
		CyclePersistence cyclePersistence = mICycleTransformer.entityToPersistence(new Cycle(new CycleBuilder()));
		List<CyclePersistence> listCyclePersistence = mCycleRepository.findAll(cyclePersistence);
		
		DCourseModel courseModel = ModelFactory.createCourseModel();
		DSchoolModel schoolModel = ModelFactory.createSchoolModel();
		DUserModel userModel = ModelFactory.createUserModel();
		DModuleModel moduleModel = ModelFactory.createModuleModel();
		
		for (CyclePersistence persistence : listCyclePersistence) {
			Course course = courseModel.findCourse(new Course(new CourseBuilder().id(persistence.getIdCourse())));
			
			School school = schoolModel.findSchool(new School(new SchoolBuilder().id(persistence.getIdSchool())));
			
			User user = userModel.findUser(new User(new UserBuilder().setId(persistence.getTutor())));
			
			Cycle cycle = mICycleTransformer.persistenceToEntity(persistence);
			cycle.setCourse(course);
			cycle.setSchool(school);
			cycle.setTutor(user);
			cycle.setModule(moduleModel.findModuleByCycle(cycle));
			
			listCycle.add(cycle);
		}
		
		return listCycle;
	}
	
	/**
	 * Método que solicita y gestiona el listado de ciclos
	 * @param int courseId
	 * @param int schoolId
	 * @return List<Cycle>
	 */
	public List<Cycle> listCycles(int courseId, int schoolId){
		List<Cycle> listCycle = new ArrayList<Cycle>();
		DCourseModel courseModel = ModelFactory.createCourseModel();
		DSchoolModel schoolModel = ModelFactory.createSchoolModel();
		DUserModel userModel = ModelFactory.createUserModel();
		DModuleModel moduleModel = ModelFactory.createModuleModel();
		
		CyclePersistence cyclePersistence = mICycleTransformer.entityToPersistence(new Cycle(new CycleBuilder()));
		cyclePersistence.setIdCourse(courseId);
		cyclePersistence.setIdSchool(schoolId);
		
		List<CyclePersistence> listCyclePersistence = mCycleRepository.findAll(cyclePersistence);
		
		for (CyclePersistence persistence : listCyclePersistence) {
			Course course = courseModel.findCourse(new Course(new CourseBuilder().id(persistence.getIdCourse())));
			
			School school = schoolModel.findSchool(new School(new SchoolBuilder().id(persistence.getIdSchool())));
			
			User user = userModel.findUser(new User(new UserBuilder().setId(persistence.getTutor())));
			
			Cycle cycle = mICycleTransformer.persistenceToEntity(persistence);
			cycle.setCourse(course);
			cycle.setSchool(school);
			cycle.setTutor(user);
			cycle.setModule(moduleModel.findModuleByCycle(cycle));
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
		DCourseModel courseModel = ModelFactory.createCourseModel();
		DSchoolModel schoolModel = ModelFactory.createSchoolModel();
		DUserModel userModel = ModelFactory.createUserModel();
		DModuleModel moduleModel = ModelFactory.createModuleModel();
		
		CyclePersistence cyclePersistence = mICycleTransformer.entityToPersistence(new Cycle(new CycleBuilder()));
		cyclePersistence.setIdCourse(courseId);
		cyclePersistence.setIdSchool(schoolId);
		cyclePersistence.setTutor(tutorId);
		
		List<CyclePersistence> listCyclePersistence = mCycleRepository.findAll(cyclePersistence);
		
		for (CyclePersistence persistence : listCyclePersistence) {
			Course course = courseModel.findCourse(new Course(new CourseBuilder().id(persistence.getIdCourse())));
			
			School school = schoolModel.findSchool(new School(new SchoolBuilder().id(persistence.getIdSchool())));
			
			User user = userModel.findUser(new User(new UserBuilder().setId(persistence.getTutor())));
			
			Cycle cycle = mICycleTransformer.persistenceToEntity(persistence);
			cycle.setCourse(course);
			cycle.setSchool(school);
			cycle.setTutor(user);
			cycle.setModule(moduleModel.findModuleByCycle(cycle));
			listCycle.add(cycle);
		}
		
		return listCycle;
	}
	
	/**
	 * Método que solicita y gestiona la busqueda de un ciclo
	 * @param Cycle cycle
	 * @return Cycle
	 */
	public Cycle findCycle(Cycle cycle){
		DModuleModel moduleModel = ModelFactory.createModuleModel();
		CyclePersistence cyclePersistence = mICycleTransformer.entityToPersistence(cycle);
		Cycle newCycle = mICycleTransformer.persistenceToEntity(mCycleRepository.find(cyclePersistence));
		newCycle.setModule(moduleModel.findModuleByCycle(newCycle));
		return newCycle;
	}
	
	/**
	 * Método que solicita y gestiona la busqueda de los ciclos de un instituto
	 * @param School school
	 * @return List<Cycle>
	 */
	public List<Cycle> findCycleBySchool(School school){
		List<Cycle> listCycle = new ArrayList<Cycle>();
		
		Cycle cycle = new Cycle(new CycleBuilder().school(school));
		CyclePersistence cyclePersistence = mICycleTransformer.entityToPersistence(cycle);
		List<CyclePersistence> listCyclePersistence = mCycleRepository.findAll(cyclePersistence);
		
		DModuleModel moduleModel = ModelFactory.createModuleModel();
		
		for (CyclePersistence cyclePersistence2 : listCyclePersistence) {
			cycle = mICycleTransformer.persistenceToEntity(cyclePersistence2);
			cycle.setModule(moduleModel.findModuleByCycle(cycle));
			listCycle.add(cycle);
		}
		
		
		return listCycle;
	}

}
