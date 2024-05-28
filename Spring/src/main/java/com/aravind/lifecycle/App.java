package com.aravind.lifecycle;
import org.springframework.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args )
    {
        
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("beans3.xml"); 
        c.close(); // then only it goes into destroy method
        
        
        
    }
}
