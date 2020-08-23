package com.springboot.web.springbootwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.web.springbootwebapp.service.LoginService;

@SessionAttributes("name")
@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginPage(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String getWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String pass) {
		
		boolean isValid = service.isValidCreds(name, pass);
		if(!isValid) {
			model.put("errorMessage", "Invalid Credentials!!!!");
			return "login";
		}
		
		model.put("name", name);
		model.put("pass", pass);
		
		return "welcome";
	}
}
