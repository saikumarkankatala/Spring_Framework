package com.sai.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1: Launch a Spring Context -
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: Configure the things that we want SPring to manage - 
		//HelloWorldConfiguration - @Configuration
		//name - @Bean
		
		//3: Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		//We are retrieving using the method name 
		System.out.println(context.getBean("person"));
		
		//We are retrieving the bean with help of the explicit bean name
		System.out.println(context.getBean("address1"));
		
		//We can also retrieve the bean with the help of type of the bean
		//we are using address type bean in below example
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean("person2Method"));
	
	}

}
