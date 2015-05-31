<%@ page import="david.model.pojo.users.User" %>
<%@ page import="david.utils.Message" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="david.model.pojo.school.School" %>
<%@ page import="david.model.pojo.school.Course" %>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach" %>
<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<% 
		@SuppressWarnings("unchecked")
		List<Course> listCourses = (List<Course>) request.getAttribute("listCourses");
		@SuppressWarnings("unchecked")
		List<User> listPupils = (List<User>) request.getAttribute("listPupils");
	%>
	<div class="panel panel-primary">
		<div class="panel-heading">AÑADE UN CURSO A LOS INSTITUTOS</div>
		<div class="panel-body">
			<form class="form-horizontal" action="" method="get">
				<div class="form-group well">
					<div class="col-sm-3">
						<div class="col-sm-12">
							<select id="course" name="course" class="form-control" onchange="getSchool(value)">
								<option disabled="disabled" selected="selected">Selecione un Curso ...</option>
								<% for(Course course : listCourses){ %>
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
					<label class="col-sm-2 col-sm-offset-2 control-label" for="schools">Alumnos</label>
					<div class="col-sm-4">
						<select multiple="multiple" name="pupils" class="form-control">
							<% for(User user : listPupils){ %>
								<option value="<%= user.getId() %>"><%= user.getUsername() %></option>
							<% } %>
						</select>
   					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-4 col-sm-offset-4">
						<input class="btn btn-primary col-sm-12" type="submit" value="Enviar">
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<jsp:include page="/include/footer.html" />