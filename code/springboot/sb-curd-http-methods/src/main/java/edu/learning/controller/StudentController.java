package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.bean.Student;
import edu.learning.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	// localhost:8080/save-student
	@PostMapping("/save-student")
	public String saveStd(@RequestBody Student stud) {
		service.save(stud);
		return "Student Save Successfully...";
	}
	
	// localhost:8080/get-all-students
	@GetMapping("/get-all-students")
	public List<Student> getAllStd() {
		return service.getAllStudent();
	}
	
	// localhost:8080/delete-by-id?id=333
	@DeleteMapping("/delete-by-id")
	public String deleteStud(@RequestParam("id") int id) {
		service.delete(id);
		return "Student Deleted Successfully...";
	}
	
}









