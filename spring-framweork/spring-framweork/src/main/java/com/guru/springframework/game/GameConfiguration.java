package com.guru.springframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

public class GameConfiguration {

	@Bean
	public GameRunner game(Game game)
	{
		GameRunner obj=new GameRunner(game);
		return obj;
	}
	@Bean
	@Primary
	public Game games()
	{
		Game game=new SuperContract();
		game.down();
		game.left();
		return game;
	}	
}
