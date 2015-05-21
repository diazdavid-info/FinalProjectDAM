/**
 * Interface que implementará todos los proveedores de mi aplicación.
 * @author David Díaz
 * @version 1.0
 * @updated 21-mar-2015 19:44:00
 */
package david.model.provider;

import java.sql.ResultSet;

public interface DProvider {
	
	/**
	 * Método que conecta con la base de datos
	 */
	public void connect();
	
	/**
	 * Método que desconecta con la base de datos
	 */
	public void disconnect();
	
	/**
	 * Método que comprueba si se esta conectado a la base de datos
	 * @return boolean
	 */
	public boolean isConnected();
	
	/**
	 * Método que ejecuta una query
	 * @param String query
	 * @return ResultSet
	 */
	public ResultSet executeQuery(String query);
	
	/**
	 * Método que inserta un registro en la BDD
	 * @param String update
	 * @return int
	 */
	public int executeUpdate(String update);

}
