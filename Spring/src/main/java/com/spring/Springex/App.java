package com.spring.Springex;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	ClassPathResource resource = new ClassPathResource("beans.xml");
        XmlBeanFactory context = new XmlBeanFactory(resource);
        Employee e = (Employee)context.getBean("emp");
        System.out.println(e);        
        
        
        Student s = (Student)context.getBean("std");
        System.out.println(s); 
    
    }
}
