package com.annotation.config;

import javax.naming.Context;
import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String args[]) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	Student s = (Student)context.getBean("std");
    s.disp();
    }
}
