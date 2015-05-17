/**
 * Clase que se encarga de la publicación de servicios
 * @author David Díaz García
 * @date 16-05-2015
 */
package david.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
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
}
