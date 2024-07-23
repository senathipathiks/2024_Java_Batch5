package com.day4.Faculty_Subject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
        
        Faculty f = (Faculty)con.getBean(Faculty.class);
        System.out.println(f);
    }
}
