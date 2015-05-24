<%@page import="david.utils.Message"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="david.model.pojo.school.Course"%>

<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<% 
		@SuppressWarnings("unchecked")
		List<Course> listCourse = (List<Course>) request.getAttribute("listCourses");
	%>
	<div class="panel panel-primary">
		<div class="panel-heading">CREACIÓN DE TEMAS</div>
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
							<select id="module" name="module" class="form-control">
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
					<label class="col-sm-2 control-label" for="hour">Horas del tema</label>
					<div class="col-sm-4">
    					<input name="hour" type="text" class="form-control" id="hour" placeholder="Horas" />
   					</div>
    				<label class="col-sm-2 control-label" for="name">Nombre del tema</label>
    				<div class="col-sm-4">
    					<input name="name" type="text" class="form-control" id="name" placeholder="Nombre" />
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