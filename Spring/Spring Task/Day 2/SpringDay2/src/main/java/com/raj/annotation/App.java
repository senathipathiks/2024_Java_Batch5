package com.raj.annotation;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student s1 = (Student)context.getBean("std2");
        s1.display();
  
 

        
    	 
    }
}
