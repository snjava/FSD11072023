package edu.learning.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import edu.learning.bean.Student;

@Service
public class StudentService {

	ArrayList<Student> studList = new ArrayList<Student>();
	
	public void save(Student stud) {
		studList.add(stud);
	}
	
	public ArrayList<Student> getAllStudent() {
		return studList;
	}
	
	public void delete(int id) {
		studList.remove(getById(id));
	}
	
	public Student getById(int id) {
		Student stud = null;
		for(Student s : studList) {
			if(s.getId() == id) {
				stud = s;
				break;
			}
		}
		return stud;
	}
}
