<%@page import="david.model.pojo.school.School"%>
<%@page import="david.model.pojo.school.Module"%>
<%@page import="david.model.pojo.school.Cycle" %>
<%@page import="david.model.pojo.school.Course" %>
<%@page import="david.model.pojo.users.User"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<% 
		@SuppressWarnings("unchecked")
		List<Course> listCourse = (List<Course>) request.getAttribute("listCourses");
		@SuppressWarnings("unchecked")
		List<User> listTutors = (List<User>) request.getAttribute("listTutors");
	%>
	<div class="panel panel-primary">
		<div class="panel-heading">LISTA DE MÓDULOS</div>
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
							<select id="schools" name="schools" class="form-control">
								<option disabled="disabled" selected="selected">Selecione un Instituto ...</option>
							</select>
	   					</div>
   					</div>
   					<div class="col-sm-3">
						<div class="col-sm-12">
							<select id="tutor" name="tutor" class="form-control">
								<option disabled="disabled" selected="selected">Selecione un Tutor ...</option>
								
							</select>
	   					</div>
   					</div>
   					<div class="col-sm-3">
   						<button class="btn btn-primary col-sm-12" type="button" onclick="getCycles()">Filtrar</button>
   					</div>
				</div>
			</form>
			<table id="table-cycles" class="table table-hover">
				<tr>
					<th>Nombre</th>
					<th>Cíclo</th>
					<th>Instituto</th>
					<th>Profesor</th>
					<th>Año</th>
				</tr>
				<% for(Course course : listCourse){ %>
					<% for(School school : course.getSchool()){ %>
						<% for(Cycle cycle : school.getCycle()){ %>
							<% for(Module module : cycle.getModule()){ %>
								<tr>
									<td><%= module.getName() %></td>
									<td><%= cycle.getName() %></td>
									<td><%= school.getName() %></td>
									<td><%= module.getTeacher().getUsername() %></td>
									<td><%= course.getStartYear() %>/<%= course.getFinishYear() %></td>
								</tr>
							<% } %>
						<% } %>
					<% } %>
				<% } %>
			</table>
		</div>
	</div>
	
</div>

<jsp:include page="/include/footer.html" />