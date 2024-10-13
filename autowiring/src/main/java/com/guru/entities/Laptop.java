package com.guru.entities;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Component
@Data  // getters & setters ,hashcode,equals etc..
@ToString
@NoArgsConstructor
public class Laptop {

	private int ram;
	private String model;
	private double price;
	
}
