package com.day2.DependancyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[]) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DepInjectionBeans.xml");
		Student stud = (Student)context.getBean("stu");
		stud.display();
	}
}
