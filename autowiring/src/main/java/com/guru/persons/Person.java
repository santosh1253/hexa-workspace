package com.guru.persons;

import com.guru.entities.Laptop;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Person {
	private String name;
	private int age;
	private String job;
	private Laptop laptop;
	
	public Person(Laptop laptop)
	{
		System.out.println("Using constructor");
		this.laptop=laptop;
	}
	

}
