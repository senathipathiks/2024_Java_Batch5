package com.prabha.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prabha.SpringEx.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");
		Student e1 = (Student) context.getBean("st");
		e1.display();

	}
}
