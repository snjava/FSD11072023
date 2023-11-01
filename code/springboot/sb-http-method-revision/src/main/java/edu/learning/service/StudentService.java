package edu.learning.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import edu.learning.bean.StudentBean;

@Service
public class StudentService {
	private ArrayList<StudentBean> students = new ArrayList<StudentBean>();
	
	public void add(StudentBean bean) {
		students.add(bean);
	}
	
	public ArrayList<StudentBean> getAllStudent() {
		return students;
	}
	
}
