/**
 * Clase que construye un subtype
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.pojo.builder;

public class SubtypeBuilder {
	
	/**
	 * Atributo que almacena la descripción
	 */
	private String mDescription;
	/**
	 * Atributo que almacena el ID
	 */
	private int mId;
	/**
	 * Atributo que almacena el nombre
	 */
	private String mName;

	/**
	 * Método que obtiene el valor del atributo mDescription
	 * @return String
	 */
	public String getDescription(){
		return mDescription;
	}

	/**
	 * Método que obtiene el valor del atributo mId
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Método que obtiene el valor del atributo mName
	 * @return String
	 */
	public String getName(){
		return mName;
	}

	/**
	 * Método que establece el valor del atributo mDescription
	 * @param String newVal
	 * @return SubtypeBuilder
	 */
	public SubtypeBuilder description(String newVal){
		mDescription = newVal;
		return this;
	}

	/**
	 * Atributo que establece el valor dels atributo mId
	 * @param int newVal
	 * @return SubtypeBuilder
	 */
	public SubtypeBuilder id(int newVal){
		mId = newVal;
		return this;
	}

	/**
	 * Atributo que establece el valor del atributo mName
	 * @param String newVal
	 * @return SubtypeBuilder
	 */
	public SubtypeBuilder name(String newVal){
		mName = newVal;
		return this;
	}

}
