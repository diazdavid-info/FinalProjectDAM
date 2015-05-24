/**
 * Clase que construye un chapter
 * @author David Díaz García
 * @date 26-05-2015
 */
package david.model.pojo.builder;

public class ChapterBuilder {
	
	/**
	 * Atributo que almacena las horas
	 */
	private int mHour;
	/**
	 * Atributo que almacena el ID
	 */
	private int mId;
	/**
	 * Atributo que almacena el nombre
	 */
	private String mName;

	/**
	 * Método que obtiene el valor del atributo mHour
	 * @return int
	 */
	public int getHour(){
		return mHour;
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
	 * Método que establece el valor del atributo mHour
	 * @param int newVal
	 * @return ChapterBuilder
	 */
	public ChapterBuilder hour(int newVal){
		mHour = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mId
	 * @param int newVal
	 * @return ChapterBuilder
	 */
	public ChapterBuilder id(int newVal){
		mId = newVal;
		return this;
	}

	/**
	 * Método que establece el valor del atributo mName
	 * @param String newVal
	 * @return ChapterBuilder
	 */
	public ChapterBuilder name(String newVal){
		mName = newVal;
		return this;
	}

}
