package com.guru.springframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.guru.springframweork.game")
public class ObjectsBySpring {
	
   public static void main(String[] args) {
	   //Using @Component for GameRunner and ImplClass of Game 
	   var context=new AnnotationConfigApplicationContext(ObjectsBySpring.class);
	   context.getBean(GameRunner.class).Run();
	   
	
}
}
