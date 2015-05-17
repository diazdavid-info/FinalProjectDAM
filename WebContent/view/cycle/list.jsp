<%@page import="david.model.pojo.school.Cycle"%>
<%@ page import="java.util.List"%>
<%@ page import="david.model.pojo.school.Cycle"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<% 
		@SuppressWarnings("unchecked")
		List<Cycle> listCycles = (List<Cycle>) request.getAttribute("listCycles"); 
	%>
	<div class="panel panel-primary">
		<div class="panel-heading">LISTA DE CURSOS</div>
		<div class="panel-body">
			<table class="table table-hover">
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