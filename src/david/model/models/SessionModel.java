/**
 * Modelo para todo lo relacionado con una session
 * @author David Díaz García
 * @date 25-05-2015
 */
package david.model.models;

import java.util.Map;

import david.model.factory.ModelFactory;
import david.model.pojo.builder.ChapterBuilder;
import david.model.pojo.builder.CourseBuilder;
import david.model.pojo.builder.CycleBuilder;
import david.model.pojo.builder.ModuleBuilder;
import david.model.pojo.builder.SchoolBuilder;
import david.model.pojo.builder.SessionBuilder;
import david.model.pojo.builder.SubtypeBuilder;
import david.model.pojo.builder.TypeBuilder;
import david.model.pojo.school.Chapter;
import david.model.pojo.school.Course;
import david.model.pojo.school.Cycle;
import david.model.pojo.school.Module;
import david.model.pojo.school.School;
import david.model.pojo.school.Session;
import david.model.pojo.school.SubType;
import david.model.pojo.school.Type;
import david.model.validate.form.IWebCreateSession;
import david.model.validate.form.SessionCreateForm;

public class SessionModel implements DSessionModel{
	
	/**
	 * Método que se encarga de gestionar la creación de una session
	 * @param Map<String, String[]> requestParameter
	 */
	public void createSession(Map<String, String[]> parameter){
		IWebCreateSession form = new SessionCreateForm();
		DCourseModel courseModel = ModelFactory.createCourseModel();
		DSchoolModel schoolModel = ModelFactory.createSchoolModel();
		DCycleModel cycleModel = ModelFactory.createCycleModel();
		DModuleModel moduleModel = ModelFactory.createModuleModel();
		DTypeModel typeModel = ModelFactory.createTypeModel();
		DSubtypeModel subtypeModel = ModelFactory.createSubtypeModel();
		DChapterModel chapterModel = ModelFactory.createChapterModel();
		
		if(form.validate(parameter)) {
			Course course = courseModel.findCourse(new Course(new CourseBuilder().id(Integer.parseInt(form.getCourse()))));
			School school = schoolModel.findSchool(new School(new SchoolBuilder().id(Integer.parseInt(form.getSchool()))));
			Cycle cycle = cycleModel.findCycle(new Cycle(new CycleBuilder().id(Integer.parseInt(form.getCycle()))));
			Module module = moduleModel.findModule(new Module(new ModuleBuilder().id(Integer.parseInt(form.getModule()))));
			Type type = typeModel.findType(new Type(new TypeBuilder().id(Integer.parseInt(form.getType()))));
			SubType subtype = subtypeModel.findSubtype(new SubType(new SubtypeBuilder().id(Integer.parseInt(form.getSubtype()))));
			Chapter chapter = chapterModel.findChapter(new Chapter(new ChapterBuilder().id(Integer.parseInt(form.getChapter()))));
			
			Session session = new Session(new SessionBuilder().chapter(chapter).description(form.getDescription()).subType(subtype).time(Integer.parseInt(form.getHour())).type(type));
		}
	}

}
