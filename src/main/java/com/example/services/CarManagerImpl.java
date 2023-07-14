package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Car;
import com.example.repositories.CarRepository;

@Service
public class CarManagerImpl implements CarManager {
	
	@Autowired
	CarRepository carRepo; 

	@Override
	public void addCar(Car car) {
		carRepo.save(car); 
	}

	@Override
	public List<Car> findByCategory(String carType) {
		return carRepo.findByCategory(carType); 
	}

	@Override
	public List<Car> viewAll() {
		return carRepo.findAll();
	}
	
}
