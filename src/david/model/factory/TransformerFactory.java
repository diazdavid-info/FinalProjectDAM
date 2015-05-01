/**
 * Factoria de transformadores
 * @author David Díaz García
 * @date 23-04-2015
 */
package david.model.factory;

import david.model.transformer.IUserTransformer;
import david.model.transformer.UserTransformer;

public class TransformerFactory {

	/**
	 * Método que te construye un transformador de usuarios
	 * @return IUserTransformer
	 */
	public static IUserTransformer createUserTransformer(){
		return new UserTransformer();
	}
}
