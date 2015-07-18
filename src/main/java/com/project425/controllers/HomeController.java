package com.project425.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/home")
	public String showMessage(Model model) {
		model.addAttribute("message", "Welcome Home");
		return "home";
	}
}
