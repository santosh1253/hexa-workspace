package com.guru.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.guru.persons.Person;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("myconfig.xml");
		Person p=(Person) context.getBean("guru");
		System.out.println(p.toString());
	}
}
