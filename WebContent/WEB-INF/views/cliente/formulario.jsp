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
			<div class="row content">
		    <div class="col-sm-2 sidenav hidden-xs">
		      <h2>Pet Shop</h2>
		      <ul class="nav nav-pills nav-stacked">
		        <li class="active"><a href="listaPrincipal">Home</a></li>
		        <li><a href="#"><span class="glyphicon glyphicon-user" style="color:#337ab7"></span style="color:#fff">${usuarioLogado.login}</a></li>
			      <li><a href="loginForm"><span class="glyphicon glyphicon-log-in" style="color:#337ab7"></span style="color:#fff"> Sair</a></li>
		     </ul><br>
		    </div>
			<div class="col-sm-10">
			
				<div class="panel panel-default">
					<div class="panel-heading">
						<form class="needs-validation" novalidate>
  <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="validationTooltip01">Primeiro nome</label>
      <input type="text" class="form-control" id="validationTooltip01" placeholder="Nome" value="Mark" required>
      <div class="valid-tooltip">
        Tudo certo!
      </div>
    </div>
    <div class="col-md-4 mb-3">
      <label for="validationTooltip02">Sobrenome</label>
      <input type="text" class="form-control" id="validationTooltip02" placeholder="Sobrenome" value="Otto" required>
      <div class="valid-tooltip">
        Tudo certo!
      </div>
    </div>
    <div class="col-md-4 mb-3">
      <label for="validationTooltipUsername">Usuário</label>
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text" id="validationTooltipUsernamePrepend">@</span>
        </div>
        <input type="text" class="form-control" id="validationTooltipUsername" placeholder="Usuário" aria-describedby="validationTooltipUsernamePrepend" required>
        <div class="invalid-tooltip">
          Por favor, escolha um usuário válido e único.
        </div>
      </div>
    </div>
  </div>
  <div class="form-row">
    <div class="col-md-6 mb-3">
      <label for="validationTooltip03">Cidade</label>
      <input type="text" class="form-control" id="validationTooltip03" placeholder="Cidade" required>
      <div class="invalid-tooltip">
        Por favor, informe uma cidade válida.
      </div>
    </div>
    <div class="col-md-3 mb-3">
      <label for="validationTooltip04">Estado</label>
      <input type="text" class="form-control" id="validationTooltip04" placeholder="Estado" required>
      <div class="invalid-tooltip">
        Por favor, informe um estado válido.
      </div>
    </div>
    <div class="col-md-3 mb-3">
      <label for="validationTooltip05">CEP</label>
      <input type="text" class="form-control" id="validationTooltip05" placeholder="CEP" required>
      <div class="invalid-tooltip">
        Por favor, informe um CEP válido.
      </div>
    </div>
  </div>
  <button class="btn btn-primary" type="submit">Enviar</button>
</form>
					</div>
				</div>
			</div>	
			</div>
		</div>
	</div>
</body>
</html>