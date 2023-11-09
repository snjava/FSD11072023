package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Task;
import edu.learning.repository.TaskRepository;
import edu.learning.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService service;
	
	@PostMapping("/create-task")
	public String saveTask(@RequestBody Task task) {
		service.saveTaskData(task);
		return "Task Created SUccessfully..";
	}
	
	@GetMapping("/get-all-task")
	public List<Task> getAllTask() {
		return service.getTaskData();
	}
	
	@DeleteMapping("/delete-by-id")
	public String deleteTask(@RequestParam("tid") int id) {
		service.deleteTaskData(id);
		return "Task Deleted SUccessfully...";
	}
	
	@PutMapping("/update-task/{id}/{status}")
	public String updateData(@PathVariable("id") int id,@PathVariable("status") String status) {
		service.updateTaskData(id, status);
		return "Record Updated Successfully..";
	}
}













