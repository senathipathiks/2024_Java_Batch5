package com.day3.confbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		Student stu = (Student)con.getBean("stu");
		stu.display();
	}
}
