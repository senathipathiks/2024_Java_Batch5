package com.aravind.componentAutowired;

import org.springframework.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(Config.class); 
        Student s = (Student) c.getBean(Student.class);
        
        s.display();
       
        
        
    }
}
