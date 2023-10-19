package edu.learning.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import edu.learning.config.DBConnectionConfig;

@Component
public class StudentInfo {
	
	@Autowired  // Is use to Inject the Object of one class into another class which a Dependency Injection (DI) process 
	@Qualifier("oracleConn") // use to specify the object to be injected.
	DBConnectionConfig abc; // HAS-A relation (StudentInfo HAS-A DBConfiguration)
	
	public StudentInfo() {
		System.out.println("StudentInfo Object Created");
	}
	public void print() {
		System.out.println("This is Test method from StudentInfo");
	}
	
	public void saveStudentData() {
		System.out.println("Save Student Information....");
	}
}




