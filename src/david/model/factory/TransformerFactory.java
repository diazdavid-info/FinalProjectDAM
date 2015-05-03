/**
 * Factoria de transformadores
 * @author David Díaz García
 * @date 23-04-2015
 */
package david.model.factory;

import david.model.transformer.AddressTransformer;
import david.model.transformer.IAddressTransformer;
import david.model.transformer.IPersonTransformer;
import david.model.transformer.IRoleTransformer;
import david.model.transformer.IUserTransformer;
import david.model.transformer.PersonTransformer;
import david.model.transformer.RoleTransformer;
import david.model.transformer.UserTransformer;

public class TransformerFactory {

	/**
	 * Método que construye un transformador de user
	 * @return IUserTransformer
	 */
	public static IUserTransformer createUserTransformer(){
		return new UserTransformer();
	}
	
	/**
	 * Método que construye un transformador de person
	 * @return IPersonTransformer
	 */
	public static IPersonTransformer createPersonTransformer(){
		return new PersonTransformer();
	}
	
	/**
	 * Método que construye un transformador de address
	 * @return IAddressTransformer
	 */
	public static IAddressTransformer createAddressTransformer(){
		return new AddressTransformer();
	}

	/**
	 * Método que construye un transformer de role
	 * @return IRoleTransformer
	 */
	public static IRoleTransformer createRoletransformer() {
		return new RoleTransformer();
	}
}
