package com.SpringBoot.Eg7.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Eg7.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

}
