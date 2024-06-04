package com.gana.Scope;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        
        Student s3 = (Student)context.getBean("stu");
        s3.setStudname("Arun");
        
        Student s4 = (Student)context.getBean("stu");
        System.out.println(s3);
        System.out.println(s4);
        if(s3 == s4)
        {
        	System.out.println("equal");
        }
    }
}
