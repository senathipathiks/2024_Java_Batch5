package com.spring.Project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String args[]) {
		 

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee employee = (Employee)context.getBean(Employee.class);
	    employee.display();
	}
	
}
