package com.SpringBoot.Eg6.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Eg6.Model.Car;
import com.SpringBoot.Eg6.Repo.CarRepo;

@Service
public class CarServiceImplementation implements CarService
{
	@Autowired
	CarRepo repo;
	
	
	@Override
	public void addCar(Car car) 
	{
		repo.save(car);
	}

	@Override
	public void updateCar(Car car) 
	{
		repo.save(car);		
	}

	@Override
	public List<Car> getallCars() 
	{
		List<Car> carlist = repo.findAll();
		return carlist;
	}

	@Override
	public void deleteCar(int id) 
	{
		repo.deleteById(id);	
	}

}
