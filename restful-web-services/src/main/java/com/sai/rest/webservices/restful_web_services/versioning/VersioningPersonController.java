package com.sai.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/v1/person")
	public Person getFirstVersionPerson() {
		return new Person("SAI KANKATALA");
		
	}
	
	@GetMapping("/v2/person")
	public PersonV1 getSecondVersionPerson() {
		return new PersonV1(new Name("SAI", "KANKATALA"));
		
	}
	
	@GetMapping(path = "/person", params ="version=1")
	public Person getFirstVersionPersonReqParam() {
		return new Person("SAI KANKATALA");
		
	}
	
	@GetMapping(path = "/person", params ="version=2")
	public PersonV1 getSecondVersionPersonReqParam() {
		return new PersonV1(new Name("SAI", "KANKATALA"));
		
	}
	
	@GetMapping(path = "/person/header", headers ="X-API-VERSION=1")
	public Person getFirstVersionPersonReqHeader() {
		return new Person("SAI KANKATALA");
		
	}
	
	@GetMapping(path = "/person/header", headers ="X-API-VERSION=2")
	public PersonV1 getSecondVersionPersonReqHeader() {
		return new PersonV1(new Name("SAI", "KANKATALA"));
		
	}
	

	@GetMapping(path = "/person/accept", produces ="application/vnd.company.app-v1+json")
	public Person getFirstVersionPersonAccHeader() {
		return new Person("SAI KANKATALA");
		
	}
	
	@GetMapping(path = "/person/accept", produces ="application/vnd.company.app-v2+json")
	public PersonV1 getSecondVersionPersonAccHeader() {
		return new PersonV1(new Name("SAI", "KANKATALA"));
		
	}

}
