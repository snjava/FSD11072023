package edu.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// http://localhost:8080/hello
	@GetMapping("/hello")
	public String helloMessage() {
		return "Hello Controller First REST API...";
	}
	
}
