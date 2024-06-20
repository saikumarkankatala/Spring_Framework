package com.sai.rest.webservices.restful_web_services.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	private MessageSource messageSource;
	
	public HelloWorldController(MessageSource messageSource) {
		super();
		this.messageSource = messageSource;
	}

	@GetMapping(path= "/hello")
	public String hello() {
		return"Hello World";
	}
	
	@GetMapping(path= "/hello/bean")
	public HelloWorldBean helloBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path= "/hello/pathVariable/{name}")
	public HelloWorldBean helloPathVariable(@PathVariable String name) {
		return new HelloWorldBean("Hello World " + name);
	}
	
	@GetMapping(path= "/hello-international")
	public String helloInternaional() {
		
		Locale locale = LocaleContextHolder.getLocale();
		
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
	}
}
