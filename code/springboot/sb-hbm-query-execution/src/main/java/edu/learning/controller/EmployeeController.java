package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Employee;
import edu.learning.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;
	
	@PostMapping("/save-emp")
	public String saveEmployee(@RequestBody Employee emp) {
		repository.save(emp);
		return "Employee Save successfully...";
	}
	
	@GetMapping("/get-emps")
	public List<Employee> getAllEmp() {
		return repository.findAll();
	}
}
