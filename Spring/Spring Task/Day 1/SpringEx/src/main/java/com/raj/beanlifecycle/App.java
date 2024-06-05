package com.raj.beanlifecycle;

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

    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        context.close();
    	 
    }
}
