package com.guru.springboot.mywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("uname")
public class MyController {
	@GetMapping("/say-hello")
	public String sayHello()
	{
		return "result";
	}
	
	@GetMapping("/say-hello-html")
	public String sayHelloHtml()
	{
		System.out.println("Method is called");
		return "file";
	}
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	@PostMapping("/login")
	public String login(@RequestParam String username,@RequestParam String pwd,ModelMap map)
	{
		System.out.println("Method called");
		map.put("uname",username);
		map.put("pwd", pwd);
		return "welcome";
	}
	@GetMapping("/")
	public String welcomePage(ModelMap map)
	{
		return "welcome";
	}

}
