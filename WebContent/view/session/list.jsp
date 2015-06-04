<%@page import="david.model.pojo.school.Session"%>
<%@page import="david.model.pojo.school.Module"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<% 
		@SuppressWarnings("unchecked")
		List<Module> listModules = (List<Module>) request.getAttribute("listModules");
	%>
	<div class="panel panel-primary">
		<div class="panel-heading">LISTA DE MÓDULOS</div>
		<div class="panel-body">
			<table id="table-cycles" class="table table-hover">
				<tr>
					<th>Fecha</th>
					<th>Nombre Módulo</th>
					<th>ID Sesión</th>
					<th>Duración</th>
					<th>Descripción</th>
				</tr>
				<% for(Module module : listModules){ %>
					<% for(Session sesion : module.getSession()){ %>
						<tr>
							<td><%= sesion.getDate() %></td>
							<td><%= module.getName() %></td>
							<td><%= sesion.getId() %></td>
							<td><%= sesion.getTime() %></td>
							<td><%= sesion.getDescription() %></td>
						</tr>
					<% } %>
				<% } %>
			</table>
		</div>
	</div>
	
</div>

<jsp:include page="/include/footer.html" />