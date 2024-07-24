package com.karthi.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.karthi.testing.model.BloodBank;

@Repository
public interface BloodBankRepo extends JpaRepository<BloodBank, Integer> {
	@Query(value = "select * from blood_bank where blood_group = :bloodGroup", nativeQuery = true)
	public BloodBank findBloodByGroup(String bloodGroup);
}
