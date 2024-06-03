package com.aravind.LapSpecfic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("Spec.xml");
		Laptop l = (Laptop)c.getBean("lap");
		System.out.println(l);
		
	

	}

}
