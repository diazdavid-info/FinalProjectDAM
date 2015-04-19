/**
 * Clase que se encarga de los mensajes al usuario
 * @author David Díaz García
 * @date 19-04-2015
 * @version 1.0
 */
package david.utils;

import java.util.ArrayList;

public class Message {
	
	private static ArrayList<String> messages = new ArrayList<String>();
	
	public static void addMesagge(String message){
		messages.add(message);
	}
	
	public static ArrayList<String> getMessage(){
		ArrayList<String> result = new ArrayList<String>();
		result.addAll(messages);
		messages.removeAll(messages);
		return result;
	}
	

}
