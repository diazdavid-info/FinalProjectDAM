/**
 * Servlet para las peticiones de School
 * @author David Diaz Garcia
 * @date 09-05-2015
 * @version 1.0
 */
package david.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import david.controller.FrontController;

/**
 * Servlet implementation class School
 */
public class School extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String NAME_SERVLET = "School";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public School() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request(request, response);
	}
	
	/**
	 * Método que llama al frontController
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 */
	private void request(HttpServletRequest request,HttpServletResponse response) {
		FrontController.init(request, response, NAME_SERVLET);
	}

}
