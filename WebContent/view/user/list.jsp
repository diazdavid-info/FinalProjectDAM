<%@page import="java.util.List"%>
<%@page import="david.model.pojo.users.User"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<% 
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) request.getAttribute("listUser"); 
	%>
	<div class="panel panel-primary">
		<div class="panel-heading">LISTA DE USUARIOS</div>
		<div class="panel-body">
			<table class="table table-hover">
				<tr>
					<th>ID Usuario</th>
					<th>User Name</th>
					<th>Nombre</th>
					<th>Primer Apellido</th>
					<th>Segundo Apellido</th>
					<th>NIF</th>
				</tr>
				<% for(User user : listUser){ %>
					<tr>
						<td><%= user.getId() %></td>
						<td><%= user.getUsername() %></td>
						<td><%= user.getPerson().getName() %></td>
						<td><%= user.getPerson().getSurname1() %></td>
						<td><%= user.getPerson().getSurname2() %></td>
						<td><%= user.getPerson().getNif() %></td>
					</tr>
				<% } %>
			</table>
		</div>
	</div>
	
</div>

<jsp:include page="/include/footer.html" />