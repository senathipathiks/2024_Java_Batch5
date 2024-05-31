package com.day3.Task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		
		People p = (People)con.getBean(People.class);
		System.out.println(p);
	}

}
