package com.guru.springboot.mywebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guru.springboot.mywebapp.app.Todo;

public interface TodoRepo extends JpaRepository<Todo,Integer> {

}
