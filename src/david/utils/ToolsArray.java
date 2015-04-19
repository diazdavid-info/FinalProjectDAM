/**
 * @author David Díaz García
 * @date 04/04/2015
 * @version 1.0
 * Clase que contiene herramientas para el tratamiento de Arrays.
 */
package david.utils;

import java.util.ArrayList;

public class ToolsArray {
	
	/**
	 * Método que elimina las posiciones de la array vacias.
	 * @param String[] arg
	 * @return String[]
	 */
	public static String[] clear(String[] arg){
		ArrayList<String> list = new ArrayList<String>();
		String[] array;
		for (String string : arg) {
			if(string.length() > 0)
				list.add(string);
		}
		array = new String[list.size()];
		return list.toArray(array);
	}

}
