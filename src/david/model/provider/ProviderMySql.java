package david.model.provider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProviderMySql implements DProvider {
	
	private Connection connection;
	
	public ProviderMySql() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
	}

	/**
	 * Método que conecta con la base de datos
	 * @param host String
	 * @param user String
	 * @param pass String
	 * @param ddbbname String
	 */
	@Override
	public void connect(String host, String user, String pass, String ddbbname) {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://"+host+"/"+ddbbname+"?useServerPrepStmts=true",user,pass);
		} catch (SQLException e) {
			System.err.println("Error al conectar a la base de datos, mensage: "+e.getMessage()+" código de error: "+e.getErrorCode());
		}
		
	}

	/**
	 * Método que desconecta con la base de datos
	 */
	@Override
	public void disconnect() {
		try {
			connection.close();
			connection = null;
		} catch (SQLException e) {
			System.err.println("Error al cerrar la conexión con la base de datos, mensage: "+e.getMessage()+" código de error: "+e.getErrorCode());
		}
	}

	/**
	 * Método que comprueba si se esta conectado a la base de datos
	 * @return boolean
	 */
	@Override
	public boolean isConnected() {
		return (connection == null) ? false : true;
	}

	

}
