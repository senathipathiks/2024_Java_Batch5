package com.karthi.LaptopEx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Laptop laptop = (Laptop)context.getBean(Laptop.class);
		laptop.display();
	}
	
}