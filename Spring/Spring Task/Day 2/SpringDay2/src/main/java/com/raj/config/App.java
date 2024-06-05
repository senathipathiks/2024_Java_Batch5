package com.raj.config;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args )
    {
    	
 
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student s1 = (Student)context.getBean("std1");
        s1.display();            
        
    	 
    }
}
