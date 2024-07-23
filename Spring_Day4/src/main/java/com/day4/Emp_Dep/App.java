package com.day4.Emp_Dep;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
        
        Employee E = (Employee)con.getBean(Employee.class);
        E.display();
    }
}
