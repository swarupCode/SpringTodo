package com.springboot.web.springbootwebapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.web.springbootwebapp.model.Todo;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 4;
	
	static {
		todos.add(new Todo(1, "swarup", "Learn Python", new Date(), false));
		todos.add(new Todo(2, "anusha", "Learn Selenium", new Date(), true));
		todos.add(new Todo(3, "swarup", "Learn Java", new Date(), true));
		todos.add(new Todo(4, "swarup", "Learn English", new Date(), true));
	}
	
	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		todos.forEach(x -> {
			if(x.getUser().equalsIgnoreCase(user)) {
				filteredTodos.add(x);
			}
		});
		return filteredTodos;
	}
	
	public void addTodo(String name, String desc, Date currDate, boolean isCompleted) {
		todos.add(new Todo(++todoCount, name, desc, currDate, isCompleted));
	}
	
	public void deleteTodo(int id) {
		
		
		  Iterator<Todo> iterator = todos.iterator(); 
		  while (iterator.hasNext()) { 
			  Todo todo = iterator.next(); 
			  if (todo.getId() == id) { iterator.remove(); 
			  } 
		  }
		
		  /*
		todos.forEach(x -> {
			if(x.getId() == id) {
				
				todos.remove(todos.indexOf(x));
			}
		});*/
	}
}
