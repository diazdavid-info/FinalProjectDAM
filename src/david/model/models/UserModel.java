/**
 * Modelo para todo lo relacionado con un usuario
 * @author David Díaz García
 * @date 19-05-2015
 * @version 1.0
 */
package david.model.models;

import java.util.Map;

import david.model.validate.form.LoginForm;

public class UserModel implements DUserModel{
	
	/**
	 * Método que gestiona el login de usuarios
	 */
	public void loginUser(Map<String, String[]> parameter){
		LoginForm form = new LoginForm();
		if(form.validate(parameter)){
			
		}
		System.out.println("Estoy en el UserModel");
	}

}
