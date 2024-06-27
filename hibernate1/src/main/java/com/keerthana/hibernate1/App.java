package com.keerthana.hibernate1;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
//        Student s1=new Student(12227,"Keerthana","Madurai");
//      session.save(s1);
//    tx.commit();
//        Student s2=new Student(12213,"Giri","Madurai");
//      session.save(s2);
////    tx.commit(); (add)
//        Student s3=session.find(Student.class, 12213);
//        System.out.println(s3);(search)
//        Student s2=session.find(Student.class, 12213);
//        s2.setCity("floridaaaa");
//         session.update(s2);
//        tx.commit();
//System.out.println(s2);(update)
//        ArrayList<Student> list=(ArrayList)session.createQuery("From Student").list();
//        for(Student student:list) {
//        	System.out.println(student);(view all)
//        	  Student s3=session.find(Student.class, 12213);
//          System.out.println(s3);
//        	  Student s2=session.find(Student.class, 12213);
//             session.delete(s2);
//            tx.commit();(delete)
        
        
        
//        Student s4=new Student(12224,"Subbu","Madelanagar");
//    session.save(s4);
//  tx.commit();
//  System.out.println(s4);
//  Student s5=new Student(12213,"Giri","Florida");
//session.save(s5);
//tx.commit();
//System.out.println(s5);

//Student s6=new Student(12215,"Srinath","vellakulam");
//session.save(s6);
//tx.commit();
//System.out.println(s6);
        
//       
//	  Student s2=session.find(Student.class, 12215);
//      session.delete(s2);
//     tx.commit();
        
        
  
     Student s5 = session.find(Student.class, 12224);  //find
     if(s5 !=null) {
     	session.delete(s5);            // delete
     	System.out.println("record delete");
     } else {
     	System.out.println("No records found");
     }
        	tx.commit();
        }
        
    }
