package com.eb.testing.service;

import java.util.List;
import java.util.Optional;

import com.eb.testing.model.Bill;

public interface BillService {

	public void addbill(Bill bill);

	public Optional<Bill> getbill(int id);

	public List<Bill> getall();

	public void updatebill(Bill bill);

	public void deletebill(int id);
}
