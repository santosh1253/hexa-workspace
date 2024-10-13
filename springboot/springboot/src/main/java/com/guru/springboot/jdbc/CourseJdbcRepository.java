package com.guru.springboot.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	String query ="""
			insert into course values(2,'Datta','RakeshPaul');
			""";

	public void insert()
	{
		jdbctemplate.update(query);
	}

}
