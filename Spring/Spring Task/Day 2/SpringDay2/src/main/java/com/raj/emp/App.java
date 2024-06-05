package com.raj.emp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args )
    {
    	
 
        ApplicationContext context = new ClassPathXmlApplicationContext("task2bean.xml");
        Employee s1 = (Employee)context.getBean("emp1");
        s1.display();       
        
        Employee s2 = (Employee)context.getBean("emp2");
        s2.display();       
        
    	 
    }
}
