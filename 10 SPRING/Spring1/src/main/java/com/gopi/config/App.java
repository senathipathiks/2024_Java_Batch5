package com.gopi.config;



import com.gopi.config.Student;
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
    	Student e1 = (Student)context.getBean("std");
//    	Student e1 = (Student)context.getBean("Student.class");
    	System.out.println(e1);

    	
    }
}
