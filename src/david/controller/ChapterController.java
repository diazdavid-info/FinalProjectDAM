/**
 * Controlador para las acciones de chapter
 * @author David Diaz
 * @date 24-05-2015
 */
package david.controller;

import java.util.List;

import david.model.factory.ModelFactory;
import david.model.models.DChapterModel;
import david.model.models.DCourseModel;
import david.model.pojo.school.Course;

public class ChapterController extends Controller{
	
	/**
	 * Atributo que almacena el model de cursos
	 */
	private DCourseModel mCourseModel;
	/**
	 * Atributo que almacena el mode de temarios
	 */
	private DChapterModel mChapterModel;
	
	/**
	 * Constructor
	 */
	public ChapterController() {
		mCourseModel = ModelFactory.createCourseModel();
		mChapterModel = ModelFactory.createChapterModel();
	}
	
	/**
	 * Método que crea un tipo
	 */
	public void createAction() {
		if(isLogin() && isRequest()){
			mChapterModel.createChapter(getRequestParameter());
		}
		
		if(isLogin()){
			List<Course> listCourses = mCourseModel.listCourse();
			
			mServletRequest.setAttribute("listCourses", listCourses);
			render("chapter/create");
		}
		
		
	}

}
