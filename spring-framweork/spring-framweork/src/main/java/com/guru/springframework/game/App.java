package com.guru.springframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.guru.springframweork.game")
public class App {
	@Bean
	public GameRunner game2(Game games)
	{
		GameRunner obj=new GameRunner(games);
		return obj;
	}
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(App.class)) {
			//System.out.println(context.getBean(Game.class));
			context.getBean(GameRunner.class).Run();

		} 
	}

}
