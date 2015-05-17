/**
 * Interfaz que debe sei implementada por la capa de servicios
 * @author David Díaz García
 * @date 16-05-2015
 */
package david.services;



public interface IApiServices {
	
	/**
	 * Servicio que recupera todos los institutos de un curso
	 * @param int courseId
	 * @return String
	 */
	public String getSchoolByCourseId(int courseId);
}
