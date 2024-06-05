package com.subash.DependencyInjection;

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
    	//this is for scope(singleton and prototype)
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
    	Faculty s1 = (Faculty)context.getBean("fac");
    	s1.display();
    	
    }
}
