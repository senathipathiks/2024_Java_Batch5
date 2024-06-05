package com.subash.SpringEx;

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
    	//one way to create the bean by using Applicationcontext
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee e = (Employee)context.getBean("emp1");
//        e.display();
        System.out.println(e);
        
        Employee e1 = (Employee)context.getBean("emp2");
        System.out.println(e1);
        
        //another way to create the bean by using XmlBeanFactory
        ClassPathResource resource = new ClassPathResource("bean.xml");
        XmlBeanFactory contexts = new XmlBeanFactory(resource);
        
        Student s1 = (Student)contexts.getBean("stu1");
        System.out.println(s1);
        
        Student s2 = (Student)contexts.getBean("stu2");
        System.out.println(s2);
    }
}
