package com.srienath.dependency1;


import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class App {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanDep2.xml");
	
	Student stud1= (Student)context.getBean("stud1");
 
	stud1.display();
	}
}
 