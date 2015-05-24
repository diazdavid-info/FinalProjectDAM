<%@page import="david.utils.Message"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>

<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<div class="panel panel-primary">
		<div class="panel-heading">CREACIÓN DE SUBTIPO DE SESIÓN</div>
		<div class="panel-body">
			<form class="form-horizontal" action="" method="get">
				<% for(String message : Message.getMessage()){
					out.print("<div class='alert alert-danger' role='alert'>");
					out.print(message);
					out.print("</div>");
				} %>
				
				<div class="form-group">
					<label class="col-sm-2 control-label" for="name">Nombre del subtipo</label>
					<div class="col-sm-4">
    					<input name="name" type="text" class="form-control" id="name" placeholder="Nombre" />
   					</div>
    				<label class="col-sm-2 control-label" for="description">Descripción</label>
    				<div class="col-sm-4">
    					<input name="description" type="text" class="form-control" id="description" placeholder="Descripción" />
   					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-4">
						<div class="col-sm-12">
							<input class="btn btn-primary col-sm-12" type="submit" value="Enviar">
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<jsp:include page="/include/footer.html" />