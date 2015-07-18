package com.project425.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project425.entities.User;
import com.project425.services.UserServiceImpl;

@Controller
public class AddController {

	@Autowired
	UserServiceImpl userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "addUser";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user) {
		userService.save(user);
		return "success";
	}
}
