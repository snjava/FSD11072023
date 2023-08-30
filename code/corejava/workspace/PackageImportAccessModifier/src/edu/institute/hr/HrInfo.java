package edu.institute.hr;

import edu.institute.student.StudentInfo;

public class HrInfo extends StudentInfo {
	public void print() {
		System.out.println("Hr Info class");
	}

	
	public void getStudentDetailsByObject() {
		StudentInfo info = new StudentInfo();
		System.out.println(info.id);
		//System.out.println(info.name);
		//System.out.println(info.age);
		//System.out.println(info.contact);
	}
	
	public void getStudentDetailsByInheritance() {
		System.out.println(id);
		System.out.println(name);
		//System.out.println(age);
		//System.out.println(contact);
	}
	
	
}
