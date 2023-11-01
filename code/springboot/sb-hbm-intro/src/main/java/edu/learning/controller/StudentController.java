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

import edu.learning.bean.Student;
import edu.learning.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository repository;
	
	@PostMapping("/save-student-info")
	public String saveStudent(@RequestBody Student student) {
		repository.save(student);
		return "Student Save Successfully..";
	}
	
	@GetMapping("/get-student-info")
	public List<Student> getAllStudents() {
		return repository.findAll();
	}
	
	@GetMapping("/get-student-by-id")
	public Student getStudentById(@RequestParam("id") int id) {
		return repository.findById(id).get();
	}

	@DeleteMapping("/delete-by-id/{id}")
	public String deleteStudentById(@PathVariable("id") int id) {
		repository.deleteById(id);
		return "Student Deleted Successfully..";
	}
	
	@PutMapping("/update-student-info")
	public String updateData(@RequestBody Student student) {
		repository.save(student);
		return "Data Updated Successfully..";
	}
	
}













