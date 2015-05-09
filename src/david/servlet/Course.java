/**
 * Servlet para las peticiones de Course
 * @author David Diaz Garcia
 * @date 09-05-2015
 */
package david.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import david.controller.FrontController;

/**
 * Servlet implementation class Course
 */
@WebServlet("/Course")
public class Course extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String NAME_SERVLET = "Course";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Course() {
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
