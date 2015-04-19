<!DOCTYPE html>
<%@page import="david.utils.Message"%>
<%@page import="java.util.ArrayList"%>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/bootstrap-theme.min.css" />
	<link rel="stylesheet" href="css/style.css" />
	
	<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/function.js"></script>
	
	<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="user" method="post" class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-md-offset-3 col-lg-offset-3 well">
			
			<% for(String message : Message.getMessage()){
				out.print("<div class='alert alert-danger' role='alert'>");
				out.print(message);
				out.print("</div>");
			} %>
			
			<div class="form-group">
				<label for="userName">Nombre de usuario</label>
				<input type="text" class="form-control" id="userName" name="username" placeholder="Introduzca su nombre de usuario">
			</div>
			<div class="form-group">
				<label for="password">Contraseña</label>
				<input type="password" class="form-control" id="password" name="password" placeholder="Introduzca su contraseña">
			</div>
			<button type="submit" class="btn btn-primary">Enviar</button>
		</form>
	</div>
</body>
</html>