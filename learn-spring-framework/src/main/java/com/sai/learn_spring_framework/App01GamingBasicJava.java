package com.sai.learn_spring_framework;

import com.sai.learn_spring_framework.game.GameRunner;
import com.sai.learn_spring_framework.game.MarioGame;
import com.sai.learn_spring_framework.game.PacmanGame;
import com.sai.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game = new MarioGame();
		
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
