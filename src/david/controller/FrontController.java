/**
 * Clase encargada de gestionar la llamada a un controlador especifico
 * @author David Diaz Garcia
 * @date 18-04-2015
 * @version 1.0
 */
package david.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import david.utils.ToolsArray;

public class FrontController {
	
	/**
	 * Atributo con una instancia generica del controlador
	 */
	private static Class<?> mGenericController;
	/**
	 * Atributo con una instancia del controlador
	 */
	private static Controller mController;
	
	/**
	 * Método encargado de llamar invocar la método solicitado
	 * @param nameServlet 
	 * @param HttpServletRequest request
	 * @param HttpServletResponse response
	 */
	public static void init(HttpServletRequest request, HttpServletResponse response, String nameServlet){
		instanceController(nameServlet);
		
		setController(request, response);
		
		invokeController(extractActionRequest(request.getPathInfo()));
	}
	
	/**
	 * Método que instancia el controlador
	 * @param String nameServlet 
	 */
	private static void instanceController(String nameServlet) {
		try {
			mGenericController = Class.forName("david.controller."+nameServlet+"Controller");
			mController = (Controller) mGenericController.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método que invoca al controlador
	 * @param String action
	 */
	private static void invokeController(String action) {
		Method method = null;
		try {
			method = mGenericController.getDeclaredMethod(action+"Action");
			method.invoke(mController);
		} catch (IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método encargado en configurar los parametros del controlador padre
	 * @param HttpServletRequest response 
	 * @param HttpServletResponse request 
	 */
	private static void setController(HttpServletRequest request, HttpServletResponse response){
		Method method = null;
		try {
			method = mGenericController.getSuperclass().getDeclaredMethod("setServletRequest", HttpServletRequest.class);
			method.invoke(mController, request);
			
			method = mGenericController.getSuperclass().getDeclaredMethod("setServletResponse", HttpServletResponse.class);
			method.invoke(mController, response);
		} catch (IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que extrae la acción de la URL
	 * @param String pathInfo
	 * @return String
	 */
	private static String extractActionRequest(String pathInfo){
		return (pathInfo != null) ? checkData(pathInfo.split("/")) : "index";
	}
	
	/**
	 * Método encargado de revisar si viene la acción que se quiere invocar
	 * @param String[] arg
	 * @return String
	 */
	private static String checkData(String[] arg){
		arg = ToolsArray.clear(arg);
		return (arg.length > 0) ? arg[0] : "index";
	}

}
