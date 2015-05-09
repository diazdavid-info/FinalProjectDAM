/**
 * Clase que valida el formulario de create School
 * @author David Díaz García
 * @date 09-05-2015
 */
package david.model.validate.form;

import java.lang.reflect.Field;
import java.util.Map;

import david.model.annotation.Parameter;

public class SchoolCreateForm extends Form implements IWebCreateSchool{

	/**
	 * Atributo que almacena el valor del campo name
	 */
	@Parameter(name="name", required=true)
	private String mName;
	/**
	 * Atributo que almacena el valor del campo nif
	 */
	@Parameter(name="code", required=true)
	private String mCode;
	/**
	 * Atributo que almacena el valor del campo province
	 */
	@Parameter(name="province", required=true)
	private String mProvince;
	/**
	 * Atributo que almacena el valor del campo population
	 */
	@Parameter(name="population", required=true)
	private String mPopulation;
	/**
	 * Atributo que almacena el valor del campo description
	 */
	@Parameter(name="description", required=true)
	private String mDescription;
	
	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter){
		System.out.println("Estoy en el SchoolCreateForm");
		boolean validate = true;
		for (Field field : this.getClass().getDeclaredFields()) {
			String[] value = parameter.get(field.getAnnotation(Parameter.class).name());
			setAttributes(field, value[0]);
			validate = validateField(field);
		}
		return validate;
	}
	
	/**
	 * Método que obtiene el valor del campo name
	 * @return String
	 */
	public String getName() {
		return mName;
	}
	
	/**
	 * Método que obtiene el valor del campo code
	 * @return String
	 */
	public String getCode() {
		return mCode;
	}
	
	/**
	 * Método que obtiene el valor del campo province
	 * @return String
	 */
	public String getProvince() {
		return mProvince;
	}
	
	/**
	 * Método que obtiene el valor del campo population
	 * @return String
	 */
	public String getPopulation() {
		return mPopulation;
	}
	
	/**
	 * Método que obtiene el valor del campo description
	 * @return String
	 */
	public String getDescription() {
		return mDescription;
	}
}
