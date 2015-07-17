package com.project425.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project425.entities.User;
import com.project425.services.UserServiceImpl;

@Controller
public class HomeController {

	@Autowired
	UserServiceImpl userService;

	@RequestMapping(value = "/home")
	public String showMessage(Model model) {
		model.addAttribute("message", "Hello World!");
		User user = new User();
		user.setName("Brian");
		user.setEmail("brian@mail.com");
		userService.save(user);
		System.out.println("Successfully saved the new data");
		return "showMessage";
	}
}
