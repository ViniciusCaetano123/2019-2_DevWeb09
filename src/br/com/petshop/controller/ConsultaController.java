package br.com.petshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petshop.dao.ClienteDao;
import br.com.petshop.dao.ConsultaDao;
import br.com.petshop.dao.FuncionarioDao;
import br.com.petshop.model.Cliente;
import br.com.petshop.model.Consulta;

@Controller
public class ConsultaController {
	
	@Autowired
	ConsultaDao daoConsulta;

	@Autowired
	ClienteDao daoCliente;	

	@Autowired
	FuncionarioDao daoFuncionario;
	
	@RequestMapping("mostraConsulta")
	public String mostra( int id, int idCliente,int idFuncionario,Model modelConsulta)throws ClassNotFoundException{
		modelConsulta.addAttribute("consulta", daoConsulta.buscaPorId(id));
		modelConsulta.addAttribute("cliente", daoCliente.buscaPorId(idCliente));
		modelConsulta.addAttribute("funcionario", daoFuncionario.buscaPorId(idFuncionario));
		return "consulta/lista";
	}
	@RequestMapping("adicionarConsulta")
	public String adicionar(@Valid Consulta consulta) throws ClassNotFoundException{
		daoConsulta.adiciona(consulta);
		return "redirect:listaPrincipal";
	}
	@RequestMapping("removerConsulta")
	public String remover(@Valid Consulta consulta)throws ClassNotFoundException {
		daoConsulta.remove(consulta);
		return "redirect:listaPrincipal";
	}
	@RequestMapping("alterarConsulta")
	public String alterar(@Valid Consulta consulta) throws ClassNotFoundException{
		daoConsulta.altera(consulta);		
		return "redirect:listaPrincipal";
	}
}
