package edu.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.service.CalculationService;

@RestController
public class CalculationController {

	@Autowired
	CalculationService service;
	
	// localhost:9090/calculator-param?n1=23&n2=2&opt=A
	@GetMapping("/calculator-param")
	public String showResult(@RequestParam("n1") double num1, 
			@RequestParam("n2") double num2, 
			@RequestParam("opt") String operation) {
		return service.caculate(num1, num2, operation);
	}
	
	// localhost:9090/calculator-path/23/2/A
	@GetMapping("/calculator-path/{n1}/{n2}/{opt}")
	public String getResult(@PathVariable("n1") double num1, 
			@PathVariable("n2") double num2, 
			@PathVariable("opt") String opt) {
		return service.caculate(num1, num2, opt);
	}
	
}
