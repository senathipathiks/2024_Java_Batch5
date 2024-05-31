package com.spring.project1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.project.*;


public class App {

	public static void main(String args[]) {
		 
		 
//		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
//		 Student std = (Student)context.getBean("stud");
////		 Address address = (Address)context.getBean("addr");
//		 std.disp();	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee employee = (Employee)context.getBean(Employee.class);
	    employee.display();
	}
	
}
