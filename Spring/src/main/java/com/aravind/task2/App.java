package com.aravind.task2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");
		Employee e = (Employee)context.getBean("emp");
		Employee e1 = (Employee)context.getBean("emp1");
		e.display();
		e1.display();
		
	}

}
