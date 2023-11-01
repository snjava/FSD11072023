package edu.learning.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.bean.StudentBean;
import edu.learning.service.StudentService;

@CrossOrigin("*")
@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	// localhost:8080/save-student
	@PostMapping("/save-student")
	public String saveStudent(@RequestBody StudentBean bean) {
		service.add(bean);
		return "Student Save Successfully...";
	}
	
	// localhost:8080/get-all-students
	@GetMapping("/get-all-students")
	public ArrayList<StudentBean> getAllStudent() {
		return service.getAllStudent();
	}
}





