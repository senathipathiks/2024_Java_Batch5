package com.nandha.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
//		Student e = (Student)context.getBean("stud");
//		Address a = (Address)context.getBean("add1");
//		
//		e.setStuId(111);
//		
//		a.setDoorNo(86);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student e = (Student)context.getBean("student1");
//		Student e = (Student)context.getBean(Student.class);
		e.display();
	}

}
