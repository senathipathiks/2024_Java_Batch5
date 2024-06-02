package com.gopi.dependency;




import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        --System.out.println( "Hello World!" );
//    	ClassPathResource  resource = new ClassPathResource("beans3.xml");
//    	XmlBeanFactory context = new XmlBeanFactory(resource);
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
    	Student e1 = (Student)context.getBean("std");
//    	System.out.println(e1);
    	e1.display();
    	
    }
}
