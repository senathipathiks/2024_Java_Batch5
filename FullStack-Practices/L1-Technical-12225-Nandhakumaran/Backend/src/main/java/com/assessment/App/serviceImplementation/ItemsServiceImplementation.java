package com.assessment.App.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.App.model.Items;
import com.assessment.App.model.Order;
import com.assessment.App.repository.ItemsRepository;
import com.assessment.App.repository.OrderRepository;
import com.assessment.App.service.ItemsService;
import com.assessment.App.service.OrderService;

@Service
public class ItemsServiceImplementation implements ItemsService {
	
    private final ItemsRepository itemsRepo;

    @Autowired
    public ItemsServiceImplementation(ItemsRepository itemsRepo) {
        this.itemsRepo = itemsRepo;
    }
    
    @Override
    public void saveItems(Items items) {
    	itemsRepo.saveI(items);
	}

	@Override
	public Items getItemsById(int id) {
		
		return itemsRepo.findIById(id);
	}

	public List<Items> getAllItemss() {

		return itemsRepo.findAllItemss();
	}

	@Override
	public void updateItems(Items items) {
		// TODO Auto-generated method stub
		
		itemsRepo.updateI(items);

	}
	
	@Override
	public void deleteItems(int id) {
		// TODO Auto-generated method stub
		itemsRepo.deleteI(id);

	}

	

}


