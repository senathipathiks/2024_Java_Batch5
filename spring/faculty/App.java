package com.spring.faculty;

import javax.naming.Context;
import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String args[]) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	Faculty s = (Faculty)context.getBean(Faculty.class);
    s.disp();

    }
}
