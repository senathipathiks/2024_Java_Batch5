package com.vicky.lifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		context.close();
	}
}
