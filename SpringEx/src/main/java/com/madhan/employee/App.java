package com.madhan.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App {
	public static void main( String[] args )
    {
		 AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(Config.class);
	        Employee e = (Employee.getBean(Employee.class);
	       System.out.println(e); 
        
        
    }
}
