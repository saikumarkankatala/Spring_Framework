package com.sai.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole{
	
	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("sit down");
	}
	
	public void left() {
		System.out.println("Go Back");
	}
	
	public void right() {
		System.out.println("Shoot bullet");
	}
}
