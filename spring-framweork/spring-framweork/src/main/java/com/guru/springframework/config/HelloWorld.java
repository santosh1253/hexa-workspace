package com.guru.springframework.config;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {

	public static void main(String[] args) {
		// 1: Launching the Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// 2: Configuring the things that spring want to manage
		// HelloWorldConfiguration --@Configuartion
		// name-@Bean
		// 3:Calling the bean by bean-name using context object
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean(Address.class));
		//System.out.println(context.getBean("office"));
//		String arr[]=context.getBeanDefinitionNames();
//	        System.out.println(Arrays.toString(arr));

	}

}
