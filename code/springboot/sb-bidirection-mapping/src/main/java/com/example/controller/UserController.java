package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@PostMapping("/save-user")
	public String saveUser(@RequestBody User user) {
		repository.save(user);
		return "User Save Successfully...";
	}
	
	@GetMapping("/user-by-id")
	public User getById(@RequestParam("id") int id) {
		return repository.findById(id).get();
	}
	
}
