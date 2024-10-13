package com.guru.springboot.mywebapp.app;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.guru.springboot.mywebapp.repository.TodoRepo;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("uname")
public class TodoController {
	@Autowired
	private TodoService service;
    @Autowired
    private TodoRepo repo;
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap map) {
		map.put("todos", repo.findAll());

		return "listTodos";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String showNewTodo(ModelMap model) {
		String uname = (String) model.get("uname");
		Todo obj = new Todo(0, uname, "default description", LocalDate.now(), false);
		model.put("todo", obj);
		repo.save(obj);
		return "addTodo";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addNewTodo(@Valid  Todo todo, ModelMap model, BindingResult res) {
		if(res.hasErrors())
		{
			return "addTodo";
		}
		service.addTodo((String) model.get("uname"), todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:list-todos";
	}

	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id) {
		service.deleteById(id);
		return "redirect:list-todos";
	}

	@RequestMapping( value="update-todo" ,method = RequestMethod.GET)
	public String updateTodo(@RequestParam int id,Model model) {
		Todo todo =service.findById(id);
		model.addAttribute("todo",todo);
		return "addTodo";
	}
	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String updateTodo(@Valid  Todo todo, ModelMap model, BindingResult res) {
		service.updateTodo(todo);
		return "redirect:list-todos";
	}

}
