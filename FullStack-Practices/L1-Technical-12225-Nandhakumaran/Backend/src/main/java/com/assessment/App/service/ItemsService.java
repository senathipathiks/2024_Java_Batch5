package com.assessment.App.service;


import java.util.List;

import com.assessment.App.model.Items;


public interface ItemsService {

Items getItemsById(int id);
    void saveItems(Items items);
    void deleteItems(int id);
    void updateItems(Items items);
	List<Items> getAllItemss(); 

}
