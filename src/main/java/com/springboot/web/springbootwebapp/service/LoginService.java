package com.springboot.web.springbootwebapp.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean isValidCreds(String uName, String pass) {
		return (uName.equals("swarup") && pass.equals("das")) || (uName.equals("anusha") && pass.equals("bs"));
	}
}
