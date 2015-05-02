/**
 * Clase super de los controladores
 * @author David Diaz Garcia
 * @date 18-04-2015
 * @version 1.0
 */
package david.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import david.model.pojo.users.User;

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
	 * Atributo que almacena los parametros de un request
	 */
	protected Map<String, String[]> mRequestParameter = null;
	
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
	 * Método que establece el valor al atributo mRequestParameter
	 * @param Map<String, String[]> requestParameter
	 */
	public void setRequestParameter(Map<String, String[]> requestParameter){
		mRequestParameter = requestParameter;
	}
	
	/**
	 * Método que obtiene el valor del atributo mRequestParameter
	 * @return Map<String, String[]>
	 */
	public Map<String, String[]> getRequestParameter(){
		return mRequestParameter;
	}
	
	/**
	 * Método que renderiza la vista
	 * @param String viewName
	 */
	protected void render(String viewName) {
		try {
			mServletRequest.getRequestDispatcher("/view/"+viewName+".jsp").include(mServletRequest, mServletResponse);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que redirecciona a una URL
	 * @param String path
	 */
	protected void redirect(String path) {
		try {
			mServletResponse.sendRedirect(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que comprueba si hay parametros en una petición get o post
	 * @return boolean
	 */
	protected boolean isRequest() {
		return !mRequestParameter.isEmpty();
	}
	
	/**
	 * Método que comprueba si un usuario esta logeado
	 * @return boolean
	 */
	protected boolean isLogin() {
		HttpSession session = mServletRequest.getSession();
		User user = (User) session.getAttribute("user");
		if(user == null){
			redirect("user");
		}
		return (user != null) ? true : false;
	}

}
