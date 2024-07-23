package com.day2.Task1;

import javax.naming.Context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("Task1.xml");
		
		Student s1 = (Student)con.getBean("stu");
		s1.display();
		
		System.out.println();
		
		Student s2 = (Student)con.getBean("stu1");
		s2.display();
	}

}
