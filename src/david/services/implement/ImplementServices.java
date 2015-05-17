/**
 * Clase que se encarga de la implementación de los servicios
 * @author David Díaz García
 * @date 16-05-2015
 */
package david.services.implement;

import com.google.gson.Gson;

import david.model.factory.ModelFactory;
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
}
