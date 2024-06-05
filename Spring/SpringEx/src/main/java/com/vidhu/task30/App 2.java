package com.vidhu.task30;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(Config.class);
		//Faculty f = (Faculty)c.getBean("fac");
		//AnnotationConfigApplicationContext c1 = new AnnotationConfigApplicationContext(Config.class);
		Faculty f1 = (Faculty)c.getBean("facu");
		//System.out.println(f);
		System.out.println(f1);
	}
}
