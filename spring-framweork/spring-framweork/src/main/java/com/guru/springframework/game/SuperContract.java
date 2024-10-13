package com.guru.springframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContract")
public class SuperContract implements Game {
	public void up()
	   {
		   System.out.println("Going Up");
	   }
	   public void down()
	   {
		   System.out.println("Going Down");
	   }
	   public void left()
	   {
		   System.out.println("Going left");
	   }
	   public void right()
	   {
		   System.out.println("Going right");
   }
}
