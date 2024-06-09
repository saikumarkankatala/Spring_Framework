package com.sai.learn_spring_framework.game;

public class GameRunner {

	//private MarioGame game;
	
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
