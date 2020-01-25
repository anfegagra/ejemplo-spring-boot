package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/variables")
@Controller
public class EjemploPathVariableController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Enviar parámetros de la ruta @PathVariable");
		return "variables/index";
	}

	@GetMapping("/path/{variable}")
	public String obtenerVariableDelPath(@PathVariable String variable, Model model) {
		model.addAttribute("titulo", "Recibir variable del path con @PathVariable");
		model.addAttribute("resultado", "El texto enviado en la ruta es: " + variable);
		return "variables/ver";
	}

	@GetMapping("/path/{saludo}/{numero}")
	public String obtenerVariablesDelPath(@PathVariable String saludo,
		@PathVariable Integer numero, Model model) {
		model.addAttribute("resultado",
			"El saludo es: " + saludo + ". El número enviado es: " + numero);
		return "variables/ver";
	}
}
