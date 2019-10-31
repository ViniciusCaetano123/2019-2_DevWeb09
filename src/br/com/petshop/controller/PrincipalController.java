package br.com.petshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petshop.dao.ClienteDao;
import br.com.petshop.dao.ConsultaDAO;
import br.com.petshop.dao.FuncionarioDAO;
import br.com.petshop.dao.UsuarioDAO;
import br.com.petshop.model.Cliente;



@Controller
public class PrincipalController{
	
	@Autowired
	UsuarioDAO daoUsuario;
	
	@Autowired
	ClienteDao daoCliente;
	
	@Autowired		
	FuncionarioDAO daoFuncionario;
	
	@Autowired
	ConsultaDAO daoConsulta;
	
	@RequestMapping("mostraCliente")
	public String mostra( int id, Model modeCliente)throws ClassNotFoundException{
		modeCliente.addAttribute("clientee", daoCliente.buscaPorId(id));
		return "cliente/lista";
	}
	@RequestMapping("adicionarCliente")
	public String adicionar(@Valid Cliente cliente) throws ClassNotFoundException{
		daoCliente.adiciona(cliente);
		return "redirect:listaPrincipal";
	}
	@RequestMapping("removerCliente")
	public String remover(@Valid Cliente cliente)throws ClassNotFoundException {
		System.out.print(cliente.getId());
		daoCliente.remove(cliente);
		return "redirect:listaPrincipal";
	}
	@RequestMapping("alterarCliente")
	public String alterar(@Valid Cliente cliente) throws ClassNotFoundException{
		System.out.println(cliente);
		System.out.println(cliente.getEmail());
		System.out.println(cliente.getId());
		daoCliente.altera(cliente);		
		return "redirect:listaPrincipal";
	}
	@RequestMapping("listaPrincipal")
	public String listaPrincipal(Model modelCliente, Model modelFuncionario, Model modelConsulta) {
		modelCliente.addAttribute("clientes", daoCliente.lista()); 
		modelFuncionario.addAttribute("funcionarios", daoFuncionario.lista()); 
		modelCliente.addAttribute("totalClientes", daoCliente.totalCliente());
		modelFuncionario.addAttribute("totalFuncionarios", daoFuncionario.totalFuncionario()); 
		modelConsulta.addAttribute("totalConsultas", daoConsulta.totalConsulta());
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