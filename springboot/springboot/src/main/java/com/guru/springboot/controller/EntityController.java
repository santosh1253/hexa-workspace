package com.guru.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.guru.springboot.jdbc.CourseJpaRepository;

@RestController
public class EntityController {

	@Autowired
	private CourseJpaRepository em;
	
}
