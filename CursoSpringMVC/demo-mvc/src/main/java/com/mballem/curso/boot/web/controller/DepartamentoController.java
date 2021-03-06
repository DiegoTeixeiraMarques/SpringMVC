package com.mballem.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller										// Indica que a classe é um controller na aplicação
@RequestMapping("/departamentos")				// Indica o path para a identificação pelo dispatcher
public class DepartamentoController {
	
	@GetMapping("/cadastrar")					// GetMapping --> mapeia o método com /cadastrar para o dispatcher localizar quando solicitado na URL da aplicação
	public String cadastrar() {
		return "/departamento/cadastro";		// Retorna a página cadastro.html na pasta departamento
	}
	
	@GetMapping("/listar")						// GetMapping --> mapeia o método com /listar para o dispatcher localizar quando solicitado na URL da aplicação
	public String listar() {
		return "/departamento/lista";			// Retorna a página lista.html na pasta departamento
	}

}
