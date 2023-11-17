package edu.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Employee;
import edu.learning.entity.Task;
import edu.learning.repository.EmployeeRepository;
import edu.learning.repository.TaskRepository;

@RestController
public class TaskController {
	@Autowired
	private TaskRepository repository;
	
	@PostMapping("/save-task")
	public String saveTask(@RequestBody Task task) {
		repository.save(task);
		return "Task Save Successfully...";
	}
	
	@GetMapping("/get-task-details")
	public Task getTaskById(@RequestParam("id") int id) {
		return repository.findById(id).get();
	}
}








