package com.guru.springframework.Business;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan
public class BusinessCalculation {
	DataService data;
	public BusinessCalculation(DataService data)
	{
		this.data=data;
		System.out.println("From BusinessCalculation Constructor");
		System.out.println(Arrays.stream(data.retriveData()).max().orElse(0));
	}
	public static void main(String[] args) {
		var context=new AnnotationConfigApplicationContext(BusinessCalculation.class);
        String arr[]=context.getBeanDefinitionNames();
       // System.out.println(context.getBeanDefinitionCount());
      context.getBean(MySqlService.class);
	}

}
