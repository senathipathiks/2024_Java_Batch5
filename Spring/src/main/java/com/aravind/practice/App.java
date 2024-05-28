package com.aravind.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
		Student s = (Student)context.getBean("stud");
		Student s1 = (Student)context.getBean("stud1");
		s.display();
		s1.display();
		
	}

}
