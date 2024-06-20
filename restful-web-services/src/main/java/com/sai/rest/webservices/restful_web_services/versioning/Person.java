package com.sai.rest.webservices.restful_web_services.versioning;

public class Person {
	
	public Person(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
