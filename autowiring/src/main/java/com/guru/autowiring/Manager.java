package com.guru.autowiring;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@Data
@NoArgsConstructor
@ToString
public class Manager {
	private int mgrid;
	private String name;
	

}
