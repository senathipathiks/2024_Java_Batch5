package com.vicky.Task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vicky.Task3.Config;
import com.vicky.Task3.Faculty;
import com.vicky.Task3.Subject;

public class App {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		Faculty s = (Faculty)con.getBean(Faculty.class);
		s.display();
	}
}
