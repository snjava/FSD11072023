package edu.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.UserAddress;
import edu.institute.entity.UserDetails;
import edu.institute.repository.UserAddressRepository;
import edu.institute.repository.UserDetailsRepository;

@RestController
public class UserAddressController {
	@Autowired
	private UserAddressRepository repository;
	
	@PostMapping("/save-user-address")
	public String saveUser(@RequestBody UserAddress userAddress) {
		repository.save(userAddress);
		return "User Address save successfully...";
	}
}
