package com.annotation.component;

import javax.naming.Context;
import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String args[]) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	Student s = (Student)context.getBean(Student.class);
    s.disp();
//    Student s1 = (Student)context.getBean(Student.class);
//    if(s1==s) {
//    	System.out.println("equal");
//    }
//    else {
//		System.out.println("Not equal");
//	}
    }
}
