package com.karthi.EmployeeEx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee employee = (Employee)context.getBean(Employee.class);
	    employee.display();
	}
	
}