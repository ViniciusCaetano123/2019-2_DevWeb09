<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sistema Cadastro</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body style="background:#f2f2f2;">
	<div class="container">	
		<div class="row">
		 <div class="col-md-4 col-md-offset-4" style="margin-top:7% ">
			<div class="panel panel-primary">
		      <div class="panel-heading">	
			      <p align="center">	     
			      		<img align="center" src="https://d1icd6shlvmxi6.cloudfront.net/gsc/B6VLSH/19/de/25/19de2588b79e4845bcd63a87f7c7ae2e/images/login/u2.jpg?token=cfc9a126b7da73d168441bd9151c4cb8263aad9d3880cee8220c0c9b6bb00c09" style="width: 156px;
				    height: 133px;">
				  </p>
				</div>
		      <div class="panel-body">
			      <form action="adicionaUsuario" method="post" >
				     <fieldset>
				     	<div class="form-group">
	                  		<input class="form-control" placeholder="Nome" name="nome" type="text" autofocus>
	                    </div>
						<div class="form-group">
	                  		<input class="form-control" placeholder="Login" name="login" type="text" autofocus>
	                    </div>
	                    <div class="form-group">
	                  		<input class="form-control" placeholder="E-mail" name="email" type="text" autofocus>
	                    </div>
						<div class="form-group">
	                    	<input class="form-control" placeholder="Senha" name="senha" type="password" value="">
	                    </div>
							<input type="submit" value="Login" class="btn btn-lg btn-primary btn-block">
						<div class="text-center">
						<input type="submit" value="Login" class="btn btn-lg btn-primary btn-block">
								<br />
									<a href="loginForm" >Voltar</a>
								</div>
						</fieldset>
					</form>
				</div>
		    </div>
		    </div>
	    </div>
    </div>
</body>
</html>