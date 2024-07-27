package com.SpringBoot.Eg6.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Eg6.Model.Car;
import com.SpringBoot.Eg6.Service.CarServiceImplementation;


@RestController
@RequestMapping("/benz")
@CrossOrigin("*")
public class CarController 
{
	@Autowired
	CarServiceImplementation service;
	
	@PostMapping
	public  String insertCar(@RequestBody Car car)
	{
		String msg = "";
		try {
			service.addCar(car);
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@PutMapping
	public  String updateStudent(@RequestBody Car car)
	{
		String msg = "";
		try {
			service.updateCar(car);;
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
	
	@GetMapping("/all")
	public List<Car> readAllStudent()
	{
		return service.getallCars();
	}
	
	@DeleteMapping("{id}")
	public String deleteCar(@PathVariable("id") int id)
	{
		String msg = "";
		try {
			service.deleteCar(id);;
			msg = "Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;	
	}
}
