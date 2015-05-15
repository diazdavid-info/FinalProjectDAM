/**
 * Clase que construye un courseSchool
 * @author David Díaz García
 * @date 10-05-2015
 */
package david.model.pojo.builder;

import david.model.pojo.school.Course;
import david.model.pojo.school.School;

public class CourseSchoolBuilder {
	
	/**
	 * Atributo que almacena el valor del curso
	 */
	private Course mCourse;
	/**
	 * Atributo que almacena el valor del instituto
	 */
	private School mSchool;
	
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
	 * @return CourseSchoolBuilder
	 */
	public CourseSchoolBuilder course(Course mCourse) {
		this.mCourse = mCourse;
		return this;
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
	 * @return CourseSchoolBuilder
	 */
	public CourseSchoolBuilder school(School mSchool) {
		this.mSchool = mSchool;
		return this;
	}
}
