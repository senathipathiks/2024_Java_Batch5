package com.madhan.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.madhan.dependency.Student;

public class App {
	public static void main( String[] args )
    {
        ApplicationContext context = new  ClassPathXmlApplicationContext("bean5.xml");
        Student e = (Student)context.getBean("stu");
       
        e.display();
    }
}

