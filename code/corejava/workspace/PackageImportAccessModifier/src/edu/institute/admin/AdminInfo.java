package edu.institute.admin;
import edu.institute.student.StudentInfo;
import edu.institute.hr.*;
import java.lang.*;
public class AdminInfo {
	public void printStudent() {
		//edu.institute.student.StudentInfo info = new edu.institute.student.StudentInfo();
		StudentInfo info = new StudentInfo();
		info.print();
		
		HrInfo hr = new HrInfo();
		
		String s = "Abc";
		System.out.println(s);
		
	}
}

class StudentPlacementChecks {
	StudentInfo info = new StudentInfo();
	
}
