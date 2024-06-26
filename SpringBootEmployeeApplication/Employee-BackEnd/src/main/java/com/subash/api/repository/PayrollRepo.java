package com.subash.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subash.api.model.Payroll;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Integer> {

	 //Optional<Payroll> findByHreAndTaAndBpAndPf(int hre, int ta, int bp, int pf);
}
