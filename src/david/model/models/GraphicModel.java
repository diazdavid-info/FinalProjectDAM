/**
 * Modelo para todo lo relacionado con un graphic
 * @author David Díaz García
 * @date 31-05-2015
 */
package david.model.models;

import java.util.ArrayList;
import java.util.List;

import david.model.factory.ModelFactory;
import david.model.pojo.builder.ModuleBuilder;
import david.model.pojo.builder.UserBuilder;
import david.model.pojo.graphic.Column;
import david.model.pojo.graphic.Graphic;
import david.model.pojo.school.Module;
import david.model.pojo.school.Session;
import david.model.pojo.users.User;
import david.utils.ToolsArray;

public class GraphicModel implements DGraphicModel {

	private Column mColumnModule;

	private Column mColumnSession;

	public GraphicModel() {
		mColumnModule = new Column("rgba(220,220,220,0.5)", "rgba(220,220,220,0.8)", "rgba(220,220,220,0.75)", "rgba(220,220,220,1)");
		mColumnSession = new Column("rgba(151,187,205,0.5)", "rgba(151,187,205,0.8)", "rgba(151,187,205,0.75)", "rgba(151,187,205,1)");
	}

	/**
	 * Método que solicita una lista de graphic de un teacher
	 * 
	 * @param int teacherId
	 * @return List<Graphic>
	 */
	@Override
	public Graphic listGraphicByTeacher(int teacherId) {
		List<Graphic> listGraphic = new ArrayList<Graphic>();
		List<Integer> listData = new ArrayList<Integer>();
		List<Integer> listDataSession = new ArrayList<Integer>();
		List<Column> listColumn = new ArrayList<Column>();
		List<String> listLabels = new ArrayList<String>();
		Graphic graphic = new Graphic();

		for (Module module : getListModules(teacherId)) {
			listLabels.add(module.getName());
			listData.add(module.getHour());
			listDataSession.add(sumHourSession(module.getSession()));
		}

		graphic.setLabels(ToolsArray.listStringToArrayString(listLabels));
		mColumnModule.setData(ToolsArray.listIntegerToArrayInteger(listData));
		mColumnSession.setData(ToolsArray.listIntegerToArrayInteger(listDataSession));

		listColumn.add(mColumnModule);
		listColumn.add(mColumnSession);

		graphic.setColumns(ToolsArray.listColumnToArrayColumn(listColumn));

		listGraphic.add(graphic);

		return listGraphic.get(0);
	}

	/**
	 * Método que solicita los módulos de un profesor
	 * 
	 * @param int teacherId
	 * @return List<Module>
	 */
	private List<Module> getListModules(int teacherId) {
		DUserModel userModel = ModelFactory.createUserModel();
		User teacher = userModel.findUser(new User(new UserBuilder().setId(teacherId)));

		DModuleModel moduleModel = ModelFactory.createModuleModel();
		List<Module> listModule = moduleModel.findAllModule(new Module(new ModuleBuilder().teacher(teacher)));
		return listModule;
	}

	/**
	 * Método que suma las horas de una lista de sessiones
	 * 
	 * @param List
	 *            <Session> session
	 * @return Integer
	 */
	private Integer sumHourSession(List<Session> session) {
		Integer sum = 0;
		for (Session session2 : session) {
			sum += session2.getTime();
		}
		return sum;
	}
}
