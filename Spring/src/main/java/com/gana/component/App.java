package com.gana.component;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main( String[] args )
    {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student s = (Student)context.getBean(Student.class);
        s.display();
        

        
    }
}