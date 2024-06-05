package com.ani.emp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(Config.class);
		Emp e = (Emp)c.getBean(Emp.class);
		e.display();
	}

}
	