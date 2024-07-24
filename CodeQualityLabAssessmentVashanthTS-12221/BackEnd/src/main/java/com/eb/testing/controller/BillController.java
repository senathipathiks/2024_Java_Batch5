package com.eb.testing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eb.testing.model.Bill;
import com.eb.testing.service.BillServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/bill")
public class BillController {

	BillServiceImpl service;

	public BillController(BillServiceImpl service) {
		super();
		this.service = service;
	}

	String success = "Success";
	String failure = "Failure";

	@PostMapping
	public String addbill(@RequestBody Bill bill) {

		String msg = "";
		try {
			service.addbill(bill);
			msg = success;
		} catch (Exception e) {

			msg = failure;
		}
		return msg;
	}

	@GetMapping("{id}")
	public Optional<Bill> getOrderId(@PathVariable("id") int id) {

		return service.getbill(id);

	}

	@GetMapping("/all")
	public List<Bill> getbills() {

		return service.getall();

	}

	@PutMapping
	public String updateBill(@RequestBody Bill bill) {

		String msg = "";
		try {
			service.updatebill(bill);
			msg = success;
		} catch (Exception e) {

			msg = failure;
		}
		return msg;

	}

	@DeleteMapping("{id}")
	public String deleteBillbyID(@PathVariable("id") int id) {

		String msg = "";
		try {
			service.deletebill(id);
			msg = success;
		} catch (Exception e) {

			msg = failure;
		}
		return msg;
	}

}
