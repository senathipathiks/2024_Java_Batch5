package com.subash.dependency;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
    	Student s1 = (Student)context.getBean("stu1");
    	s1.display();
    	
    }
}
