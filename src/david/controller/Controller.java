/**
 * Clase super de los controladores
 * @author David Diaz Garcia
 * @date 18-04-2015
 * @version 1.0
 */
package david.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller {
	
	/**
	 * Atributo que almacenar el request del servlet
	 */
	protected HttpServletRequest mServletRequest = null;
	/**
	 * Atributo que almacena el response del servlet
	 */
	protected HttpServletResponse mServletResponse = null;
	
	/**
	 * Método que establece el valor del atributo mServletRequest
	 * @param HttpServletRequest request
	 */
	public void setServletRequest(HttpServletRequest request){
		mServletRequest = request;
	}
	
	/**
	 * Método que extablece el valor del atributo mServletResponse
	 * @param HttpServletResponse response
	 */
	public void setServletResponse(HttpServletResponse response){
		mServletResponse = response;
	}
	
	/**
	 * Método que renderiza la vista
	 * @param String viewName
	 */
	protected void render(String viewName) {
		try {
			mServletRequest.getRequestDispatcher("/WEB-INF/"+viewName).include(mServletRequest, mServletResponse);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

}
