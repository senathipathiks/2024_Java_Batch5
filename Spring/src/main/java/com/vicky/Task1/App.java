package com.vicky.Task1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	public static void main(String args[]) {
		  ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("beans2.xml");
	      Student e = (Student)context.getBean("stu");
	      e.display();  
	      context.close();
		}
	}
