package br.com.petshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PrincipalController{
	
	@RequestMapping("listaPrincipal")
	public String listaPrincipal() {
		return "principal/principal";
	}
	
	@RequestMapping("/")
	public String listaPrincipalRaiz() {
		return "principal/principal";
	}
	
}