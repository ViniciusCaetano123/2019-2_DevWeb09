package br.com.petshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petshop.dao.ClienteDao;
import br.com.petshop.dao.FuncionarioDao;
import br.com.petshop.model.Cliente;
import br.com.petshop.model.Funcionario;
@Controller
public class FuncionarioController {
	
	@Autowired
	FuncionarioDao daoFuncionario;
	
	@RequestMapping("formulario")
	public String formulario() throws ClassNotFoundException{
		return "funcionario/formulario";
	}
	
	@RequestMapping("mostraFuncionario")
	public String mostra(int id, Model modelFuncionario)throws ClassNotFoundException{
		modelFuncionario.addAttribute("funcionario", daoFuncionario.buscaPorId(id));
		return "funcionario/lista";
	}
	@RequestMapping("adicionarFuncionario")
	public String adicionar(@Valid Funcionario funcionario) throws ClassNotFoundException{
		daoFuncionario.adiciona(funcionario);
		return "redirect:listaPrincipal";
	}
	@RequestMapping("removerFuncionario")
	public String remover(@Valid Funcionario funcionario)throws ClassNotFoundException {
		System.out.print(funcionario.getId());
		daoFuncionario.remove(funcionario);
		return "redirect:listaPrincipal";
	}
	@RequestMapping("alterarFuncionario")
	public String alterar(@Valid Funcionario funcionario) throws ClassNotFoundException{
		daoFuncionario.altera(funcionario);		
		return "redirect:listaPrincipal";
	}
	
	
}
