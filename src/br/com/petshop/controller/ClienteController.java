package br.com.petshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petshop.dao.ClienteDao;
import br.com.petshop.model.Cliente;

public class ClienteController {
	
	@Autowired
	ClienteDao daoCliente;
	
	@RequestMapping("formulario")
	public String formulario() throws ClassNotFoundException{
		return "cliente/formulario";
	}
	@RequestMapping("mostraCliente")
	public String mostra( int id, Model modeCliente)throws ClassNotFoundException{
		modeCliente.addAttribute("cliente", daoCliente.buscaPorId(id));
		return "cliente/lista";
	}
	@RequestMapping("adicionarCliente")
	public String adicionar(@Valid Cliente cliente) throws ClassNotFoundException{
		daoCliente.adiciona(cliente);
		return "cliente/cadastro";
	}
	@RequestMapping("removerCliente")
	public String remover(@Valid Cliente cliente)throws ClassNotFoundException {
		System.out.print(cliente.getId());
		daoCliente.remove(cliente);
		return "redirect:listaPrincipal";
	}
	@RequestMapping("alterarCliente")
	public String alterar(@Valid Cliente cliente) throws ClassNotFoundException{
		daoCliente.altera(cliente);		
		return "redirect:listaPrincipal";
	}
	
	
}
