package com.guru.annotations;

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
	

}
