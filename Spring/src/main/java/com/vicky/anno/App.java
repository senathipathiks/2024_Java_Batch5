package com.vicky.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vicky.autowired.Student;

public class App {
	public static void main(String args[]) {
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		Student s = (Student)con.getBean(Student.class);
		s.display();
		
	}
}

