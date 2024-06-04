package com.gana.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        context.close();

        
    }
}