package com.guru.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages="com.guru.springcore")
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
       Employee e=context.getBean(Employee.class);
       System.out.println(e);
       String res[]=context.getBeanDefinitionNames();
       for(String r:res)
       {
    	   System.out.println(r);
       }
       
    }
}
