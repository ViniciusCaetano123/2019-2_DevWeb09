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

	
	
}
