<%@ page import="java.util.List"%>
<%@page import="david.model.pojo.school.Cycle"%>
<%@ page import="david.model.pojo.school.Course"%>
<%@ page import="david.model.pojo.users.User"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<% 
		@SuppressWarnings("unchecked")
		List<Cycle> listCycles = (List<Cycle>) request.getAttribute("listCycles");
		@SuppressWarnings("unchecked")
		List<Course> listCourse = (List<Course>) request.getAttribute("listCourses");
		@SuppressWarnings("unchecked")
		List<User> listTutors = (List<User>) request.getAttribute("listTutors");
	%>
	<div class="panel panel-primary">
		<div class="panel-heading">LISTA DE CURSOS</div>
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
								<% for(User users : listTutors){ %>
									<option value="<%= users.getId() %>"><%= users.getUsername() %></option>
								<% } %>
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
					<th>ID Ciclo</th>
					<th>Nombre</th>
					<th>Año</th>
					<th>Instituto</th>
					<th>Tutor</th>
				</tr>
				<% for(Cycle cycle : listCycles){ %>
					<tr>
						<td><%= cycle.getId() %></td>
						<td><%= cycle.getName() %></td>
						<td><%= cycle.getCourse().getStartYear() %> / <%= cycle.getCourse().getFinishYear() %></td>
						<td><%= cycle.getSchool().getName() %></td>
						<td><%= cycle.getTutor().getUsername() %></td>
					</tr>
				<% } %>
			</table>
		</div>
	</div>
	
</div>

<jsp:include page="/include/footer.html" />