package com.sai.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sai.learn_spring_framework.game.GameRunner;
import com.sai.learn_spring_framework.game.GamingConsole;
import com.sai.learn_spring_framework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
			@Bean
			public GamingConsole pacmanGame() {
				 return new PacmanGame();
				
			}
	
	        //var game = new MarioGame();
	
			//var game = new SuperContraGame();
			
			
//			var gameRunner = new GameRunner(game);
//			gameRunner.run();


}
