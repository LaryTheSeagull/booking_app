package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

	@GetMapping("/greeting")
	public String greet(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@PostMapping("/login") 
	public String auth(Model model) {
		return "login";
	}

	@GetMapping("/error")
	public String error(Model model) {

	}
}
