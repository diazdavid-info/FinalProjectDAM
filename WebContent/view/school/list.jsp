<%@ page import="java.util.List"%>
<%@ page import="david.model.pojo.school.School"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<% 
		@SuppressWarnings("unchecked")
		List<School> listSchool = (List<School>) request.getAttribute("listSchool"); 
	%>
	<div class="panel panel-primary">
		<div class="panel-heading">LISTA DE INSTITUTOS</div>
		<div class="panel-body">
			<table class="table table-hover">
				<tr>
					<th>ID Instituto</th>
					<th>Nombre</th>
					<th>Código de identificación</th>
				</tr>
				<% for(School school : listSchool){ %>
					<tr>
						<td><%= school.getId() %></td>
						<td><%= school.getName() %></td>
						<td><%= school.getCodeIdentification() %></td>
					</tr>
				<% } %>
			</table>
		</div>
	</div>
	
</div>

<jsp:include page="/include/footer.html" />