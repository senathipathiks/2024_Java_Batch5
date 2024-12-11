package com.spring.Scope;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
//    	ClassPathResource resource = new ClassPathResource("beans1.xml");
//        XmlBeanFactory context = new XmlBeanFactory(resource);
        Student student = (Student)context.getBean("std");
        System.out.println(student);        
        
        
        Student s = (Student)context.getBean("std1");
        if(student == s) {
        	System.out.println("Objects are equal");
        	
        }
        else {
        	
        	System.out.println("Not equal");
        }
        
        System.out.println(s);
        System.out.println(student);
    
    }
}