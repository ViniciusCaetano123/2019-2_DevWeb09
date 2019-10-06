<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sistema Cadastro</title>
</head>
<body>
	<c:import url="/WEB-INF/views/principal/menu.jsp"/>
	<br />
	Alterar usuario: ${usuario.id}	
	<br />
	<br />
	
	<form action="alteraUsuario" method="post" class="form-horizontal">
	
	<input type="hidden" name="id" value="${usuario.id}" />
				
	<label for="Nome">Nome</label>  
	<input type="text" name="nome" value="${usuario.nome}" > 
	<form:errors path="usuario.nome" cssStyle="color:#B71C1C"/><br />

	<label for="Login">Login</label>  
	<input type="text" name="login" value="${usuario.login}" >
	<form:errors path="usuario.login" cssStyle="color:#B71C1C"/><br />

	<label for="Senha">Senha</label>  	
	<input type="password" name="senha" value="${usuario.senha}">
	<form:errors path="usuario.senha" cssStyle="color:#B71C1C"/><br />
	
	<label for="DataNascimento">Data Nascimento</label>  
	<input type="text" name="dataNascimento" value ="<fmt:formatDate value="${usuario.dataNascimento.time}" pattern="dd/MM/yyyy" />" > 
	<form:errors path="usuario.dataNascimento" cssStyle="color:#B71C1C"/><br />
	
	<label for="Altura">Altura</label>  
	<input type="text" name="altura" value="${usuario.altura}" >
	<form:errors path="usuario.altura" cssStyle="color:#B71C1C"/><br />
	
	<input type="submit" value="Alterar">
	
	</form>
	
</body>
</html>