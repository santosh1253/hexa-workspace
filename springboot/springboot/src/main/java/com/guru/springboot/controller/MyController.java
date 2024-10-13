package com.guru.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired 
	private JdbcTemplate jdbc;
	
	@Autowired
	private Course course;
	
	@GetMapping("/get")
	public Course getCourses()
	{
		
		return new Course("Guru",1,"hyd");
	}
	@GetMapping("/insert")
	public void insert()
	{
		Course course=getCourses();
		String query="""
				insert into course values(?,?,?);
				""";
		jdbc.update(query,course.getName(),course.getRollno(),course.getLoc());
	}
	
	@GetMapping("/delete")
	public void delete()
	{
		Course course=getCourses();
		jdbc.update("delete from course where rollno=?",course.getRollno());
	}
	@GetMapping("/select")
	public Course select()
	{
		Course course=getCourses();
	    return jdbc.queryForObject("select * from course where rollno=?", new BeanPropertyRowMapper<>(Course.class),
	    course.getRollno());
	}
	

}
