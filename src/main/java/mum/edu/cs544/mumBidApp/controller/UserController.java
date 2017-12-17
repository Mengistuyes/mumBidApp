package mum.edu.cs544.mumBidApp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.cs544.mumBidApp.model.User;

//import mum.edu.cs544.mumBidApp.model.User;

@Controller
public class UserController {
	@RequestMapping(value="/login")
	public String login() {
		return "register";
	}
	
	//@RequestMapping(value="/registerUser")
	@RequestMapping(value="/registerUser")
	public String registerUser(@Valid User user, BindingResult result, ModelMap model) {
		return "register";
	}
}
