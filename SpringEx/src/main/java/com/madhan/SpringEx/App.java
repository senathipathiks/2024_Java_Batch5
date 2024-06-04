package com.madhan.SpringEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
        Employee e = (Employee)context.getBean("emp");
        System.out.println(e);
        
        ApplicationContext context2 = new  ClassPathXmlApplicationContext("bean2.xml");
        Student s = (Student)context2.getBean("s123");
        System.out.println(s);
    }
}
