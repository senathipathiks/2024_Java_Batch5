package com.shp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MeetUtil {
	public static Session OpenSession() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}

}
