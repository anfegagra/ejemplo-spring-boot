package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

	@GetMapping("/string")
	public String obtenerParametrosDeUrl(@RequestParam(name = "texto") String texto, Model model) {
		model.addAttribute("resultado", "El resultado es: " + texto);
		return "params/ver";
	}

	@GetMapping("/")
	public String enviarParametros() {
		return "params/enviar";
	}

}
