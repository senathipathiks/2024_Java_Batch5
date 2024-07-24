package com.nandha.SpringEx;

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
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

ClassPathResource resource = new ClassPathResource("beans.xml");
XmlBeanFactory context = new XmlBeanFactory(resource);
        
        
        Student s = (Student)context.getBean("stu");
        Student s1 = (Student)context.getBean("stu1");
        Employee e = (Employee)context.getBean("emp");

        System.out.println(s);
        s.display();
        
        System.out.println(s1);
        s1.display();
        
        System.out.println(e);
        e.display();
    }
}
