/**
 * Clase Graphic
 * @author David Díaz
 * @version 1.0
 * @date 30-05-2015
 */
package david.model.pojo.graphic;

public class Graphic {

	/**
	 * Atributo que almacena el nombre de las etiquetas
	 */
	private String[] labels;
	/**
	 * Atributo que almacena los datos de las columnas
	 */
	private Column[] datasets;
	/**
	 * Atributo que almacena el nombre del ciclo
	 */
	private String nameCycle;

	/**
	 * Constructor
	 */
	public Graphic() {
	}

	/**
	 * Método que obtiene el valor del atributo labels
	 * 
	 * @return String[]
	 */
	public String[] getLabels() {
		return labels;
	}

	/**
	 * Atributo que establece el valor del atributo labels
	 * 
	 * @param String
	 *            [] labels
	 */
	public void setLabels(String[] labels) {
		this.labels = labels;
	}

	/**
	 * Método que obtiene el valor del atributo datasets
	 * 
	 * @return Column[]
	 */
	public Column[] getColumns() {
		return datasets;
	}

	/**
	 * Método que establece el valor del atributo datasets
	 * 
	 * @param Column
	 *            [] columns
	 */
	public void setColumns(Column[] columns) {
		datasets = columns;
	}

	/**
	 * Método que obtiene el valor del atributo nameCycle
	 * 
	 * @return String
	 */
	public String getNameCycle() {
		return nameCycle;
	}

	/**
	 * Método que establece le valor del atributo nameCycle
	 * 
	 * @param String
	 *            name
	 */
	public void setNameCycle(String name) {
		nameCycle = name;
	}
}
