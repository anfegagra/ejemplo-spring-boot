package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/string")
@Controller
public class EjemploPathVariableController {

	@GetMapping("/path/{variable}")
	public String obtenerVariableDePath(@PathVariable String variable, Model model) {
		model.addAttribute("titulo", "Recibir variable del path con @PathVariable");
		model.addAttribute("resultado", "El texto enviado en la ruta es: " + variable);
		return "variables/ver";
	}
}
