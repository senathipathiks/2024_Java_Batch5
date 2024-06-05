package com.srienath.constructorArg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanConArg.xml");
	
	Student stud1= (Student)context.getBean("stud1");
 
	System.out.println(stud1);
	}
}
