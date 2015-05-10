<%@page import="david.utils.Message"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="david.model.pojo.school.School"%>
<%@ page import="david.model.pojo.school.Course"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<% 
		@SuppressWarnings("unchecked")
		List<School> listSchool = (List<School>) request.getAttribute("listSchool");
		@SuppressWarnings("unchecked")
		List<Course> listCourse = (List<Course>) request.getAttribute("listCourse");
	%>
	<div class="panel panel-primary">
		<div class="panel-heading">AÑADE UN CURSO A LOS INSTITUTOS</div>
		<div class="panel-body">
			<form class="form-horizontal" action="" method="get">
			
				<% for(String message : Message.getMessage()){
					out.print("<div class='alert alert-danger' role='alert'>");
					out.print(message);
					out.print("</div>");
				} %>
				
				<div class="form-group">
					<label class="col-sm-2 control-label" for="course">Cursos</label>
					<div class="col-sm-4">
						<select name="course" class="form-control">
							<% for(Course course : listCourse){ %>
								<option value="<%= course.getId() %>"><%= course.getStartYear() %> / <%= course.getFinishYear() %></option>
							<% } %>
						</select>
   					</div>
   					<label class="col-sm-2 control-label" for="schools">Institutos</label>
					<div class="col-sm-4">
						<select multiple="multiple" name="schools" class="form-control">
							<% for(School school : listSchool){ %>
								<option value="<%= school.getId() %>"><%= school.getName() %></option>
							<% } %>
						</select>
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