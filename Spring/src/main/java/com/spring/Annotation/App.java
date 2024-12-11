package com.spring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {

	public static void main(String args[]) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
		Student s = (Student)context.getBean("stu");
		s.disp();
	}	
}
