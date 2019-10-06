package br.com.petshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petshop.dao.UsuarioDAO;
import br.com.petshop.model.Usuario;

@Controller
public class UsuarioController {
	
    @Autowired
    UsuarioDAO daoUsuario;
    
	@RequestMapping("listaUsuarios")
    public String lista(Model modelUsuario) throws ClassNotFoundException {
        modelUsuario.addAttribute("usuarios", daoUsuario.lista());
        return "usuario/lista";
    }

	@RequestMapping("novoUsuario")
	public String form() {
		return "login/formulario-cadastro";
	}
	
	@RequestMapping("adicionaUsuario")
	public String adiciona(@Valid Usuario usuario, BindingResult result) throws ClassNotFoundException {
		if(result.hasFieldErrors("nome") || result.hasFieldErrors("login") || result.hasFieldErrors("senha") || result.hasFieldErrors("email")) {
			 return "usuario/formulario";
	     }
		daoUsuario.adiciona(usuario);
		return "redirect:listaUsuarios";
	}
	
	@RequestMapping("mostraUsuario")
    public String mostra(Long id, Model modelUsuario) throws ClassNotFoundException {
        modelUsuario.addAttribute("usuario", daoUsuario.buscaPorId(id));
        return "usuario/mostra";
    }
	
	@RequestMapping("alteraUsuario")
	public String altera(@Valid Usuario usuario, BindingResult result) throws ClassNotFoundException {
		if(result.hasFieldErrors("nome") || result.hasFieldErrors("login") || result.hasFieldErrors("senha") || result.hasFieldErrors("dataNascimento") || result.hasFieldErrors("altura")) {
			 return "usuario/mostra";
	     }
		daoUsuario.altera(usuario);
        return "redirect:listaUsuarios";
    }
	
    @RequestMapping("removeUsuario")
    public String remove(Usuario usuario) throws ClassNotFoundException {
    	daoUsuario.remove(usuario);
        return "redirect:listaUsuarios";
    }
    
}