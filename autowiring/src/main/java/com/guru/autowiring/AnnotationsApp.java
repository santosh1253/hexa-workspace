package com.guru.autowiring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.guru.autowiring")
public class AnnotationsApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationsApp.class);
		Manager m = context.getBean(Manager.class);
		m.setMgrid(1);
		m.setName("Guru");
		System.out.println(m.toString());
		Employee e=context.getBean(Employee.class);
		System.out.println(e.toString());
		String names[]=context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(names));

	}
}
