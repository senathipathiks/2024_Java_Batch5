package com.gana.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gana.autowired.Address;

public class App {
	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
        Student s1 = (Student)context.getBean(Student.class);
        s1.display();
        

        
    }
}