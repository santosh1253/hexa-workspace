package com.guru.springboot.app;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todo;
	static
	{
		todo.add(new Todo(1,"Guru","AWS",LocalDate.now().plusYears(1),false));
		todo.add(new Todo(1,"Datta","Devopps",LocalDate.now().plusYears(2),true));
		todo.add(new Todo(1,"Vaishu","Java",LocalDate.now().plusYears(1),true));	
	}
	public List<Todo> getAllTodos()
	{
		return todo;
	}
	

}
