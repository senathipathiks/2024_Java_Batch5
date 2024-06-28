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

import com.vickee.restapp.model.Dealer;
import com.vickee.restapp.serviceimpl.DealerServiceImpl;

@RestController
@RequestMapping("/dealer")
@CrossOrigin("*")
public class DealerController {
	
	@Autowired
	DealerServiceImpl service;
	
	@PostMapping
	public void addDealer(@RequestBody Dealer dealer) {
		service.addDealer(dealer);
	}
	
	@GetMapping("{id}")
	public Dealer getDealer(@PathVariable int id)
	{
		return service.getDealer(id);
	}
	
	@GetMapping("/alldealer")
	public List<Dealer> getAllDealer()
	{
		return service.getAllDealer();
	}
	
	@PutMapping
	public void updateDealer(@RequestBody Dealer dealer)
	{
		service.updateDealer(dealer);
	}
	@DeleteMapping("{id}")
	public void deleteShopKeeper(@PathVariable int id) {
		service.deleteDealer(id);
	}
	@GetMapping("/oidList")
	public List<Integer> getAllOids()
	{
		return service.getAllOids();
	}
	
}
