package com.guru.springframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class PacMan implements Game {

	@Override
	public void up() {
		System.out.println("Coming up");

	}

	@Override
	public void down() {
		System.out.println("Coming down");

	}

	@Override
	public void left() {
		System.out.println("Coming left");

	}

	@Override
	public void right() {
		System.out.println("Coming Right");

	}

}
