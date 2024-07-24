package com.karthi.testing.serviceimpli;

import java.util.List;

import org.springframework.stereotype.Service;

import com.karthi.testing.model.BloodBank;
import com.karthi.testing.repository.BloodBankRepo;
import com.karthi.testing.service.BloodBankService;

@Service
public class BloodBankServiceImpli implements BloodBankService {

	BloodBankRepo bankRepo;

	public BloodBankServiceImpli(BloodBankRepo bankRepo) {
		this.bankRepo = bankRepo;
	}

	@Override
	public void addOrUpdateBlood(BloodBank bloodBank) {
		bankRepo.save(bloodBank);
	}

	@Override
	public void deleteBlood(int id) {
		bankRepo.deleteById(id);
	}

	@Override
	public List<BloodBank> getAllBlood() {
		return bankRepo.findAll();
	}

	@Override
	public BloodBank getBloodByGroup(String group) {
		return bankRepo.findBloodByGroup(group);
	}

}
