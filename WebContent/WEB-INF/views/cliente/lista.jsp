<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
									<div style="padding:20px;">
											<form action="alterarCliente" method="post">
												<div class="form-group">
													<label for="Login">Id: </label>  
													<input type="text" class="form-control"  name="id" value="${clientee.id}" >
													<form:errors path="clientee.nascimento" cssStyle="color:#B71C1C"/><br />
												</div>
												<div class="form-group">
													<label for="Login">Nome: </label>  
													<input type="text" class="form-control"  name="nome" value="${clientee.nome}" >
													<form:errors path="clientee.nascimento" cssStyle="color:#B71C1C"/><br />
												</div>
												<div class="form-group">
													<label for="Login">Nascimento</label>  
													<input type="text" class="form-control"  name="nascimento" value="${clientee.nascimento}" >
													<form:errors path="clientee.nascimento" cssStyle="color:#B71C1C"/><br />
												</div>
												<div class="form-group">
													<label for="Senha">Nacionalidade</label>  
													<input type="text"  class="form-control" name="nacionalidade" value="${clientee.nacionalidade}">
													<form:errors path="clientee.nacionalidade" cssStyle="color:#B71C1C"/><br />							
												</div>
												<div class="form-group">
													<label for="uf">UF</label>  
													<input type="text"  class="form-control" name="uf" value="${clientee.uf}">
													<form:errors path="clientee.uf" cssStyle="color:#B71C1C"/><br />							
												</div>
												<div class="form-group">
													<label for="sexo">sexo</label>  
													<input type="text"  class="form-control" name="sexo" value="${clientee.sexo}">
													<form:errors path="clientee.sexo" cssStyle="color:#B71C1C"/><br />							
												</div>
												<div class="form-group">
													<label for="Altura">Email</label>  
													<input type="text"  class="form-control" name="email" value="${clientee.email}" >
													<form:errors path="clientee.email" cssStyle="color:#B71C1C"/><br />
												</div>
											<input type="submit" class="btn btn-primary" value="Alterar">
											<a href="removerCliente?id=${clientee.id}" class="btn btn-primary" > Exlcuir</a>
											</form>
										</div>
											
</body>
</html>