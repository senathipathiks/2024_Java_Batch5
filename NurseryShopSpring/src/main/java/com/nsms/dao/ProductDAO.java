package com.nsms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.nsms.bean.Product;
import com.nsms.util.ProductUtil;

@Component
public class ProductDAO {
	public int insertStudent(Product prod)
	{
		int n = 0;
		Session session = ProductUtil.openSession();
		Transaction t = session.beginTransaction();
		n=(int) session.save(prod);
		t.commit();
		session.close();
		return n;
	}

	public List<Integer> idList() {
		Session session = ProductUtil.openSession();
		Transaction t = session.beginTransaction();
		
		Query query = session.createQuery("select prodID from Product");
		List<Integer> idList = query.list();
		t.commit();
		session.close();
		return idList;
	}
	
	public void deleteStudent(Product prod) {
		Session session = ProductUtil.openSession();
		Transaction t = session.beginTransaction();
		session.delete(prod);
		t.commit();
		session.close();
	}

	public Product fetchOne(int id) {
		Session session = ProductUtil.openSession();
		Transaction t = session.beginTransaction();
		Product prod = session.find(Product.class,id);
		t.commit();
		session.close();
		return prod;
	}
	
	public void updateStudent(Product prod) {
		Session session=ProductUtil.openSession();
		Transaction t=session.beginTransaction();
		session.update(prod);
		t.commit();
		session.close();
		
	}

	public List<Product> fetchAll() {
		Session session=ProductUtil.openSession();
		Transaction t=session.beginTransaction();
		List<Product> prodlist = session.createQuery("From Product").list();
		session.close();
		return prodlist;
	}
	
public List<String> nameList(){
		
		Session session = ProductUtil.openSession();
		Transaction t = session.beginTransaction();
		
		Query query = session.createQuery("select prodName from Product");
		List<String> nameList = query.list();
		t.commit();
		session.close();
		return nameList;
	}

public Product fetchName(String name) {
	Session session = ProductUtil.openSession();
	Query query=session.createQuery("from Product where prodName=?1");
	query.setParameter(1, name);
	Product prod = (Product) query.getSingleResult();
	return prod;
}

}

