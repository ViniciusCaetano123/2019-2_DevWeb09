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
/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height:600px;}
    
    /* Set gray background color and 100% height */
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
    }
        
    /* On small screens, set height to 'auto' for the grid */
    @media screen and (max-width: 767px) {
      .row.content {height: auto;} 
    }
    

</style>
</head>
<body>

       
	
	<div class="container-fluid">
		<div class="row">
			<div class="row content">
		    <div class="col-sm-2 sidenav hidden-xs" >
		      <h2>Pet Shop</h2>
		      <ul class="nav nav-pills nav-stacked">
		        <li class="active"><a href="#section1">Home</a></li>		         
		        <li><a href="#"><span class="glyphicon glyphicon-user" style="color:#337ab7"></span style="color:#fff">${usuarioLogado.login}</a></li>
			      <li><a href="loginForm"><span class="glyphicon glyphicon-log-in" style="color:#337ab7"></span style="color:#fff"> Sair</a></li>
		     </ul><br>
		    </div>
			<div class="col-sm-10">
			<br>
				<div class="row">
				
					<div class="col-sm-4">
			          <div class="well">
			          	<p> Total de Cliente : ${totalClientes}</p>
			          </div>
			        </div>
			        <div class="col-sm-4">
			          <div class="well">
			            <p> Total de Funcionarios : ${totalFuncionarios}</p>
			          </div>
			        </div>
			        <div class="col-sm-4">
			          <div class="well">
			            <p> Total de Consultas : ${totalConsultas}</p>
			          </div>
			        </div>
			        <p> </p>
			        <br>
		        </div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4>Clientes</h4>
				</div>
				<div class="panel-body">
				
					<a href="formularioCli"><button type="button" class="btn btn-primary btn-sm">Criar Cliente</button></a>
		<br /><br />
					<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
				    	<thead>
				        	<tr>
								<!--  <th>Id</th>  -->	
								<th>Id</th>	
								<th>Nome</th>	
								<th>Data de Nascimento</th>	
								<th>Nacionalidade</th>		
								<th> UF</th>	
								<th> Sexo</th>
								<th> E-mail</th>						
								<th> </th>	
				                </tr>
				        </thead>
				        <tbody>
					        <c:forEach items="${clientes}" var="cliente">
								<tr>
									<td>${cliente.id}</td>
									<td>${cliente.nome}</td>
									<td>${cliente.nascimento}</td>
									<td>${cliente.nacionalidade}</td>
									<td>${cliente.uf}</td>
									<td>${cliente.sexo}</td>
									<td>${cliente.email}</td>
									<td><a type="button"  href="mostraCliente?id=${cliente.id}">Ver Mais</a></td>
									
								</tr>
							</c:forEach>
				        </tbody>
				    </table>
				</div>
			</div>			
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4>Funcionarios</h4>
				</div>
				<div class="panel-body">
					<a href="formularioFunc"><button type="button" class="btn btn-primary btn-sm">Criar Funcionario</button></a>
		<br /><br />
						
					<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
				    	<thead>
				        	<tr>
								<!--  <th>Id</th>  -->	
								<th>Id</th>	
								<th>Nome</th>	
								<th>Data de Nascimento</th>	
								<th> Nacionalidade</th>		
								<th> UF</th>	
								<th> Sexo</th>						
								<th></th>	
				                </tr>
				        </thead>
				        <tbody>
					        <c:forEach items="${funcionarios}" var="funcionario">
								<tr>
									<td>${funcionario.id}</td>
									<td>${funcionario.nome}</td>
									<td>${funcionario.nascimento}</td>
									<td>${funcionario.nacionalidade}</td>
									<td>${funcionario.uf}</td>
									<td>${funcionario.sexo}</td>
									<td><a type="button"   href="mostraFuncionario?id=${funcionario.id}"">Ver Mais</a></td>
								</tr>
							</c:forEach>
				        </tbody>
				    </table>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4>Animais</h4>
				</div>
				<div class="panel-body">
				<a href="formularioAnimal"><button type="button" class="btn btn-primary btn-sm">Criar Animal</button></a>
		<br /><br />
					
					<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
				    	<thead>
				        	<tr>
								<!--  <th>Id</th>  -->	
								<th> Nome</th>
								<th>Animal</th>	
								<th>Porte</th>		
								<th> RaÃ§a</th>	
								<th> Sexo</th>	
								<th> </th>	
				                </tr>
				        </thead>
				        <tbody>
					        <c:forEach items="${animais}" var="animal">
								<c:forEach items="${clientes}" var="cliente">
									<c:if test="${animal.idDono == cliente.id}">
										<td>${cliente.nome}</td>
									</c:if>
								 </c:forEach>
									<td>${animal.nome}</td>
									<td>${animal.porte}</td>
									<td>${animal.raca}</td>
									<td>${animal.sexo}</td>
									<td><a type="button"  href="mostraAnimal?id=${animal.id}&idDono=${animal.idDono}">Ver Mais</a></td>
								</tr>
							</c:forEach>
				        </tbody>
				    </table>
				</div>
			</div>	
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4>Consultas</h4>
				</div>
				<div class="panel-body">
					<a href="formularioConsulta"><button type="button" class="btn btn-primary btn-sm">Criar Consulta</button></a>
		<br /><br />
					
					<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
				    	<thead>
				        	<tr>
								<!--  <th>Id</th>  -->	
								<th> Nome Cliente </th>
								<th> Nome Funcionario </th>
								<th>Serviço</th>		
								<th> Data </th>
								<th> </th>	
				                </tr>
				        </thead>
				        <tbody>
					        <c:forEach items="${consultas}" var="consulta">
								<c:forEach items="${clientes}" var="cliente">
									<c:if test="${consulta.idCliente == cliente.id}">
										<td>${cliente.nome}</td>
									</c:if>
								 </c:forEach>
									<c:forEach items="${funcionarios}" var="funcionario">
									<c:if test="${consulta.idFuncionario == funcionario.id}">
										<td>${funcionario.nome}</td>
									</c:if>
									 </c:forEach>
									<td>${consulta.servico}</td>
									<td>${consulta.data}</td>
									<td><a type="button"  href="mostraConsulta?id=${consulta.id}&idCliente=${consulta.idCliente}&idFuncionario=${consulta.idFuncionario}">Ver Mais</a></td>
							</tr>
							</c:forEach>
				        </tbody>
				    </table>
				</div>
			</div>			
			</div>
		</div>	
	</div>
</body>
</html>
