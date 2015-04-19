/**
 * Interface que implementará todos los proveedores de mi aplicación.
 * @author David Díaz
 * @version 1.0
 * @updated 21-mar-2015 19:44:00
 */
package david.model.provider;

public interface DProvider {
	
	/**
	 * Método que conecta con la base de datos
	 * @param host String
	 * @param user String
	 * @param pass String
	 * @param ddbbname String
	 */
	public void connect(String host, String user, String pass, String ddbbname);
	
	/**
	 * Método que desconecta con la base de datos
	 */
	public void disconnect();
	
	/**
	 * Método que comprueba si se esta conectado a la base de datos
	 * @return boolean
	 */
	public boolean isConnected();

}
