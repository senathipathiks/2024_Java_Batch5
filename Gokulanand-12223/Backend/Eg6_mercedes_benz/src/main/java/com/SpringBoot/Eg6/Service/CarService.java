package com.SpringBoot.Eg6.Service;
import java.util.List;

import com.SpringBoot.Eg6.Model.Car;

public interface CarService 
{
	public void addCar (Car car);
	public void updateCar(Car car);
	public List<Car> getallCars();
	public void deleteCar(int id);
}
