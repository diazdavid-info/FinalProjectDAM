package david.model.validate.form;

import java.util.Map;

public interface IWebCreateSubtype {
	
	/**
	 * Método que valida los campos del formulario
	 * @param Map<String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter);
	
	/**
	 * Método que obtiene el valor del atributo mName
	 * @return String
	 */
	public String getName();
	
	/**
	 * Método que obtiene el valor del atributo mDescription
	 * @return String
	 */
	public String getDescription();

}
