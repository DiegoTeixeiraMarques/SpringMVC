package com.mballem.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargoController {

	@GetMapping("/cadastrar")					// GetMapping --> mapeia o método com /cadastrar para o dispatcher localizar quando solicitado na URL da aplicação
	public String cadastrar() {
		return "/cargo/cadastro";				// Retorna a página cadastro.html na pasta cargo
	}
	
	@GetMapping("/listar")						// GetMapping --> mapeia o método com /listar para o dispatcher localizar quando solicitado na URL da aplicação
	public String listar() {
		return "/cargo/lista";					// Retorna a página lista.html na pasta cargo
	}

}
