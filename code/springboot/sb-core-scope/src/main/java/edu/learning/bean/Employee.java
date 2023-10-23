package edu.learning.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Employee {
	public Employee() {
		System.out.println("Employee Object is Created....");
	}
}
