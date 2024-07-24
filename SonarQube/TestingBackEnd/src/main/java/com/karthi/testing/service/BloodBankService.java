package com.karthi.testing.service;

import java.util.List;

import com.karthi.testing.model.BloodBank;

public interface BloodBankService {
	public void addOrUpdateBlood(BloodBank bloodBank);

	public List<BloodBank> getAllBlood();

	public BloodBank getBloodByGroup(String group);

	public void deleteBlood(int id);
}
