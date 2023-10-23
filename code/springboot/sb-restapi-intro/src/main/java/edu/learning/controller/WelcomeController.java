package edu.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	// http://localhost:8080/welcome
	@GetMapping("/welcome")
	public String helloMessage() {
		return "Hello Welcome To First REST API...";
	}
	
	
	@GetMapping("/say-hi")
	public String hiMessage() {
		return "Hi User Welcome To First REST API...";
	}
	
}
