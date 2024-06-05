package com.ani.SpringBootEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
        Employees e = (Employees)context.getBean("emp");
        System.out.println(e);
    }
}
