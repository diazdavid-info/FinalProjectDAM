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
					<label class="col-sm-2 control-label" for="start">Fecha inicio</label>
					<div class="col-sm-4">
    					<input name="start" type="datetime" class="form-control" id="start" placeholder="Inicio dd-mm-yyyy" required="required" />
   					</div>
    				<label class="col-sm-2 control-label" for="finish">Fecha de fin</label>
    				<div class="col-sm-4">
    					<input name="finish" type="datetime" class="form-control" id="finish" placeholder="Finalización dd-mm-yyyy" required="required" />
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