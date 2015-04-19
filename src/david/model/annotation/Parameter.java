/**
 * Clase con las anotaciones que se necesitan para validar un formulario
 * @author David Díaz García
 * @date 19-05-2015
 * @version 1.0
 */
package david.model.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Parameter {

	/**
	 * Anotación con el nombre del campo del formulario
	 * @return String
	 */
	public String name();

	/**
	 * Anotación que indica si el campo es requerido
	 * @return boolean
	 */
	public boolean required();
}
