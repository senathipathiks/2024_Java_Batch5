package com.assessment.App.repositoryImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assessment.App.model.Items;
import com.assessment.App.model.Order;
import com.assessment.App.repository.ItemsRepository;
import com.assessment.App.repository.OrderRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ItemsRepositoryImplementation implements ItemsRepository {
	
	@Autowired
	EntityManager eManager;
	
	@Override
	public void saveI(Items items) {
		// TODO Auto-generated method stub
		eManager.persist(items);
	}
	@Override
	public List<Items> findAllItemss() {
		String hql = "from Items";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
	}
	@Override
	public Items findIById(int id) {
		// TODO Auto-generated method stub
		return eManager.find(Items.class, id);
	}
	@Override
	public void updateI(Items items) {
		// TODO Auto-generated method stub
		eManager.merge(items);
	}
	@Override
	public void deleteI(int id) {
		Items itemsToDelete = findIById(id);
	    if (itemsToDelete != null) {
	        eManager.remove(itemsToDelete);
	    }
}
	

}
