package com.subash.LaptopAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	Laptop s1 = (Laptop)context.getBean(Laptop.class);
    	s1.display();

	}

}
