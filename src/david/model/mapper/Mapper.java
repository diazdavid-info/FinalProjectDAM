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
	 * Método que almacena si existe clausula where;
	 */
	private boolean mIsThereWhere;
	
	/**
	 * Constructor
	 * @param  provider 
	 * @param T instance
	 */
	public Mapper(T instance) {
		mInstance = instance;
		mGenericInstance = mInstance.getClass();
		mIsThereWhere = false;
	}
	
	/**
	 * Método que mapea los datos de la persistencia en sentencia MySql
	 */
	public String mapperToDbb(){
		prepareBuilders();
		
		Field[] fields = mGenericInstance.getDeclaredFields();
		for (Field field : fields) {
			prepareSelect(field.getAnnotation(column.class).name());
			field.setAccessible(true);
			try {
				prepareWhere(field.getAnnotation(column.class).name(), field.getAnnotation(column.class).type(), field.get(mInstance));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		clearQuery();
		prepareFrom();
		System.out.println("QUERY: "+mQuerySelect+" "+mQueryFrom+" "+mQueryWhere);
		return mQuerySelect+" "+mQueryFrom+" "+mQueryWhere;
	}

	/**
	 * Método que prepara los StringBuilder
	 */
	private void prepareBuilders() {
		mQuerySelect = new StringBuilder();
		mQueryFrom = new StringBuilder();
		mQueryWhere = new StringBuilder();
		mQuerySelect.append("SELECT ");
		mQueryFrom.append("FROM ");
		mQueryWhere.append("WHERE ");
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
	 * Método que prepara la clausula WHERE
	 * @param String name
	 * @param String type
	 * @param Object value
	 */
	private void prepareWhere(String name, String type, Object value) {
		System.out.println("NAME: "+name+" TYPE: "+type+" VALUE: "+value);
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
	 * Método que prepara la clausula FROM
	 */
	private void prepareFrom() {
		try {
			Method method = mGenericInstance.getDeclaredMethod("getTable");
			mQueryFrom.append(method.invoke(mInstance));
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
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
				System.out.println("ID: "+resultSet.getString("mId"));
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
	public List<T> mapperAllToPersistence(ResultSet resultSet) {
		List<T> list = new ArrayList<T>();
		try {
			while (resultSet.next()) {
				setAtributtes(resultSet);
				list.add(mInstance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
