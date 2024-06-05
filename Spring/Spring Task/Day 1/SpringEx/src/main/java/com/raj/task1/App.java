package com.raj.task1;

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
    	
 
        ApplicationContext context = new ClassPathXmlApplicationContext("task1bean.xml");
        Student s1 = (Student)context.getBean("std1");
        s1.display();       
        
        Student s2 = (Student)context.getBean("std2");
        s2.display();       
        
    	 
    }
}
