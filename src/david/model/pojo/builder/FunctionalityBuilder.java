/**
 * Clase que construye una Functionality
 * @author David Díaz García
 * @date 31-05-2015
 */
package david.model.pojo.builder;

public class FunctionalityBuilder {

	/**
	 * Descripción de la funcionalidad
	 */
	private String mDescription;
	/**
	 * Identificador de la funcionalidad
	 */
	private int mId;
	/**
	 * Nombre de la funcionalidad
	 */
	private String mName;

	/**
	 * Descripción de la funcionalidad
	 */
	public String getDescription() {
		return mDescription;
	}

	/**
	 * Identificador de la funcionalidad
	 */
	public int getId() {
		return mId;
	}

	/**
	 * Nombre de la funcionalidad
	 */
	public String getName() {
		return mName;
	}

	/**
	 * Descripción de la funcionalidad
	 * 
	 * @param newVal
	 */
	public FunctionalityBuilder description(String newVal) {
		mDescription = newVal;
		return this;
	}

	/**
	 * Identificador de la funcionalidad
	 * 
	 * @param newVal
	 */
	public FunctionalityBuilder id(int newVal) {
		mId = newVal;
		return this;
	}

	/**
	 * Nombre de la funcionalidad
	 * 
	 * @param newVal
	 */
	public FunctionalityBuilder name(String newVal) {
		mName = newVal;
		return this;
	}

}
