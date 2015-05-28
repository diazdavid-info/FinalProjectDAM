/**
 * Metadatos que representan la encriptación del atributo
 * @author David Díaz García
 * @date 28-05-2015
 */
package david.model.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Encriptor {

	/**
	 * Tipo de encriptado
	 * 
	 * @return String
	 */
	public String type() default "md5";

	/**
	 * Atributo que indica si se ha de cifrar el atributo
	 * 
	 * @return boolean
	 */
	public boolean value() default false;

}
