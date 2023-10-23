package edu.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.learning.bean.Employee;

@SpringBootApplication
public class SbCoreScopeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbCoreScopeApplication.class, args);
		
		Employee e1 = ctx.getBean(Employee.class);
		Employee e2 = ctx.getBean(Employee.class);
		Employee e3 = ctx.getBean(Employee.class);
		Employee e4 = ctx.getBean(Employee.class);
		Employee e5 = ctx.getBean(Employee.class);
		Employee e6 = ctx.getBean(Employee.class);
	}

}
