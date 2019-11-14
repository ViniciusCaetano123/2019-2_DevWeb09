<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sistema Cadastro</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
.navbar-inverse .navbar-nav>li>a {
    color: #fff;
}
.navbar-inverse .navbar-brand {
    color: #fff;
}
</style>
</head>
<body>
	
	<div class="container-fluid">
		<div class="row">
			<div class="col-2">
			    <div class="col-sm-2 sidenav hidden-xs">
			      <h2>Pet Shop</h2>
			      <ul class="nav nav-pills nav-stacked">
			        <li class="active"><a href="listaPrincipal">Home</a></li>
			        <li><a href="#"><span class="glyphicon glyphicon-user" style="color:#337ab7"></span style="color:#fff">${usuarioLogado.login}</a></li>
				      <li><a href="loginForm"><span class="glyphicon glyphicon-log-in" style="color:#337ab7"></span style="color:#fff"> Sair</a></li>
			     </ul>
			    </div>
		    </div>
		  
		    <div class="col-10">					
					<div class="col-sm-10">		
					<div style="padding:20px;">
											<h2>Clientes</h2>
											<br> 
											<form action="adicionarCliente" method="post">											
												<div class="form-group">
													<label for="Nome">Nome</label>  
													<input type="text" class="form-control"  name="nome" value="${cliente.nome}"  >
												</div>
												<div class="form-group">
													<label for="Login">Nascimento</label>  
													<input type="text" class="form-control"  name="nascimento"  value="${cliente.nascimento}"  >
												</div>
												<div class="form-group">
													<label for="Senha">Nacionalidade</label>  
													<input type="text"  class="form-control" name="nacionalidade"  value="${cliente.nacionalidade}"  >
												</div>
												<div class="form-group">
													<label for="uf">UF</label>  
													<input type="text"  class="form-control" name="uf"  value="${cliente.uf}"  >
																			
												</div>
												<div class="form-group">
													<label for="sexo">sexo</label>  
													<input type="text"  class="form-control" name="sexo"  value="${cliente.sexo}" >
												</div>
												<div class="form-group">
													<label for="Altura">Email</label>  
													<input type="text"  class="form-control" name="email"  value="${cliente.email}"  >
												</div>
											<input type="submit" class="btn btn-primary" value="Adicionar">
											</form>
										</div>
				
					</div>
				</div>
			</div>
		
	
</body>
</html>