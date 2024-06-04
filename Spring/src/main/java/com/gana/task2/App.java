package com.gana.task2;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main( String[] args )
    {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Faculty s = (Faculty)context.getBean(Faculty.class);
        s.display();
        

        
    }
}