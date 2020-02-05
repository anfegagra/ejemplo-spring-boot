package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/redirect")
	public String homeRedirect() {
		return "redirect:/app/index";
	}

	@GetMapping("/forward")
	public String homeForward() {
		return "forward:/app/index";
	}

}
