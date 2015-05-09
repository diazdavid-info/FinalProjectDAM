<%@page import="david.utils.Message"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<div class="panel panel-primary">
		<div class="panel-heading">CREACIÓN DE INSTITUTOS</div>
		<div class="panel-body">
			<form class="form-horizontal" action="" method="get">
			
				<% for(String message : Message.getMessage()){
					out.print("<div class='alert alert-danger' role='alert'>");
					out.print(message);
					out.print("</div>");
				} %>
				
				<div class="form-group">
					<label class="col-sm-2 control-label" for="name">Nombre del Instituto</label>
					<div class="col-sm-4">
    					<input name="name" type="text" class="form-control" id="name" placeholder="Instituto" />
   					</div>
    				<label class="col-sm-2 control-label" for="code">Código Instituto</label>
    				<div class="col-sm-4">
    					<input name="code" type="text" class="form-control" id="code" placeholder="Código" />
   					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label" for="province">Provincia</label>
    				<div class="col-sm-4">
    					<input name="province" type="text" class="form-control" id="province" placeholder="Provincia" />
   					</div>
   					<label class="col-sm-2 control-label" for="population">Población</label>
					<div class="col-sm-4">
    					<input name="population" type="text" class="form-control" id="population" placeholder="Población" />
   					</div>
				</div>
				<div class="form-group">
					
    				<label class="col-sm-2 control-label" for="description">Descripción</label>
    				<div class="col-sm-4">
    					<input name="description" type="text" class="form-control" id="description" placeholder="Descripción" />
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