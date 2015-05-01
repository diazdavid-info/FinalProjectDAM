/**
 * Metadatos que representan la información de las columnas de la BDD
 * @author David Díaz García
 * @date 25-04-2015
 */
package david.model.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface column {

	/**
	 * Nombre de la columna
	 * @return String
	 */
	public String name();

	/**
	 * Tipo de la columna
	 * @return String
	 */
	public String type();

}
