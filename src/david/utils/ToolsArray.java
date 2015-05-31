/**
 * @author David Díaz García
 * @date 04/04/2015
 * @version 1.0
 * Clase que contiene herramientas para el tratamiento de Arrays.
 */
package david.utils;

import java.util.ArrayList;
import java.util.List;

import david.model.pojo.graphic.Column;

public class ToolsArray {

	/**
	 * Método que elimina las posiciones de la array vacias.
	 * 
	 * @param String
	 *            [] arg
	 * @return String[]
	 */
	public static String[] clear(String[] arg) {
		ArrayList<String> list = new ArrayList<String>();
		String[] array;
		for (String string : arg) {
			if (string.length() > 0)
				list.add(string);
		}
		array = new String[list.size()];
		return list.toArray(array);
	}

	/**
	 * Método que convierte una lista de String en un array de String
	 * 
	 * @param List
	 *            <String> list
	 * @return String[]
	 */
	public static String[] listStringToArrayString(List<String> list) {
		String[] arg = new String[list.size()];
		return list.toArray(arg);
	}

	/**
	 * Método que conviete una lista de Integer en un array de Integer
	 * 
	 * @param List
	 *            <Integer> list
	 * @return Integer[]
	 */
	public static Integer[] listIntegerToArrayInteger(List<Integer> list) {
		Integer[] arg = new Integer[list.size()];
		return list.toArray(arg);
	}

	/**
	 * Método que convierte una lista de Column en un array de Column
	 * 
	 * @param List
	 *            <Column> list
	 * @return Column[]
	 */
	public static Column[] listColumnToArrayColumn(List<Column> list) {
		Column[] arg = new Column[list.size()];
		return list.toArray(arg);
	}

}
