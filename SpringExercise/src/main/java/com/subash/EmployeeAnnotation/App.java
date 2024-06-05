package com.subash.EmployeeAnnotation;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
//    	ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
//    	Student s1 = context.getBean("stu1",Student.class);
//    	s1.display();
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	Employee s1 = context.getBean(Employee.class);
    	s1.display();
    }
}
