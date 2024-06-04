package com.madhan.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.madhan.autowired.Student;
import com.madhan.componentscan.Config;

public class App {
	public static void main( String[] args )
    {
		 AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(Config.class);
	        Student e = (Student)context.getBean(Student.class);
	       System.out.println(e);
    }
}

