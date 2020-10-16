package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

	@GetMapping("/")
	public String main(Model model) {
		// main page
		return "main";
	}

	@GetMapping("/login")
	public String login(Model model) {
		// login page
		return "login";
	}

	@GetMapping("/greeting")
	public String greet(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping("/error")
	public String error(Model model) {
		// error page
		return "error";
	}
}
