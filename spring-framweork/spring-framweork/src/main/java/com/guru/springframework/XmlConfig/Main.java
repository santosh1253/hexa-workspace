package com.guru.springframework.XmlConfig;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var context=new ClassPathXmlApplicationContext("config.xml");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		

	}

}
