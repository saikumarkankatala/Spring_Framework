package com.sai.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sai.learn_spring_framework.game.GameRunner;
import com.sai.learn_spring_framework.game.GamingConsole;
import com.sai.learn_spring_framework.game.MarioGame;
import com.sai.learn_spring_framework.game.PacmanGame;
import com.sai.learn_spring_framework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		System.out.println(context.getBean("pacmanGame"));
		
		GamingConsole game = (GamingConsole) context.getBean("pacmanGame");
		game.up();
	}

}
