/**
 * Clase que refleja el POJO CourseSchool
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.pojo.school;

import david.model.pojo.builder.CourseSchoolBuilder;

public class CourseSchool {

	/**
	 * Atributo que almacena el valor del curso
	 */
	private Course mCourse;
	/**
	 * Atributo que almacena el valor del instituto
	 */
	private School mSchool;
	
	
	/**
	 * Constructor con un parámetro
	 * @param CourseSchoolBuilder courseSchoolBuilder
	 */
	public CourseSchool(CourseSchoolBuilder courseSchoolBuilder){
		mCourse = courseSchoolBuilder.getCourse();
		mSchool = courseSchoolBuilder.getSchool();
	}
	
	/**
	 * Método que obtiene el valor el atributo mCourse
	 * @return Course
	 */
	public Course getCourse() {
		return mCourse;
	}
	
	/**
	 * Método que establece el valor del atributo mCourse
	 * @param Course mCourse
	 */
	public void setCourse(Course mCourse) {
		this.mCourse = mCourse;
	}
	
	/**
	 * Método que obtiene el valor delatributo mSchool
	 * @return School
	 */
	public School getSchool() {
		return mSchool;
	}
	
	/**
	 * Método que establece el valor del atributo mSchool
	 * @param School mSchool
	 */
	public void setSchool(School mSchool) {
		this.mSchool = mSchool;
	}	
}
