/**
 * Clase que se encarga de la publicación de servicios
 * @author David Díaz García
 * @date 16-05-2015
 */
package david.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import david.services.implement.ImplementServices;

@WebService
@Path("/apiServices")
public class ApiServices implements IApiServices{
	
	/**
	 * Atributo que almacena la instacia de la clase de implementación de los servicios
	 */
	private static final ImplementServices IMPLEMENT_SERVICES = new ImplementServices();
	
	/**
	 * Servicio que recupera todos los institutos de un curso
	 * @param int courseId
	 * @return String
	 */
	@POST
	@Path("/getSchoolByCourseId")
	@Produces(MediaType.APPLICATION_JSON)
	@WebMethod
	public String getSchoolByCourseId(@QueryParam("course") int courseId){
		return IMPLEMENT_SERVICES.getSchoolByCourseId(courseId);
	}
	
	/**
	 * Servicio que recupera todos los ciclos
	 * @param int courseId
	 * @param int schoolId
	 * @param int tutorId
	 * @return String
	 */
	@GET
	@Path("/getCycleByCourseIdSchoolIdTutorId")
	@Produces(MediaType.APPLICATION_JSON)
	@WebMethod
	public String getCycleByCourseIdSchoolIdTutorId(@QueryParam("course") int courseId, @QueryParam("school") int schoolId, @QueryParam("tutor") int tutorId){
		return IMPLEMENT_SERVICES.getCycleByCourseIdSchoolIdTutorId(courseId, schoolId, tutorId);
	}
	
	/**
	 * Servicio que recupera todos los ciclos
	 * @param int courseId
	 * @param int schoolId
	 * @return String
	 */
	@GET
	@Path("/getCycleByCourseIdSchoolId")
	@Produces(MediaType.APPLICATION_JSON)
	@WebMethod
	public String getCycleByCourseIdSchoolId(@QueryParam("course") int courseId, @QueryParam("school") int schoolId){
		return IMPLEMENT_SERVICES.getCycleByCourseIdSchoolId(courseId, schoolId);
	}
	
	/**
	 * Servicio que recupera todos los módulos de un curso, de un instituto y de un ciclo
	 * @param int courseId
	 * @param int schoolId
	 * @param int cycleId
	 * @return String
	 */
	@GET
	@Path("/getModuleByCourseSchoolCycle")
	@Produces(MediaType.APPLICATION_JSON)
	@WebMethod
	public String getModuleByCourseSchoolCycle(@QueryParam("course") int courseId, @QueryParam("school") int schoolId, @QueryParam("cycle") int cycleId){
		return IMPLEMENT_SERVICES.getModuleByCourseSchoolCycle(courseId, schoolId, cycleId);
	}
}
