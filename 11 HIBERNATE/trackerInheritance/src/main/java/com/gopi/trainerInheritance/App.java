package com.gopi.trainerInheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Trainer tr = new Trainer(122,"Gopi","VNR");
        Technical tc = new Technical(132,"Sena","Com","java","M.tech");
        Behaviour bh = new Behaviour(142,"Rajesh","Madurai","Communication","MSC");
        Java jv = new Java (12,"Valan","channai","Java","M.tech","80hr",40000);
        Dotnet dt = new Dotnet (15,"sena","channai","Dotnet","M.tech","70hr",50000);
        
        session.save(tr);
        session.save(tc);
        session.save(bh);
        session.save(jv);
        session.save(dt);
        tx.commit();
    }
}
