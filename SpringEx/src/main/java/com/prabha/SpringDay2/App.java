package com.prabha.SpringDay2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prabha.SpringEx.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        Students e1 = (Students)context.getBean("students");
        e1.setStudentname("ghram");
        System.out.println(e1);
        Students e2 = (Students)context.getBean("students");
        System.out.println(e2);
        if(e1==e2) {
        	System.out.println("equal");
        }
        else {
        	System.out.println("Not equal");

        }

	}

}
