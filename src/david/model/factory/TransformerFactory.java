/**
 * Factoria de transformadores
 * @author David Díaz García
 * @date 23-04-2015
 */
package david.model.factory;

import david.model.transformer.AddressTransformer;
import david.model.transformer.CourseSchoolTransformer;
import david.model.transformer.CourseTransformer;
import david.model.transformer.CycleTransformer;
import david.model.transformer.IAddressTransformer;
import david.model.transformer.ICourseSchoolTransformer;
import david.model.transformer.ICourseTransformer;
import david.model.transformer.ICycleTransformer;
import david.model.transformer.IPersonTransformer;
import david.model.transformer.IRoleTransformer;
import david.model.transformer.ISchoolTransformer;
import david.model.transformer.IUserTransformer;
import david.model.transformer.PersonTransformer;
import david.model.transformer.RoleTransformer;
import david.model.transformer.SchoolTransformer;
import david.model.transformer.UserTransformer;

public class TransformerFactory {

	/**
	 * Método que construye un transformador de user
	 * @return IUserTransformer
	 */
	public static IUserTransformer createUserTransformer(){
		return new UserTransformer();
	}
	
	/**
	 * Método que construye un transformador de person
	 * @return IPersonTransformer
	 */
	public static IPersonTransformer createPersonTransformer(){
		return new PersonTransformer();
	}
	
	/**
	 * Método que construye un transformador de address
	 * @return IAddressTransformer
	 */
	public static IAddressTransformer createAddressTransformer(){
		return new AddressTransformer();
	}

	/**
	 * Método que construye un transformer de role
	 * @return IRoleTransformer
	 */
	public static IRoleTransformer createRoletransformer() {
		return new RoleTransformer();
	}

	/**
	 * Método que construye un transformer de school
	 * @return ISchoolTransformer
	 */
	public static ISchoolTransformer createSchoolTransformer() {
		return new SchoolTransformer();
	}

	/**
	 * Método que construye un transformador de course
	 * @return ICourseTransformer
	 */
	public static ICourseTransformer createCourseTransformer() {
		return new CourseTransformer();
	}
	
	/**
	 * Método que construye un transformador de courseSchool
	 * @return
	 */
	public static ICourseSchoolTransformer createCourseSchoolTransformer() {
		return new CourseSchoolTransformer();
	}

	/**
	 * Método que construye un transformador de cycle
	 * @return ICycleTransformer
	 */
	public static ICycleTransformer createCycleTransformer() {
		return new CycleTransformer();
	}
}
