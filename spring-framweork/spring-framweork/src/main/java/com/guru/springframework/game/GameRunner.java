package com.guru.springframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private Game games;
    public GameRunner(@Qualifier("superContract")Game games)
    {
    	this.games=games;
    }
    public void Run()
    {
    	System.out.println(games);
    	games.up();
    	games.down();
    	games.left();
    	games.right();
    }
    
}
