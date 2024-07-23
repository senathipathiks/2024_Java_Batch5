package com.day3.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[]) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");
		Student stud = (Student)context.getBean("stu");
		stud.display();
	}
}
