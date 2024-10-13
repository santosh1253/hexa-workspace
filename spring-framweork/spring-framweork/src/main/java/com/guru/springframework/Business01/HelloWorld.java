package com.guru.springframework.Business01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

	public static void main(String[] args) {
		var context = new ClassPathXmlApplicationContext("config.xml");
	   //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
