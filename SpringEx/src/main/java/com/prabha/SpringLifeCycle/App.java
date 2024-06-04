package com.prabha.SpringLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
    	context.close();
    	
	}

}
