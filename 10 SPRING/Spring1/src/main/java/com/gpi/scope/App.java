package com.gpi.scope;




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
    	ClassPathResource  resource = new ClassPathResource("beans2.xml");
    	XmlBeanFactory context = new XmlBeanFactory(resource);
    	Student s1 = (Student)context.getBean("std");
    	s1.setStdName("Arun");
//    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Student e = (Student)context.getBean("std");
    	System.out.println(e);
    	System.out.println(s1);
    	if(e.getStdName()==s1.getStdName()) {
    		System.out.println("Equal");
    	}
    	else {
    		System.out.println("NO");
    	}
    	
    }
}
