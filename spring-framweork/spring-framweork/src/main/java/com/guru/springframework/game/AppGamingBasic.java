package com.guru.springframework.game;

public class AppGamingBasic {

	public static void main(String[] args) {
		//var  marioGame=new MarioGame();
		//var superContract=new SuperContract();
		  Game game=new PacMan();
		  var gameRunner=new GameRunner(game);
           gameRunner.Run();
        
	}

}
