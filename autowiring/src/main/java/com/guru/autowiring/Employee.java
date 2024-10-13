package com.guru.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Component
public class Employee {
	private int empid;
	private String name;
	private Manager m;
	@Autowired
	public Employee(Manager manager)
	{
		this.m=manager;
	}
	

}
