package com.gana.task;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main( String[] args )
    {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Employee s = (Employee)context.getBean(Employee.class);
        s.display();
        

        
    }
}