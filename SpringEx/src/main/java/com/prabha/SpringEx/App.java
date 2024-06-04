package com.prabha.SpringEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee e = (Employee)context.getBean("emp");
//        e.display();
        System.out.println(e);
        
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans2.xml");
        Student s1 = (Student)context1.getBean("stud");
        System.out.println(s1);
        
        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        Student s2 = (Student)context2.getBean("s2");
        System.out.println(s2);
        
    }
}
