package com.springboot.web.springbootwebapp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.web.springbootwebapp.service.LoginService;
import com.springboot.web.springbootwebapp.service.TodoService;

@SessionAttributes("name")
@Controller
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method=RequestMethod.GET)
	public String getLoginPage(ModelMap model) {
		String name = (String)model.get("name");
		model.put("todos", service.retrieveTodos(name));
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.GET)
	public String showAddTodo(ModelMap model) {
		return "add-todo";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.POST)
	public String addTodo(ModelMap model, @RequestParam String desc) {
//		model.put("desc", desc);
		service.addTodo((String)model.get("name"), desc, new Date(), false);
		return "redirect:/list-todos";
	}
}
