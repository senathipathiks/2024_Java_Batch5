package com.SpringBoot.Eg6.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Eg6.Model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> 
{

}
