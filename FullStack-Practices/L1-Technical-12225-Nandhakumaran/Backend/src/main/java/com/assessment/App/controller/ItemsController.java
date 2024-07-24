package com.assessment.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.assessment.App.model.Items;
import com.assessment.App.model.Order;
import com.assessment.App.service.ItemsService;
import com.assessment.App.service.OrderService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @GetMapping("/all")
    public List<Items> getAllItemss() {
		return itemsService.getAllItemss();
       
    }

    @GetMapping("/{id}")
    public Items getItemsById(@PathVariable int id) {
        return itemsService.getItemsById(id);
    }

    @PostMapping
    public void addItems(@RequestBody Items items) {
    	itemsService.saveItems(items);
    }

    @PutMapping("/{id}")
    public void updateItems(@RequestBody Items items) {
    	itemsService.updateItems(items);
    }

    @DeleteMapping("/{id}")
    public void deleteItems(@PathVariable("id") int id) {
        itemsService.deleteItems(id);
    }
}

