package com.day2.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Student s = (Student)context.getBean("stu");
        s.setName("Arjun");
        
        Student s1 = (Student)context.getBean("stu");
        System.out.println(s);
        System.out.println(s1);
        
        if(s == s1) {
        	System.out.println("Equal");
        }
    }
}
