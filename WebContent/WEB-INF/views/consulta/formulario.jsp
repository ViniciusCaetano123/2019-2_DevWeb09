Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@ViniciusCaetano123 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


4
31ViniciusCaetano123/2019-2_DevWeb09
 Code Issues 0 Pull requests 0 Actions Projects 0 Wiki Security Insights Settings
2019-2_DevWeb09/WebContent/WEB-INF/views/animal/formulario.jsp
 Leandro commitUpdate
ba1921c 19 hours ago
81 lines (74 sloc)  3.07 KB
  
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
					
											<h2>Consulta</h2>
											<br> 
											
											<form action="adicionarConsulta" method="post">	
												<div class="form-group">
													<label for="cli">Selecione um Cliente :</label>
													<select class="form-control" id="cli" name="idDono">
													 <option value="Selecione">...</option>
														 <c:forEach items="${clientes}" var="cliente">
														 	<option value="${cliente.id}" >${cliente.nome}</option>
														 </c:forEach>
													</select>
												</div>	
                                                <div class="form-group">
													<label for="cli">Selecione um Funcionario :</label>
													<select class="form-control" id="cli" name="idDono">
													 <option value="Selecione">...</option>
														 <c:forEach items="${clientes}" var="cliente">
														 	<option value="${cliente.id}" >${cliente.nome}</option>
														 </c:forEach>
													</select>
												</div>	
												<div class="form-group">
													<label for="Nome">Descrição</label>  
													<input type="text" class="form-control"  name="servico"   >
												</div>
												<div class="form-group">
													<label for="Login">Data</label>  
													<input type="text" class="form-control"  name="porte"   >
												</div>
												</div>
											<input type="submit" class="btn btn-primary" value="Adicionar">
											</form>
										</div>
				
					</div>
				</div>
			</div>
		
	
</body>
</html>
© 2019 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
