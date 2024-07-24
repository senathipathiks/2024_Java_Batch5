package com.nandha.Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		Student e1 = (Student)context.getBean("stu1");
		
		e1.setStuName("Nandha");

		
		Student e2 = (Student)context.getBean("stu2");
		
		System.out.println(e1);
		System.out.println(e2);

		if(e1 == e2) {
			System.out.println("Values are Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}

}
