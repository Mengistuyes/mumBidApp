package mum.edu.cs544.mumBidApp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.cs544.mumBidApp.model.LoginUserDto;
import mum.edu.cs544.mumBidApp.model.RegisterUserDto;
import mum.edu.cs544.mumBidApp.service.UserService;
import mum.edu.cs544.mumBidApp.validator.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	@RequestMapping(value="/login")
	public String login(LoginUserDto loginUser, BindingResult result, ModelMap model) {
		return "login";
	}
	
	
	@RequestMapping(value="/validLogin")
	public String validLogin(@Valid LoginUserDto loginUser, BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			return "login";
		}else {
			if(!userService.loginUser(loginUser)) {
				model.addAttribute("errMsg", "Enter a valid details");
				return "login";
			}else {
				return "home";
			}
		}
	}
	/*@RequestMapping(value="/")
	private String getUser() {
		return "home";
	}
	
	@RequestMapping(value="/newUser")
	public String newUser(Model model) {
		model.addAttribute("user", new RegisterUserDto());
		return "register";
	}*/
	
	@RequestMapping(value="/newUser")
	public String newUser(RegisterUserDto registerUserDto, BindingResult result, ModelMap model) {
		return "register";
	}
	
	@RequestMapping(value="/registerUser")
	public String registerUser(@Valid RegisterUserDto registerUserDto, BindingResult result, ModelMap model) {
		userValidator.validate(registerUserDto, result);
		if(result.hasErrors()) {
			return "register";
		}else {
			if(userService.registerUser(registerUserDto)) {
				model.addAttribute("successMsg", "Registration Successful");
			}else {
				model.addAttribute("errMsg", "E-mail ID exist. Try with other E-mail ID");
			}
		}
		return "register";
	}
	
	/*public String saveNewUser() {
		return "";
	}*/

	public UserValidator getUserValidator() {
		return userValidator;
	}

	public void setUserValidator(UserValidator userValidator) {
		this.userValidator = userValidator;
	}
	
	
	
}
