/**
 * Clase que mapea los objetos en lenguaje que entienda la BDD
 * @author David Díaz García
 * @date 25-04-2015
 */
package david.model.mapper;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import david.model.annotation.column;

public class Mapper<T> {
	
	/**
	 * Atributo que almacena una instancia generica
	 */
	private Class<?> mGenericInstance;
	/**
	 * Atributo que almacena la instancia del objeto que se quiere tratar
	 */
	private T mInstance;
	/**
	 * Atributo que almacena la parte select de la query
	 */
	private StringBuilder mQuerySelect;
	/**
	 * Atributo que almacena la parte from de la query
	 */
	private StringBuilder mQueryFrom;
	/**
	 * Atributo que almacena la parte where de la query
	 */
	private StringBuilder mQueryWhere;
	/**
	 * Atributo que almacena la parte insert de la query
	 */
	private StringBuilder mQueryInsert;
	/**
	 * Atributo que almacena la parte values de la query
	 */
	private StringBuilder mQueryValues;
	/**
	 * Atributo que almacena si existe clausula where;
	 */
	private boolean mIsThereWhere;
	/**
	 * Atributo que almacena los Fields de la clase;
	 */
	private Field[] mFields;
	
	/**
	 * Constructor
	 * @param  provider 
	 * @param T instance
	 */
	public Mapper(T instance) {
		mInstance = instance;
		mGenericInstance = mInstance.getClass();
		mIsThereWhere = false;
		mFields = mGenericInstance.getDeclaredFields();
	}
	
	/**
	 * Método que mapea los datos de la persistencia en sentencia MySql para extraer datos
	 */
	public String mapperToDbb(){
		prepareBuildersToSelect();
		
		for (Field field : mFields) {
			prepareSelect(field.getAnnotation(column.class).name());
			
			field.setAccessible(true);
			
			try {
				prepareWhere(field.getAnnotation(column.class).name(), field.getAnnotation(column.class).type(), field.get(mInstance));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		clearQuery();
		System.out.println("QUERY: "+mQuerySelect+" "+mQueryFrom+" "+mQueryWhere);
		return mQuerySelect+" "+mQueryFrom+" "+mQueryWhere;
	}
	

	/**
	 * Método que mapea los datos de la persistencia en sentencia MySql para insertar datos
	 */
	public String mapperStorageToDbb() {
		prepareBuildersToInsert();
		
		for (Field field : mFields) {
			field.setAccessible(true);
			
			try {
				prepareValues(field.getAnnotation(column.class).type(), field.get(mInstance));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
		clearQueryValues();
		mQueryValues.append(" )");
		System.out.println("INSERT INTO: "+mQueryInsert+" "+mQueryValues);
		return mQueryInsert+" "+mQueryValues;
	}

	/**
	 * Método que prepara la clausula values de la query;
	 * @param String type
	 * @param Object object
	 */
	private void prepareValues(String type, Object value) {
		if(value != null && type.equals("int")){
			mQueryValues.append(value+", ");
		}
		
		if(value != null && (type.equals("varchar") || type.equals("char"))){
			mQueryValues.append("'"+value+"', ");
		}
		
		if(value == null){
			mQueryValues.append("null, ");
		}
	}

	/**
	 * Método que prepara los StringBuilder para extraer datos
	 */
	private void prepareBuildersToSelect() {
		mQuerySelect = new StringBuilder();
		mQueryFrom = new StringBuilder();
		mQueryWhere = new StringBuilder();
		mQuerySelect.append("SELECT ");
		mQueryFrom.append("FROM "+getTable());
		mQueryWhere.append("WHERE ");
	}
	
	/**
	 * Método que prepara los StringBuilder para insertar datos
	 */
	private void prepareBuildersToInsert() {
		mQueryInsert = new StringBuilder();
		mQueryValues = new StringBuilder();
		mQueryInsert.append("INSERT INTO "+getTable());
		mQueryValues.append("VALUES ( ");
	}

	/**
	 * Método que limpia la query
	 */
	private void clearQuery() {
		mQuerySelect.delete(mQuerySelect.length() - 1, mQuerySelect.length());
		if(mIsThereWhere){
			mQueryWhere.delete(mQueryWhere.length() - 4, mQueryWhere.length());
		}else{
			mQueryWhere.delete(mQueryWhere.length() - 6, mQueryWhere.length());
		}
	}
	

	/**
	 * Método que limpia los últimos caracteres del queryValues
	 */
	private void clearQueryValues() {
		mQueryValues.delete(mQueryValues.length() - 2, mQueryValues.length());
	}

	/**
	 * Método que prepara la clausula WHERE
	 * @param String name
	 * @param String type
	 * @param Object value
	 */
	private void prepareWhere(String name, String type, Object value) {
		if(value != null && type.equals("int")){
			mQueryWhere.append(name+" = "+value+" and ");
			mIsThereWhere = true;
		}
		
		if(value != null && (type.equals("varchar") || type.equals("char"))){
			mQueryWhere.append(name+" = '"+value+"' and ");
			mIsThereWhere = true;
		}
	}

	/**
	 * Método que obtiene el nombre de la tabla
	 * @return String
	 */
	private String getTable() {
		String table = "";
		try {
			Method method = mGenericInstance.getDeclaredMethod("getTable");
			table = (String) method.invoke(mInstance);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return table;
	}

	/**
	 * Método que prepara la clausula SELECT
	 * @param String name
	 */
	private void prepareSelect(String name) {
		mQuerySelect.append(name+",");
	}

	/**
	 * Método que mapea los datos de un ResultSet a persistence
	 * @param ResultSet resultSet
	 * @return T
	 */
	public T mapperToPersistence(ResultSet resultSet) {
		try {
			if(resultSet.next()){
				setAtributtes(resultSet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mInstance;
	}

	/**
	 * Método que da valor a los atributos del objeto
	 * @param ResultSet resultSet
	 */
	private void setAtributtes(ResultSet resultSet) {
		Field[] fields = mGenericInstance.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				field.set(mInstance, resultSet.getObject(field.getAnnotation(column.class).name()));
			} catch (IllegalArgumentException | IllegalAccessException | SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}

	/**
	 * Método que mapea una lista de ResultSet
	 * @param ResultSet resultSet
	 * @return List<T>
	 */
	@SuppressWarnings("unchecked")
	public List<T> mapperAllToPersistence(ResultSet resultSet) {
		List<T> list = new ArrayList<T>();
		try {
			Method method = mGenericInstance.getDeclaredMethod("clone");
			while (resultSet.next()) {
				setAtributtes(resultSet);
				list.add((T) method.invoke(mInstance));
			}
		} catch (SQLException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return list;
	}
}
