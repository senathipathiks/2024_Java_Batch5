package com.assessment.App.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.assessment.App.model.Items;
import com.assessment.App.model.Order;

import jakarta.transaction.Transactional;

@Repository
public interface ItemsRepository {
	
	 Items findIById(int id);
	    void saveI(Items items);
	    void deleteI(int id);
	    void updateI(Items items);
		List<Items> findAllItemss(); 
    
}
