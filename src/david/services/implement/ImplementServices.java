/**
 * Clase que se encarga de la implementación de los servicios
 * @author David Díaz García
 * @date 16-05-2015
 */
package david.services.implement;

import com.google.gson.Gson;

import david.model.factory.ModelFactory;
import david.model.models.DChapterModel;
import david.model.models.DCycleModel;
import david.model.models.DGraphicModel;
import david.model.models.DModuleModel;
import david.model.models.DSchoolModel;
import david.model.pojo.builder.CourseBuilder;
import david.model.pojo.school.Course;

public class ImplementServices {

	/**
	 * Método que recupera los institutos de un curso
	 * 
	 * @param int courseId
	 * @return String
	 */
	public String getSchoolByCourseId(int courseId) {
		Gson gson = new Gson();
		DSchoolModel schoolModel = ModelFactory.createSchoolModel();
		return gson.toJson(schoolModel.findSchoolByCourse(new Course(new CourseBuilder().id(courseId))));
	}

	/**
	 * Método que recupera los ciclos
	 * 
	 * @param int courseId
	 * @param int schoolId
	 * @param int tutorId
	 * @return String
	 */
	public String getCycleByCourseIdSchoolIdTutorId(int courseId, int schoolId, int tutorId) {
		Gson gson = new Gson();
		DCycleModel cycleModel = ModelFactory.createCycleModel();
		return gson.toJson(cycleModel.listCycles(courseId, schoolId, tutorId));
	}

	/**
	 * Método que recupera los ciclos
	 * 
	 * @param int courseId
	 * @param int schoolId
	 * @return String
	 */
	public String getCycleByCourseIdSchoolId(int courseId, int schoolId) {
		Gson gson = new Gson();
		DCycleModel cycleModel = ModelFactory.createCycleModel();
		return gson.toJson(cycleModel.listCycles(courseId, schoolId));
	}

	/**
	 * Método que recupera los módulos
	 * 
	 * @param int courseId
	 * @param int schoolId
	 * @param int cycleId
	 * @return String
	 */
	public String getModuleByCourseSchoolCycle(int courseId, int schoolId, int cycleId) {
		Gson gson = new Gson();
		DModuleModel moduleModel = ModelFactory.createModuleModel();
		return gson.toJson(moduleModel.listModule(courseId, schoolId, cycleId));
	}

	/**
	 * Método que recupera los temas de un módulo
	 * 
	 * @param int moduleId
	 * @return String
	 */
	public String getChapterByModule(int moduleId) {
		Gson gson = new Gson();
		DChapterModel chapterModel = ModelFactory.createChapterModel();
		return gson.toJson(chapterModel.listChapterByModule(moduleId));
	}

	/**
	 * Método que recupera los datos de los gráficos de un profesor
	 * 
	 * @param teacherId
	 * @return
	 */
	public String getDataGraphic(int teacherId) {
		Gson gson = new Gson();
		DGraphicModel graphicModel = ModelFactory.createGraphicModel();

		// return gson.toJson(new Graphic());
		return gson.toJson(graphicModel.listGraphicByTeacher(teacherId));
	}
}
