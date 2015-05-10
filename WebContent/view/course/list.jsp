<%@ page import="java.util.List"%>
<%@ page import="david.model.pojo.school.Course"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<% 
		@SuppressWarnings("unchecked")
		List<Course> listCourse = (List<Course>) request.getAttribute("listCourse"); 
	%>
	<div class="panel panel-primary">
		<div class="panel-heading">LISTA DE CURSOS</div>
		<div class="panel-body">
			<table class="table table-hover">
				<tr>
					<th>ID Curso</th>
					<th>Año de inicio</th>
					<th>Año de finalización</th>
				</tr>
				<% for(Course course : listCourse){ %>
					<tr>
						<td><%= course.getId() %></td>
						<td><%= course.getStartYear() %></td>
						<td><%= course.getFinishYear() %></td>
					</tr>
				<% } %>
			</table>
		</div>
	</div>
	
</div>

<jsp:include page="/include/footer.html" />