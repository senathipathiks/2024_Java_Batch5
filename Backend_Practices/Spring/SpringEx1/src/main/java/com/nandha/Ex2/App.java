package com.nandha.Ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee e = (Employee)context.getBean(Employee.class);
		e.display();

	}

}
