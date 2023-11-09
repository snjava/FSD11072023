package edu.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.UserDetails;
import edu.institute.repository.UserDetailsRepository;

@RestController
public class UserDetailsController {
	@Autowired
	private UserDetailsRepository repository;
	
	@PostMapping("/save-user")
	public String saveUser(@RequestBody UserDetails userDetails) {
		repository.save(userDetails);
		return "User Details save successfully...";
	}
}
