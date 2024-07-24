package com.karthi.testing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthi.testing.model.BloodBank;
import com.karthi.testing.serviceimpli.BloodBankServiceImpli;

@RestController
@RequestMapping("/bloodBank")
@CrossOrigin("http://localhost:3000")
public class BloodBankController {
	BloodBankServiceImpli bankServiceImpli;

	public BloodBankController(BloodBankServiceImpli bankServiceImpli) {
		this.bankServiceImpli = bankServiceImpli;
	}

	@PostMapping
	public void insertBlood(@RequestBody BloodBank bloodBank) {
		bankServiceImpli.addOrUpdateBlood(bloodBank);
	}

	@PutMapping
	public void updateBlood(@RequestBody BloodBank bloodBank) {
		bankServiceImpli.addOrUpdateBlood(bloodBank);
	}

	@GetMapping("/all")
	public List<BloodBank> getBloods() {
		return bankServiceImpli.getAllBlood();
	}

	@DeleteMapping("{id}")
	public void deleteBloodData(@PathVariable("id") int id) {
		bankServiceImpli.deleteBlood(id);
	}

	@GetMapping("{group}")
	public BloodBank getBloodByGroup(@PathVariable("group") String group) {
		return bankServiceImpli.getBloodByGroup(group);
	}
}
