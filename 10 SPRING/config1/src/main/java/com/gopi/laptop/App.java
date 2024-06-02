package com.gopi.laptop;



import com.gopi.laptop.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//    	Student e1 = (Student)context.getBean("std");
    	Laptop e1 = (Laptop)context.getBean(Laptop.class);
    	System.out.println(e1);

    	
    }
}
