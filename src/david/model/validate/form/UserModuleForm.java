/**
 * Clase que valida el formulario de CreateUserModule
 * @author David Díaz García
 * @date 30-05-2015
 */
package david.model.validate.form;

import java.lang.reflect.Field;
import java.util.Map;

import david.model.annotation.Parameter;

public class UserModuleForm extends Form implements IWebCreateUserModule {

	/**
	 * Atributo que almacena el valor del campo course
	 */
	@Parameter(name = "course", required = true, msg = "Tiene que selecionar un curso")
	private String mCourse;
	/**
	 * Atributo que almacena el valor del campo schools
	 */
	@Parameter(name = "schools", required = true, msg = "Tiene que selecionar un instituto")
	private String mSchool;
	/**
	 * Atributo que almacena el valor del campo cycle
	 */
	@Parameter(name = "cycle", required = true, msg = "Tiene que selecionar un ciclo")
	private String mCycle;
	/**
	 * Atributo que almacena el valor del campo module
	 */
	@Parameter(name = "module", required = true, msg = "Tiene que selecionar un modulo")
	private String mModule;
	/**
	 * Atributo que almacena el valor del campo pupils
	 */
	@Parameter(name = "pupils", required = true, type = "array", msg = "Tiene que selecionar uno o varios alumnos")
	private String[] mPupils;

	/**
	 * Método que valida los campos del formulario
	 * 
	 * @param Map
	 *            <String, String[]> parameter
	 * @return boolean
	 */
	public boolean validate(Map<String, String[]> parameter) {
		System.out.println("Estoy en el AddCourseSchoolCreate");
		boolean validate = true;
		for (Field field : this.getClass().getDeclaredFields()) {
			String[] value = parameter.get(field.getAnnotation(Parameter.class).name());

			if (field.getAnnotation(Parameter.class).type().equals("array")) {
				setAttributes(field, value);
			}

			if (field.getAnnotation(Parameter.class).type().equals("String")) {
				setAttributes(field, value[0]);
			}

			validate = validateField(field);
		}
		return validate;
	}

	/**
	 * Método que obtiene el valor del atributo mCourse
	 * 
	 * @return String
	 */
	public String getCourse() {
		return mCourse;
	}

	/**
	 * Método que establece el valor del atributo mCourse
	 * 
	 * @param String
	 *            mCourse
	 */
	public void setCourse(String mCourse) {
		this.mCourse = mCourse;
	}

	/**
	 * Método que obtiene el valor del atributo mSchool
	 * 
	 * @return String
	 */
	public String getSchool() {
		return mSchool;
	}

	/**
	 * Método que establece el valor del atributo mSchool
	 * 
	 * @param String
	 *            mSchool
	 */
	public void setSchool(String mSchool) {
		this.mSchool = mSchool;
	}

	/**
	 * Método que obtiene el valor del atributo mCycle
	 * 
	 * @return String
	 */
	public String getCycle() {
		return mCycle;
	}

	/**
	 * Método que establece el valor del atributo mCycle
	 * 
	 * @param String
	 *            mCycle
	 */
	public void setCycle(String mCycle) {
		this.mCycle = mCycle;
	}

	/**
	 * Método que obtiene el valor del atributo mModule
	 * 
	 * @return String
	 */
	public String getModule() {
		return mModule;
	}

	/**
	 * Método que establece el valor del atributo mModule
	 * 
	 * @param String
	 *            mModule
	 */
	public void setModule(String mModule) {
		this.mModule = mModule;
	}

	/**
	 * Método que obtiene el valor del atributo mPupils
	 * 
	 * @return String[]
	 */
	public String[] getPupils() {
		return mPupils;
	}

	/**
	 * Método que establece el valor del atributo mPupils
	 * 
	 * @param String
	 *            [] pupils
	 */
	public void setPupils(String[] pupils) {
		mPupils = pupils;
	}

}
