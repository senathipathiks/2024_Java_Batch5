package com.nandha.Ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nandha.Ex3.Config;
import com.nandha.Ex3.Laptop;

public class App {
	
	public static void main(String[] args) {
	
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	Laptop e = (Laptop)context.getBean(Laptop.class);
	e.display();
	}

}
