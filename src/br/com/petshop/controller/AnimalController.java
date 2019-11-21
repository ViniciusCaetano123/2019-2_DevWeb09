package br.com.petshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petshop.dao.AnimalDao;
import br.com.petshop.dao.ClienteDao;
import br.com.petshop.model.Animal;
import br.com.petshop.model.Cliente;

@Controller
public class AnimalController {
	
	@Autowired
	AnimalDao daoAnimal;	
	
	@Autowired
	ClienteDao daoCliente;
	
	@RequestMapping("mostraAnimal")
	public String mostra(int id, int idDono,Model modeAnimal, Model modelCliente)throws ClassNotFoundException{
		modeAnimal.addAttribute("animal", daoAnimal.buscaPorId(id));
		modelCliente.addAttribute("cliente", daoCliente.buscaPorId(idDono));
		modelCliente.addAttribute("clientes", daoCliente.lista());
		return "animal/lista";
	}
	@RequestMapping("adicionarAnimal")
	public String adicionar(@Valid Cliente cliente, @Valid Animal animal) throws ClassNotFoundException{
		System.out.print(cliente.getId());
		System.out.print(animal.getIdDono());
		daoAnimal.adiconar(animal);
		return "";
	}
	@RequestMapping("removerAnimal")
	public String remover(@Valid Animal animal)throws ClassNotFoundException {
		daoAnimal.remove(animal);
		return "redirect:listaPrincipal";
	}
	@RequestMapping("alterarAnimal")
	public String alterar(@Valid Animal animal) throws ClassNotFoundException{
		daoAnimal.altera(animal);		
		return "redirect:listaPrincipal";
	}
	
}
