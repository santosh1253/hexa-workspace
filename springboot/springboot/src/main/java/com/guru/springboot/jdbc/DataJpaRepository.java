package com.guru.springboot.jdbc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guru.springboot.controller.Course;

public interface DataJpaRepository extends JpaRepository<Course, Integer> {

	 List<Course> findByLoc(String input);
	 List<Course> findByName(String name);
}
