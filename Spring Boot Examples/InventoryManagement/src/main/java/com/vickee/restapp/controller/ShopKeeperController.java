package com.vickee.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.ShopKeeper;
import com.vickee.restapp.serviceimpl.ShopKeeperServiceImpl;

@RestController
@RequestMapping("/shopkeeper")
@CrossOrigin("*")
public class ShopKeeperController {
	
	@Autowired
	ShopKeeperServiceImpl service;
	
	@PostMapping
	public void addShopKeeper(@RequestBody ShopKeeper shop) {
		service.addShopKeeper(shop);
	}
	@GetMapping("{id}")
	public ShopKeeper getShopKeeper(@PathVariable int id) {
		return service.getShopKeeper(id);
	}
	@GetMapping("/allshopkeeper")
	public List<ShopKeeper> getAllShopKeeper(){
		return service.getAllShopKeeper();
	}
	@DeleteMapping("{id}")
	public void deleteShopKeeper(@PathVariable int id) {
		service.deleteShopKeeper(id);
	}
	@PutMapping
	public void updateShopKeeper(@RequestBody ShopKeeper shop)
	{
		service.updateShopKeeper(shop);
	}
}
