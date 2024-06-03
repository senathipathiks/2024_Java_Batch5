package com.aravind.annoconfig;

import org.springframework.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(Config.class); 
        Student s = (Student) c.getBean("stu");
//        s.setSname("Prabha");
//        Student s1 = (Student) c.getBean("stu");
        s.display();
//        s1.display();
     
        
        
    }
}
