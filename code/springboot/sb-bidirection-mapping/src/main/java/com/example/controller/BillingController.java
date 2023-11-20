package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Billing;
import com.example.repository.BillingRepository;

@RestController
public class BillingController {

	@Autowired
	private BillingRepository repository;
	
	@PostMapping("/save-bill")
	public String saveBill(@RequestBody Billing billing) {
		repository.save(billing);
		return "User Bill Save Successfully...";
	}
	
	@GetMapping("/bill-by-id")
	public Billing getById(@RequestParam("id") int id) {
		return repository.findById(id).get();
	}
	
}
