package com.sai.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructore,
//equals, hashcode and toString are automatically created
//Released in JDK 16
record Person (String name, int age) {};

record Address (String firstLine, String City) {};


@Configuration
public class HelloWorldConfiguration {
	
	
	@Bean
	public String name() {
		return "SAI";
	}
	
	@Bean
	public int age() {
		return 26;
	}
	
	//By default a bean takes the method name as the name of the bean
	@Bean
	public Person person() {
		return new Person("Mahhi", 25);
	}
	
	//You can give an explicit bean name for a method using the "name" tag
	@Bean(name = "address1")
	public Address address() {
		return new Address("2900 old 63 S", "Columbia");
	}
	
	@Bean
	public Person person2Method() {
		return new Person(name(),age());
	}
	
	//When you have same type of beans and you are calling beans using byType
	//Then use a Primary annotation
	//Use a qualifier to specify a bean
	@Bean(name = "address2")
	@Primary
	public Address address2() {
		return new Address("2900 old 63 S", "Columbia");
	}
	
	
}
