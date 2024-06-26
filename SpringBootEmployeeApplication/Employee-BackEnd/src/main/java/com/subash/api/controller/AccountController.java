package com.subash.api.controller;

import java.util.List;
import java.util.Optional;

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

import com.subash.api.model.Account;
import com.subash.api.model.Employee;
import com.subash.api.model.Payroll;
import com.subash.api.repository.EmployeeRepo;
import com.subash.api.repository.PayrollRepo;
import com.subash.api.serviceImpl.AccountServiceImpl;
import com.subash.api.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/account")
@CrossOrigin("*")
public class AccountController {

	@Autowired
	AccountServiceImpl service;

	@PostMapping
	public String insertAccount(@RequestBody Account account) {
		String msg = "";

		try {

			
			System.out.println(account);
			service.addAccount(account);
			msg = "Success";

		} catch (Exception e) {
			msg = "failure";
		}
		return msg;
		 
	        
	}

	@PutMapping
	public String updateAccount(@RequestBody Account account) {
		String msg = "";

		try {

			service.updateAccount(account);
			msg = "Success";

		} catch (Exception e) {
			msg = "failure";
		}
		return msg;
	}
//	@PostMapping
//	public String insertStudents(@RequestBody List<Student> stud) {
//		String msg = "";
//		
//		try {
//			
//			service.addStudents(stud);
//			msg = "Success";
//			
//		}catch (Exception e) {
//			msg = "failure";
//		}
//		return msg;
//	}

	@GetMapping("{id}")
	public Account getAccountById(@PathVariable("id") int id) {
		return service.getAccount(id);
	}

	@GetMapping("/all")
	public List<Account> getAccounts() {
		return service.getAllAccount();
	}

	@DeleteMapping("{id}")
	public String deleteAccountById(@PathVariable("id") int id) {
		String msg = "";

		try {

			service.deleteAccount(id);
			msg = "Success";

		} catch (Exception e) {
			msg = "failure";
		}
		return msg;

	}
}
