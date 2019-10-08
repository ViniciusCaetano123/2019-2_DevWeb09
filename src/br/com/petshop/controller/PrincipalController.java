package br.com.petshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petshop.dao.ClienteDao;
import br.com.petshop.dao.FuncionarioDAO;
import br.com.petshop.dao.UsuarioDAO;



@Controller
public class PrincipalController{
	
	@Autowired
	UsuarioDAO daoUsuario;
	
	@Autowired
	ClienteDao daoCliente;
	
	@Autowired		
	FuncionarioDAO daoFuncionario;
	
	@RequestMapping("listaPrincipal")
	public String listaPrincipal(Model modelCliente, Model modelFuncionario) {
		modelCliente.addAttribute("clientes", daoCliente.lista()); 
		modelFuncionario.addAttribute("funcionarios", daoFuncionario.lista()); 
		return "principal/principal";
	}
	
	@RequestMapping("/")
	public String listaPrincipalRaiz() {
		return "principal/principal";
	}
	
	@RequestMapping("formulario")
	public String formulario() throws ClassNotFoundException{
		return "cliente/formulario";
	}
	
}