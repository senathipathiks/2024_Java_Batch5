package com.gopi.associationHiberMain;

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
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        User user=new User();
		User user2=new User();
		user2.setUserName("Dev");
		user.setUserName("Ankit");
		
		Address address= new Address();
		address.setStreet("sector 15");
		address.setCity("noida");
		Address address2=new Address();
		address2.setCity("Muzaffarpur");
		address2.setStreet("sahebganj");
		
		
		Vehicle veh=new Vehicle();
		veh.setVehicheName("car");
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicheName("jeep");
		Vehicle vehicle2= new Vehicle();
		vehicle2.setVehicheName("Bike");
		Vehicle vehicle3= new Vehicle();
		vehicle3.setVehicheName("Bus");
		Vehicle vehicle4=new Vehicle();
		vehicle4.setVehicheName("cycle");
		Vehicle vehicle5= new Vehicle();
		vehicle5.setVehicheName("Truck");
		
		java.util.List<Mobile> list1 = new ArrayList<Mobile>();
		java.util.List<Vehicle> list2 = new ArrayList<Vehicle>();
		Mobile mobile =new Mobile();
		mobile.setBrand("sony");
		mobile.setModel("xperia z3");
		Mobile mobile2 = new Mobile();
		mobile2.setBrand("Redmi");
		mobile2.setModel("Note 5 pro");
		Mobile mobile3 = new Mobile();
		mobile3.setBrand("Nokia");
		mobile3.setModel("7 plus");
		
		user.setAddress(address);
		user2.setAddress(address2);

		
		list1.add(mobile);
		list1.add(mobile2);
		list1.add(mobile3);

		
		list2.add(veh);
		list2.add(vehicle);
		list2.add(vehicle2);

		list2.add(vehicle3);
		list2.add(vehicle4);
		list2.add(vehicle5);

		user2.setAddress(address);
		user2.setAddress(address2);
		user.setMobile(list1);
		user.setVehicle(list2);


		session.save(user);
		session.save(user2);
		tx.commit();
		session.close();
    }
}
