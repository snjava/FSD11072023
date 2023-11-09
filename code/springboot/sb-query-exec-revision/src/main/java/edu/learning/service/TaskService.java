package edu.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.learning.entity.Task;
import edu.learning.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository repository;
	
	public void saveTaskData(Task task) {
		repository.save(task);
	}
	
	public List<Task> getTaskData() {
		return repository.findAll();
	}
	
	public void deleteTaskData(int id) {
		repository.deleteReocrd(id);
	}
	
	public void updateTaskData(int id, String status) {
		repository.updateReocrd(id, status);
	}
}















