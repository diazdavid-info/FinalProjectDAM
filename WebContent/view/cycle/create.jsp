<%@page import="david.utils.Message"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="david.model.pojo.school.School"%>
<%@ page import="david.model.pojo.school.Course"%>
<%@ page import="david.model.pojo.users.User"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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
		<div class="panel-heading">CREACIÓN DE CICLOS</div>
		<div class="panel-body">
			<form class="form-horizontal" action="" method="get">
			
				<% for(String message : Message.getMessage()){
					out.print("<div class='alert alert-danger' role='alert'>");
					out.print(message);
					out.print("</div>");
				} %>
				<div class="form-group well">
					<div class="col-sm-4">
						<label class="col-sm-4" for="course">Cursos</label>
						<div class="col-sm-12">
							<select name="course" class="form-control" onchange="getSchool(value)">
								<option disabled="disabled" selected="selected">Selecione un Curso ...</option>
								<% for(Course course : listCourse){ %>
									<option value="<%= course.getId() %>"><%= course.getStartYear() %> / <%= course.getFinishYear() %></option>
								<% } %>
							</select>
	   					</div>
   					</div>
   					<div class="col-sm-4">
	   					<label class="col-sm-4" for="schools">Institutos</label>
						<div class="col-sm-12">
							<select id="schools" name="schools" class="form-control">
								<option disabled="disabled" selected="selected">Selecione un Instituto ...</option>
							</select>
	   					</div>
   					</div>
   					<div class="col-sm-4">
						<label class="col-sm-4" for="course">Tutor</label>
						<div class="col-sm-12">
							<select id="tutor" name="tutor" class="form-control">
								<option disabled="disabled" selected="selected">Selecione un Tutor ...</option>
								<% for(User users : listTutors){ %>
									<option value="<%= users.getId() %>"><%= users.getUsername() %></option>
								<% } %>
							</select>
	   					</div>
   					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label" for="name">Nombre del Ciclo</label>
					<div class="col-sm-4">
    					<input name="name" type="text" class="form-control" id="name" placeholder="Ciclo" />
   					</div>
    				<label class="col-sm-2 control-label" for="code">Código Interno</label>
    				<div class="col-sm-4">
    					<input name="code" type="text" class="form-control" id="code" placeholder="Código" />
   					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-4 col-sm-offset-2">
						<input class="btn btn-primary col-sm-12" type="submit" value="Enviar">
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<jsp:include page="/include/footer.html" />