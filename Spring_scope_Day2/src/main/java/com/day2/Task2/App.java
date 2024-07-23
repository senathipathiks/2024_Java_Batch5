package com.day2.Task2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("Task2.xml");
		Employee e = (Employee)con.getBean("emp");
		System.out.println(e);
	}

}
