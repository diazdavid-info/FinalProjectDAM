package david.model.provider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class ProviderMySql implements DProvider {
	
	private Connection mConnection;
	private DataSource mDataSource;
	private Statement mStatement;
	private ResultSet mResultSet;
	
	public ProviderMySql(DataSource dataSource){
		mDataSource = dataSource;
	}

	/**
	 * Método que conecta con la base de datos
	 */
	private void connect() {
		try {
			mConnection = mDataSource.getConnection();
		} catch (SQLException e) {
			System.err.println("Error al conectar con la base de datos, mensage: "+e.getMessage()+" código de error: "+e.getErrorCode());
		}
	}

	/**
	 * Método que desconecta con la base de datos
	 */
	@SuppressWarnings("unused")
	private void disconnect() {
		try {
			mConnection.close();
			mConnection = null;
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
		return (mConnection == null) ? false : true;
	}
	
	/**
	 * Método que ejecuta una query
	 * @param String query
	 * @return ResultSet
	 */
	@Override
	public ResultSet executeQuery(String query){
		this.connect();
		try {
			mStatement = mConnection.createStatement();
			mResultSet = mStatement.executeQuery(query);
		} catch (SQLException e) {
			System.err.println("Error al ejecutar la query, mensage: "+e.getMessage()+" código de error: "+e.getErrorCode());
		}
//		this.disconnect();
		return mResultSet;
	}
	
	/**
	 * Método que inserta un registro en la BDD
	 * @param String update
	 * @return int
	 */
	@Override
	public int executeUpdate(String update){
		int id = -1;
		this.connect();
		try {
			mStatement = mConnection.createStatement();
			mStatement.executeUpdate(update, Statement.RETURN_GENERATED_KEYS);
			mResultSet = mStatement.getGeneratedKeys();
			mResultSet.next();
			id = mResultSet.getInt(1);
		} catch (SQLException e) {
			System.err.println("Error al ejecutar el update, mensage: "+e.getMessage()+" código de error: "+e.getErrorCode());
		}
		return id;
	}

	

}
