package com.thecodingclasses.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

	@RequestMapping("/hello")
	public String sayHelloSpring() {
		return "Hello Everyone.. Welcome to Spring Boot";
	}
	
}
