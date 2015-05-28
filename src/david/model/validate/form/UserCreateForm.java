/**
 * Clase que valida el formulario de create
 * @author David Díaz García
 * @date 03-05-2015
 */
package david.model.validate.form;

import java.lang.reflect.Field;
import java.util.Map;

import david.model.annotation.Encriptor;
import david.model.annotation.Parameter;
import david.security.Encryptor;

public class UserCreateForm extends Form implements IWebCreateUser {

	/**
	 * Atributo que almacena el valor del campo username
	 */
	@Parameter(name = "username", required = true)
	private String mUsername;
	/**
	 * Atributo que almacena el valor del campo password
	 */
	@Parameter(name = "password", required = true)
	@Encriptor(value = true, type = Encryptor.MD5)
	private String mPassword;
	/**
	 * Atributo que almacena el valor del campo name
	 */
	@Parameter(name = "name", required = true)
	private String mName;
	/**
	 * Atributo que almacena el valor del campo nif
	 */
	@Parameter(name = "nif", required = true)
	private String mNif;
	/**
	 * Atributo que almacena el valor del campo surname1
	 */
	@Parameter(name = "surname1", required = true)
	private String mSurname1;
	/**
	 * Atributo que almacena el valor del campo surname2
	 */
	@Parameter(name = "surname2", required = true)
	private String mSurname2;
	/**
	 * Atributo que almacena el valor del campo email
	 */
	@Parameter(name = "email", required = true)
	private String mEmail;
	/**
	 * Atributo que almacena el valor del campo province
	 */
	@Parameter(name = "province", required = true)
	private String mProvince;
	/**
	 * Atributo que almacena el valor del campo population
	 */
	@Parameter(name = "population", required = true)
	private String mPopulation;
	/**
	 * Atributo que almacena el valor del campo description
	 */
	@Parameter(name = "description", required = true)
	private String mDescription;
	/**
	 * Atributo que almacena el valor del campo role
	 */
	@Parameter(name = "role", required = true)
	private String mRole;

	/**
	 * Método que valida los campos del formulario
	 * 
	 * @param Map
	 *            <String, String[]> parameter
	 * @return boolean
	 */
	@Override
	public boolean validate(Map<String, String[]> parameter) {
		System.out.println("Estoy en el CreateForm");
		boolean validate = true;
		for (Field field : this.getClass().getDeclaredFields()) {
			String[] value = parameter.get(field.getAnnotation(Parameter.class).name());
			setAttributes(field, value[0]);
			validate = validateField(field);
		}
		return validate;
	}

	/**
	 * Método que devuelve el campo username
	 * 
	 * @return String
	 */
	@Override
	public String getUsername() {
		return mUsername;
	}

	/**
	 * Método que devuelve el campo password
	 * 
	 * @return String
	 */
	@Override
	public String getPassword() {
		return mPassword;
	}

	/**
	 * Método que devuelve el campo name
	 * 
	 * @return String
	 */
	@Override
	public String getName() {
		return mName;
	}

	/**
	 * Método que devuelve el campo nif
	 * 
	 * @return String
	 */
	@Override
	public String getNif() {
		return mNif;
	}

	/**
	 * Método que devuelve el campo surname1
	 * 
	 * @return String
	 */
	@Override
	public String getSurname1() {
		return mSurname1;
	}

	/**
	 * Método que devuelve el campo surname2
	 * 
	 * @return String
	 */
	@Override
	public String getSurname2() {
		return mSurname2;
	}

	/**
	 * Método que devuelve el campo email
	 * 
	 * @return String
	 */
	@Override
	public String getEmail() {
		return mEmail;
	}

	/**
	 * Método que obtiene el campo province
	 * 
	 * @return String
	 */
	@Override
	public String getProvince() {
		return mProvince;
	}

	/**
	 * Método que obtiene el campo population
	 * 
	 * @return String
	 */
	@Override
	public String getPopulation() {
		return mPopulation;
	}

	/**
	 * Método que obtiene el campo description
	 * 
	 * @return String
	 */
	@Override
	public String getDescription() {
		return mDescription;
	}

	/**
	 * Método que obtiene el campo role
	 * 
	 * @return String
	 */
	@Override
	public String getRole() {
		return mRole;
	}

}
