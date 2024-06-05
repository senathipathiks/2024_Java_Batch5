package com.raj.Scope;

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
    	
    	// Two ways to create Bean
    	
//    	ClassPathResource resource  = new ClassPathResource("beans.xml");
//    	XmlBeanFactory context = new XmlBeanFactory(resource);
//    	Student e = (Student)context.getBean("emp");
//    	 System.out.println(e);
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        Student s1 = (Student)context.getBean("std");
        s1.setStudent_name("subash");
        Student s2 = (Student)context.getBean("std");
        System.out.println(s1);
        System.out.println(s2);
        
        if(s1==s2) {
        	System.out.println("Object Reference are Equal!");
        }else {
        	System.out.println("Object Reference are Not Equal!");
        }
    	 
    }
}
