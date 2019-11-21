package br.com.petshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petshop.dao.AnimalDao;
import br.com.petshop.dao.ClienteDao;
import br.com.petshop.dao.ConsultaDao;
import br.com.petshop.dao.FuncionarioDao;
import br.com.petshop.dao.FuncionarioDao;
import br.com.petshop.dao.UsuarioDAO;
import br.com.petshop.model.Cliente;



@Controller
public class PrincipalController{
	
	@Autowired
	UsuarioDAO daoUsuario;
	
	@Autowired
	ClienteDao daoCliente;
	
	@Autowired		
	FuncionarioDao daoFuncionario;
	
	@Autowired
	AnimalDao daoAnimal;
	
	@Autowired
	ConsultaDao daoConsulta;
	
	@RequestMapping("listaPrincipal")
	public String listaPrincipal(Model modelCliente, Model modelFuncionario, Model modelConsulta, Model modelAnimal) {
		modelCliente.addAttribute("clientes", daoCliente.lista()); 
		modelFuncionario.addAttribute("funcionarios", daoFuncionario.lista()); 
		modelCliente.addAttribute("totalClientes", daoCliente.totalCliente());
		modelFuncionario.addAttribute("totalFuncionarios", daoFuncionario.totalFuncionario()); 
		modelAnimal.addAttribute("animais",daoAnimal.lista());
		modelConsulta.addAttribute("consultas",daoConsulta.lista());
		modelConsulta.addAttribute("totalConsultas",daoConsulta.totalConsultas());
		return "principal/principal";
	}
	@RequestMapping("formularioCli")
	public String formulario() throws ClassNotFoundException{
		return "cliente/formulario";
	}
	@RequestMapping("/")
	public String listaPrincipalRaiz() {
		return "principal/principal";
	}
	
	@RequestMapping("formularioFunc")
	public String formularioFunc() throws ClassNotFoundException{
		return "funcionario/formulario";
	}
	
	@RequestMapping("formularioAnimal")
	public String formularioAnimal(Model modeAnimal) throws ClassNotFoundException{
		modeAnimal.addAttribute("clientes", daoCliente.lista()); 
		return "animal/formulario";
	}
	@RequestMapping("formularioConsulta")
	public String formularioConsulta(Model modelConsulta ) throws ClassNotFoundException{
		modelConsulta.addAttribute("clientes", daoCliente.lista()); 
		modelConsulta.addAttribute("funcionarios", daoFuncionario.lista()); 
		return "consulta/formulario";
	}
	
}