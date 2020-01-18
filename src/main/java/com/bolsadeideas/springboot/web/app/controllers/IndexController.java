package com.bolsadeideas.springboot.web.app.controllers;

import com.bolsadeideas.springboot.web.app.models.Usuario;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"/index", "/", "", "home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Boot!");
		return "index";
	}

	@GetMapping("/perfil")
	public String obtenerPerfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Felipe");
		usuario.setApellido("Garcia");
		usuario.setCorreo("prueba@prueba.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}

	@GetMapping("/usuarios")
	public String obtenerUsuarios(Model model) {
		List<Usuario> usuarios = Arrays
			.asList(new Usuario("Felipe", "Garcia", "prueba@prueba.com"),
				new Usuario("David", "Garcia", "prueba-david@prueba.com"));
		model.addAttribute("titulo", "Lista de usuarios");
		model.addAttribute("usuarios", usuarios);
		return "usuarios";
	}
}
