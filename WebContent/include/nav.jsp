<nav class="navbar navbar-inverse">
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<ul class="nav navbar-nav">
        	<li class="active"><a href="<%=request.getContextPath() %>/app">Inicio<span class="sr-only">(current)</span></a></li>
        </ul>
      	
      	<ul class="nav navbar-nav navbar-right">
      		<li class="dropdown">
          		<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Ciclos<span class="caret"></span></a>
          		<ul class="dropdown-menu" role="menu">
            		<li><a href="<%=request.getContextPath() %>/cycle/create">Añadir</a></li>
            		<li class="divider"></li>
            		<li><a href="<%=request.getContextPath() %>/course/list">Listar</a></li>
            	</ul>
        	</li>
      		<li class="dropdown">
          		<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Cursos<span class="caret"></span></a>
          		<ul class="dropdown-menu" role="menu">
            		<li><a href="<%=request.getContextPath() %>/course/create">Añadir</a></li>
            		<li class="divider"></li>
            		<li><a href="<%=request.getContextPath() %>/course/list">Listar</a></li>
            	</ul>
        	</li>
      		<li class="dropdown">
          		<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Institutos<span class="caret"></span></a>
          		<ul class="dropdown-menu" role="menu">
            		<li><a href="<%=request.getContextPath() %>/school/create">Añadir</a></li>
            		<li class="divider"></li>
            		<li><a href="<%=request.getContextPath() %>/school/list">Listar</a></li>
            		<li class="divider"></li>
            		<li><a href="<%=request.getContextPath() %>/school/addCourse">Añadir Curso</a></li>
            	</ul>
        	</li>
        	<li class="dropdown">
          		<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Usuarios<span class="caret"></span></a>
          		<ul class="dropdown-menu" role="menu">
            		<li><a href="<%=request.getContextPath() %>/user/create">Añadir</a></li>
            		<li class="divider"></li>
            		<li><a href="<%=request.getContextPath() %>/user/list">Listar</a></li>
            	</ul>
        	</li>
        </ul>
    </div>
</nav>