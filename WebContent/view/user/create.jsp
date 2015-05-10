<%@page import="david.utils.Message"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="/include/head.jsp" />

<jsp:include page="/include/nav.jsp" />

<div class="container">
	<div class="panel panel-primary">
		<div class="panel-heading">CREACIÓN DE USUARIOS</div>
		<div class="panel-body">
			<form class="form-horizontal" action="" method="get">
			
				<% for(String message : Message.getMessage()){
					out.print("<div class='alert alert-danger' role='alert'>");
					out.print(message);
					out.print("</div>");
				} %>
				
				<div class="form-group">
					<label class="col-sm-2 control-label" for="username">Nombre de usuario</label>
					<div class="col-sm-4">
    					<input name="username" type="text" class="form-control" id="username" placeholder="Usuario" />
   					</div>
    				<label class="col-sm-2 control-label" for="password">Password</label>
    				<div class="col-sm-4">
    					<input name="password" type="password" class="form-control" id="password" placeholder="Password" />
   					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label" for="name">Nombre</label>
					<div class="col-sm-4">
    					<input name="name" type="text" class="form-control" id="name" placeholder="Nombre" />
   					</div>
    				<label class="col-sm-2 control-label" for="nif">NIF</label>
    				<div class="col-sm-4">
    					<input name="nif" type="text" class="form-control" id="nif" placeholder="NIF" />
   					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label" for="surname1">Primer apellido</label>
					<div class="col-sm-4">
    					<input name="surname1" type="text" class="form-control" id="surname1" placeholder="Apellido" />
   					</div>
    				<label class="col-sm-2 control-label" for="surname2">Segundo apellido</label>
    				<div class="col-sm-4">
    					<input name="surname2" type="text" class="form-control" id="surname2" placeholder="Apellido" />
   					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label" for="email">Email</label>
					<div class="col-sm-4">
    					<input name="email" type="email" class="form-control" id="email" placeholder="Email" />
   					</div>
    				<label class="col-sm-2 control-label" for="province">Provincia</label>
    				<div class="col-sm-4">
    					<input name="province" type="text" class="form-control" id="province" placeholder="Provincia" />
   					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label" for="population">Población</label>
					<div class="col-sm-4">
    					<input name="population" type="text" class="form-control" id="population" placeholder="Población" />
   					</div>
    				<label class="col-sm-2 control-label" for="description">Descripción</label>
    				<div class="col-sm-4">
    					<input name="description" type="text" class="form-control" id="description" placeholder="Descripción" />
   					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label" for="role">Role</label>
					<div class="col-sm-4">
						<select name="role" class="form-control">
							<option value="1">Alumno</option>
							<option value="2">Profesor</option>
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