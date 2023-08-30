package edu.institute.student;

public class StudentAttendance extends StudentInfo {

	public void getStudentDetailsByObject() {
		StudentInfo info = new StudentInfo();
		System.out.println(info.id);
		System.out.println(info.name);
		//System.out.println(info.age);
		System.out.println(info.contact);
	}
	
	public void getStudentDetailsByInheritance() {
		System.out.println(id);
		System.out.println(name);
		//System.out.println(age);
		System.out.println(contact);
	}
	
}
