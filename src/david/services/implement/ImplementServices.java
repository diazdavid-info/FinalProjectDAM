/**
 * Clase que se encarga de la implementación de los servicios
 * @author David Díaz García
 * @date 16-05-2015
 */
package david.services.implement;

import com.google.gson.Gson;

import david.model.factory.ModelFactory;
import david.model.models.DCycleModel;
import david.model.models.DSchoolModel;

public class ImplementServices {

	/**
	 * Método que recupera los institutos de un curso
	 * @param int courseId
	 * @return String
	 */
	public String getSchoolByCourseId(int courseId) {
		Gson gson = new Gson();
		DSchoolModel schoolModel = ModelFactory.createSchoolModel();
		return gson.toJson(schoolModel.getSchoolByCourseId(courseId));
	}

	/**
	 * Método que recupera los ciclos
	 * @param int courseId
	 * @param int schoolId
	 * @param int tutorId
	 * @return String
	 */
	public String getCycleByCourseIdSchoolIdTutorId(int courseId, int schoolId,int tutorId) {
		Gson gson = new Gson();
		DCycleModel cycleModel = ModelFactory.createCycleModel();
		return gson.toJson(cycleModel.listCycles(courseId, schoolId, tutorId));
	}

	/**
	 * Método que recupera los ciclos
	 * @param int courseId
	 * @param int schoolId
	 * @return String
	 */
	public String getCycleByCourseIdSchoolId(int courseId, int schoolId) {
		Gson gson = new Gson();
		DCycleModel cycleModel = ModelFactory.createCycleModel();
		return gson.toJson(cycleModel.listCycles(courseId, schoolId));
	}
}
