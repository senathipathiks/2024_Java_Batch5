package com.SpringBoot.Eg7.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Eg7.Model.Salary;

@Repository
public interface SalaryRepo extends JpaRepository<Salary, Integer>
{

}
