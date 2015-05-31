/**
 * Interfaz que debe sei implementada por la capa de servicios
 * @author David Díaz García
 * @date 16-05-2015
 */
package david.services;

public interface IApiServices {

	/**
	 * Servicio que recupera todos los institutos de un curso
	 * 
	 * @param int courseId
	 * @return String
	 */
	public String getSchoolByCourseId(int courseId);

	/**
	 * Servicio que recupera todos los ciclos
	 * 
	 * @param int courseId
	 * @param int schoolId
	 * @param int tutorId
	 * @return String
	 */
	public String getCycleByCourseIdSchoolIdTutorId(int courseId, int schoolId, int tutorId);

	/**
	 * Servicio que recupera todos los ciclos
	 * 
	 * @param int courseId
	 * @param int schoolId
	 * @return String
	 */
	public String getCycleByCourseIdSchoolId(int courseId, int schoolId);

	/**
	 * Servicio que recupera todos los módulos de un curso, de un instituto y de un ciclo
	 * 
	 * @param int courseId
	 * @param int schoolId
	 * @param int cycleId
	 * @return String
	 */
	public String getModuleByCourseSchoolCycle(int courseId, int schoolId, int cycleId);

	/**
	 * Servicio que recupera todos los temas de un módulo
	 * 
	 * @param int moduleId
	 * @return String
	 */
	public String getChapterByModule(int moduleId);

	/**
	 * Servicio que recupera los datos de los graficos de un profesor
	 * 
	 * @param int teacherId
	 * @return String
	 */
	public String getDataGraphic(int teacherId);
}
