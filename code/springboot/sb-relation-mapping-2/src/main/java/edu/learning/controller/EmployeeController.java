package edu.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Employee;
import edu.learning.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/save-emp")
	public String saveEmployee(@RequestBody Employee employee) {
		repository.save(employee);
		return "Employee Save Successfully...";
	}
	
	@GetMapping("/get-emp-by-id/{id}")
	public Employee getById(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
}



