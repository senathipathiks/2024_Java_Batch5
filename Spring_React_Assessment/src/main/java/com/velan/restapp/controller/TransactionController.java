package com.velan.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velan.restapp.model.Transaction;
import com.velan.restapp.serviceimp.TransactionServiceImp;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/transaction")
@CrossOrigin("http://localhost:3000")
public class TransactionController {

	@Autowired
	TransactionServiceImp service;
	
	static final String SUCESS="Success";
	static final String FAILURE="Failure";

	@PostMapping
	public String insertTransaction(@RequestBody Transaction trans) {
		String msg = "";

		try {
			service.addTransaction(trans);
			msg = SUCESS;
		}

		catch (Exception e) {
			msg = FAILURE;
		}
		return msg;
	}

	@GetMapping("{id}")
	public Transaction getTransactionById(@PathVariable("id") int id) {

		return service.getTransaction(id);

	}

	@GetMapping("/all")
	public List<Transaction> getTransaction() {
		return service.getAllTransactions();
	}
	
	@PutMapping()
	public String updateTransaction(@RequestBody Transaction trans) {
		String msg = "";

		try {
			service.updateTransaction(trans);
			msg = SUCESS;
		}

		catch (Exception e) {
			msg = FAILURE;
		}
		return msg;
	}
	
	@DeleteMapping("{id}")
	public String deleteTransactionById(@PathVariable("id")int id) {
		String msg="";
		try {
			service.deleteTransaction(id);
			msg=SUCESS;
		} 
		
		catch (Exception e) {
			msg=FAILURE;
		}
		return msg;
	}
	
	@GetMapping("/idlist")
	public List<Integer> getIdList() {
		
		return service.getAllId();
	}
 
}
