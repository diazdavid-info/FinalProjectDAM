/**
 * Clase que fabrica providers
 * @author David Díaz García
 * @date 1-05-2015
 */
package david.model.factory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import david.model.provider.DProvider;
import david.model.provider.ProviderMySql;

public class ProviderFactory {

	/**
	 * Atributo que almacena el nombre del datasource de la conexion local con bdd MySql
	 */
	private static final String NAME_DATA_SOURCE_LOCAL_MYSQL = "java:/comp/env/jdbc/seguimiento";

	/**
	 * Método que fabrica un proveedor MySQl
	 * 
	 * @return DProvider
	 */
	public static DProvider createMysqlProvider() {
		return new ProviderMySql(prepareDataSource(NAME_DATA_SOURCE_LOCAL_MYSQL));
	}

	/**
	 * Prepara un dataSource recogiendo los valores del context.xml
	 * 
	 * @param String
	 *            nameContext
	 * @return DataSource
	 */
	private static DataSource prepareDataSource(String nameContext) {
		Context context = null;
		DataSource dataSource = null;
		try {
			context = new InitialContext();
			dataSource = (DataSource) context.lookup(nameContext);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return dataSource;
	}

}
