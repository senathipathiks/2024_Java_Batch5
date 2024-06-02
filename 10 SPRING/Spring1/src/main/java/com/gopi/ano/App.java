package com.gopi.ano;




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

    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans7.xml");
    	Student e1 = (Student)context.getBean("std");
    	System.out.println(e1);

    	
    }
}
