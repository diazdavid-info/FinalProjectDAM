<%@page import="david.model.pojo.school.SubType"%>
<%@page import="david.model.pojo.school.Type"%>
<%@page import="david.model.pojo.school.Course"%>
<%@page import="david.utils.Message"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach" %>
<%@page import="java.util.List"%>

<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<% 
		@SuppressWarnings("unchecked")
		List<Course> listCourse = (List<Course>) request.getAttribute("listCourses");
		@SuppressWarnings("unchecked")
		List<Type> listType = (List<Type>) request.getAttribute("listType");
		@SuppressWarnings("unchecked")
		List<SubType> listSubtype = (List<SubType>) request.getAttribute("listSubtype");
		//?course=1&schools=2&cycle=1&module=1&type=1&subtype=1&chapter=3&time=2
	%>
	<div class="panel panel-primary">
		<div class="panel-heading">CREACIÓN DE SESSIONES</div>
		<div class="panel-body">
			<form class="form-horizontal">
				<div class="form-group well">
					<div class="col-sm-3">
						<div class="col-sm-12">
							<select id="course" name="course" class="form-control" onchange="getSchool(value)">
								<option disabled="disabled" selected="selected">Selecione un Curso ...</option>
								<% for(Course course : listCourse){ %>
									<option value="<%= course.getId() %>"><%= course.getStartYear() %> / <%= course.getFinishYear() %></option>
								<% } %>
							</select>
	   					</div>
   					</div>
   					<div class="col-sm-3">
	   					<div class="col-sm-12">
							<select id="schools" name="schools" class="form-control" onchange="getCyclesByModule()">
								<option disabled="disabled" selected="selected">Selecione un Instituto ...</option>
							</select>
	   					</div>
   					</div>
   					<div class="col-sm-3">
						<div class="col-sm-12">
							<select id="cycle" name="cycle" class="form-control" onchange="getModuleByCourseSchoolCycle()">
								<option disabled="disabled" selected="selected">Selecione un Ciclo ...</option>
							</select>
	   					</div>
   					</div>
   					<div class="col-sm-3">
						<div class="col-sm-12">
							<select id="module" name="module" class="form-control" onchange="getChapterByModule(value)">
								<option disabled="disabled" selected="selected">Selecione un Módulo ...</option>
							</select>
	   					</div>
   					</div>
   				</div>
				<% for(String message : Message.getMessage()){
					out.print("<div class='alert alert-danger' role='alert'>");
					out.print(message);
					out.print("</div>");
				} %>
				<div class="form-group">
					<div class="col-sm-6">
						<div class="col-sm-12">
							<select id="type" name="type" class="form-control">
								<option disabled="disabled" selected="selected">Selecione un Tipo ...</option>
								<% for(Type type : listType){ %>
									<option value="<%= type.getId() %>"><%= type.getName() %></option>
								<% } %>
							</select>
	   					</div>
					</div>
					<div class="col-sm-6">
						<div class="col-sm-12">
							<select id="subtype" name="subtype" class="form-control">
								<option disabled="disabled" selected="selected">Selecione un SubTipo ...</option>
								<% for(SubType subtype : listSubtype){ %>
									<option value="<%= subtype.getId() %>"><%= subtype.getName() %></option>
								<% } %>
							</select>
	   					</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-6">
						<div class="col-sm-12">
							<select id="chapter" name="chapter" class="form-control">
								<option disabled="disabled" selected="selected">Selecione un Tema ...</option>
							</select>
	   					</div>
					</div>
					<div class="col-sm-6">
						<div class="col-sm-12">
							<select id="hour" name="hour" class="form-control">
								<option disabled="disabled" selected="selected">Selecione el tiempo ...</option>
								<option value="0,30">0,30 Horas</option>
								<option value="1">1 Hora</option>
								<option value="1,30">1,30 Horas</option>
								<option value="2">2 Horas</option>
								<option value="2,30">2,30 horas</option>
								<option value="3">3 Horas</option>
							</select>
	   					</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<div class="col-sm-12">
							<textarea name="description" class="form-control" rows="3" placeholder="Descripción de la sessión"></textarea>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-4">
						<div class="col-sm-12">
							<input class="btn btn-primary col-sm-12" type="submit" value="Enviar">
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<jsp:include page="/include/footer.html" />