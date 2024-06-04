package com.gana.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
        Student s = (Student)context.getBean("stu");
        s.display();
        

        
    }
}