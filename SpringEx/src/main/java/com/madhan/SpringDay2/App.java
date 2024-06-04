package com.madhan.SpringDay2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.madhan.SpringDay2.Student;

public class App {
	public static void main( String[] args )
    {
        ApplicationContext context = new  ClassPathXmlApplicationContext("bean3.xml");
        Student e = (Student)context.getBean("stu");
        e.setName("Arun");
        Student e1 = (Student)context.getBean("stu");
        System.out.println(e); 
        System.out.println(e1);
        if(e==e1)
        {
        	System.out.println("Equal");
        }
        else {
        	System.out.println();
        }
    }

}
