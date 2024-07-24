package com.aravind.sonar.repositoryimpl;

import java.util.List;



import org.springframework.stereotype.Repository;

import com.aravind.sonar.model.Product;
import com.aravind.sonar.repository.ProductRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductRepoImpl implements ProductRepo {
	
	
	EntityManager em;
	
	
	public ProductRepoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	
	public void save(Product product) {
		em.merge(product);
		
	}

	
	public List<Product> findAllProducts() {
		String hql = "from Product";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	
	public void update(Product product) {
		em.merge(product);
		
	}
	
	
	public Product findById(int pid) {
		return em.find(Product.class, pid);
	}


	
	public void delete(int pid) {
	    Product id = em.find(Product.class, pid);
		em.remove(id);
	}


	

}
