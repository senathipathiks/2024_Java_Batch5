package com.day4.Laptop_Specs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
        
        Laptop L = (Laptop)con.getBean(Laptop.class);
        L.display();
    }
}
