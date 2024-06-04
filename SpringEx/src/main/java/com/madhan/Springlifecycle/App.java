package com.madhan.Springlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[]args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(" ");
		context.close();
	}

}
