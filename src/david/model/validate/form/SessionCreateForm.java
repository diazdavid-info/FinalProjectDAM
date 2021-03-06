/**
 * Clase que valida el formulario de create session
 * @author David Díaz García
 * @date 25-05-2015
 */
package david.model.validate.form;

import java.lang.reflect.Field;
import java.util.Map;

import david.model.annotation.Parameter;

public class SessionCreateForm extends Form implements IWebCreateSession {

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
	 * Atributo que almacena el valor del campo type
	 */
	@Parameter(name = "type", required = true, msg = "Tiene que selecionar un tipo de session")
	private String mType;
	/**
	 * Atributo que almacena el valor del campo subtype
	 */
	@Parameter(name = "subtype", required = true, msg = "Tiene que selecionar un subtipo de session")
	private String mSubtype;
	/**
	 * Atributo que almacena el valor del campo subtype
	 */
	@Parameter(name = "chapter", required = true, msg = "Tiene que selecionar un capitulo")
	private String mChapter;
	/**
	 * Atributo que almacena el valor del campo hour
	 */
	@Parameter(name = "hour", required = true, msg = "Tiene que selecionar las horas de la session")
	private String mHour;
	@Parameter(name = "date", required = true, msg = "Tiene que introducir una fecha")
	private String mDate;
	/**
	 * Atributo que almacena el valor del campo description
	 */
	@Parameter(name = "description", required = true, msg = "Tiene que redactar una descripcion")
	private String mDescription;

	/**
	 * Método que valida los campos del formulario
	 * 
	 * @param Map
	 *            <String, String[]> parameter
	 * @return boolean
	 */
	@Override
	public boolean validate(Map<String, String[]> parameter) {
		boolean validate = true;
		for (Field field : this.getClass().getDeclaredFields()) {
			String[] value = parameter.get(field.getAnnotation(Parameter.class).name());
			setAttributes(field, (value == null) ? "" : value[0]);
			validate = validateField(field);
		}
		return validate;
	}

	/**
	 * Método que obtiene el valor del atributo mCourse
	 * 
	 * @return String
	 */
	@Override
	public String getCourse() {
		return mCourse;
	}

	/**
	 * Método que establece el valor del atributo mCourse
	 * 
	 * @param String
	 *            mCourse
	 */
	@Override
	public void setCourse(String mCourse) {
		this.mCourse = mCourse;
	}

	/**
	 * Método que obtiene el valor del atributo mSchool
	 * 
	 * @return String
	 */
	@Override
	public String getSchool() {
		return mSchool;
	}

	/**
	 * Método que establece el valor del atributo mSchool
	 * 
	 * @param String
	 *            mSchool
	 */
	@Override
	public void setSchool(String mSchool) {
		this.mSchool = mSchool;
	}

	/**
	 * Método que obtiene el valor del atributo mCycle
	 * 
	 * @return String
	 */
	@Override
	public String getCycle() {
		return mCycle;
	}

	/**
	 * Método que establece el valor del atributo mCycle
	 * 
	 * @param String
	 *            mCycle
	 */
	@Override
	public void setCycle(String mCycle) {
		this.mCycle = mCycle;
	}

	/**
	 * Método que obtiene el valor del atributo mModule
	 * 
	 * @return String
	 */
	@Override
	public String getModule() {
		return mModule;
	}

	/**
	 * Método que establece el valor del atributo mModule
	 * 
	 * @param String
	 *            mModule
	 */
	@Override
	public void setModule(String mModule) {
		this.mModule = mModule;
	}

	/**
	 * Método que obtiene el valor del atributo mType
	 * 
	 * @return String
	 */
	@Override
	public String getType() {
		return mType;
	}

	/**
	 * Método que establece el valor del atributo mType
	 * 
	 * @param String
	 *            mType
	 */
	@Override
	public void setType(String mType) {
		this.mType = mType;
	}

	/**
	 * Método que obtiene el valor del atributo mSubtype
	 * 
	 * @return String
	 */
	@Override
	public String getSubtype() {
		return mSubtype;
	}

	/**
	 * Método que establece el valor del atributo mSubtype
	 * 
	 * @param String
	 *            mSubtype
	 */
	@Override
	public void setSubtype(String mSubtype) {
		this.mSubtype = mSubtype;
	}

	/**
	 * Método que obtiene el valor del atributo mChapter
	 * 
	 * @return String
	 */
	@Override
	public String getChapter() {
		return mChapter;
	}

	/**
	 * Método que establece el valor del atributo mChapter
	 * 
	 * @param String
	 *            mChapter
	 */
	@Override
	public void setChapter(String mChapter) {
		this.mChapter = mChapter;
	}

	/**
	 * Método que obtiene el valor del atributo mHour
	 * 
	 * @return String
	 */
	@Override
	public String getHour() {
		return mHour;
	}

	/**
	 * Método que establece el valor del atributo mHour
	 * 
	 * @param String
	 *            mHour
	 */
	@Override
	public void setHour(String mHour) {
		this.mHour = mHour;
	}

	/**
	 * Método que obtiene el valor del atributo mDescription
	 * 
	 * @return String
	 */
	@Override
	public String getDescription() {
		return mDescription;
	}

	/**
	 * Método que establece el valor del atributo mDescription
	 * 
	 * @param String
	 *            mDescription
	 */
	@Override
	public void setDescription(String mDescription) {
		this.mDescription = mDescription;
	}

	/**
	 * Método que obtiene el valor del atributo mDate
	 * 
	 * @return String
	 */
	@Override
	public String getDate() {
		return mDate;
	}

	/**
	 * Método que establece el valor del atributo mDate
	 * 
	 * @param String
	 *            date
	 */
	@Override
	public void setDate(String date) {
		mDate = date;
	}

}
