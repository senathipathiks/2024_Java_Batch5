package com.eb.testing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eb.testing.model.Bill;
import com.eb.testing.repository.BillRepo;

@Service
public class BillServiceImpl implements BillService {
	BillRepo repo;

	public BillServiceImpl(BillRepo repo) {
		super();
		this.repo = repo;
	}

	public void addbill(Bill bill) {

		repo.save(bill);
	}

	public Optional<Bill> getbill(int id) {

		return repo.findById(id);
	}

	public List<Bill> getall() {

		return repo.findAll();
	}

	public void updatebill(Bill bill) {

		repo.save(bill);
	}

	public void deletebill(int id) {
		repo.deleteById(id);

	}

}
