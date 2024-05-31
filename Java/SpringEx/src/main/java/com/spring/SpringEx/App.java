package com.spring.SpringEx;

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
        System.out.println(e);
        
        Student s = (Student)context.getBean("stu");
        System.out.println(s);
    }
}
