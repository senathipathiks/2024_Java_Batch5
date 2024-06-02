package com.gopi.Spring1;




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
    	ClassPathResource  resource = new ClassPathResource("beans.xml");
    	XmlBeanFactory context = new XmlBeanFactory(resource);
    	
//    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Employee e = (Employee)context.getBean("emp");
    	System.out.println(e);
    	
    	Student s = (Student)context.getBean("std");
    	System.out.println(s);
    	
    	Student s1 = (Student)context.getBean("std1");
    	System.out.println(s1);
    	
    }
}
