package com.day3.Try1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("Try1.xml");
		Students s = (Students)con.getBean("stu");
		s.display();
	}

}
