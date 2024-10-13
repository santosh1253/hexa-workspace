package com.guru.springboot.mywebapp.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todo=new ArrayList<>();
	private int count=0;
	static
	{
		todo.add(new Todo(1,"Guru","AWS",LocalDate.now().plusYears(1),false));
		todo.add(new Todo(2,"Datta","Devopps",LocalDate.now().plusYears(2),true));
		todo.add(new Todo(3,"Vaishu","Java",LocalDate.now().plusYears(1),true));	
	}
	public List<Todo> getAllTodos()
	{
		return todo;
	}
	public Todo addTodo(String uname,String description,LocalDate date,Boolean bool)
	{
		Todo savedTodo=new Todo(++count,uname,description,date,bool);
		todo.add(savedTodo);
		return savedTodo;
	}
	public void deleteById(int id)
	{
//		for(int i=0;i<todo.size();i++)
//		{
//			if(todo.get(i).getId()==id)
//			{
//				todo.remove(i);
//			}
//		}
		Predicate<? super Todo> p=todo->todo.getId()==id;
		todo.removeIf(p);
	}
	public Todo findById(int id) {
		Predicate<? super Todo> p=todo->todo.getId()==id;
		return todo.stream().filter(p).findFirst().get();
	}
	public Todo updateTodo(Todo t)
	{
		deleteById(t.getId());
	     todo.add(t);
	     return t;
	}
	

}
