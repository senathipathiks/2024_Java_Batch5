rpackage com.manytoone;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String args[]) {
		Configuration cfg = new Configuration().configure("manytoone.cfg.xml");
		SessionFactory sf =cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Brands b1 = new Brands();
		b1.setBrand_name("Realme");
		
		Models m1 = new Models();
		Models m2 = new Models();
		
		ArrayList<Models> list1 = new ArrayList<Models>();
		m1.setModel_name("Realme 3 Pro");
		m1.setPrice(14000);
		
		ArrayList<Models> list2 = new ArrayList<Models>();
		m2.setModel_name("Realme X");
		m2.setPrice(17000);
		
		list1.add(m1);
		list2.add(m2);
		
		b1.setModels(list1);
		b1.setModels(list2);
		
		s.save(b1);
		s.save(m1);
		s.save(m2);
		
		tx.commit();
	}
}