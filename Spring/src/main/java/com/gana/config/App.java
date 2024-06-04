package com.gana.config;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
	public static void main( String[] args )
    {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student s = (Student)context.getBean("stu");
        s.display();
        

        
    }
}