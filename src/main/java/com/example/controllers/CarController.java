package com.example.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Car;
import com.example.services.CarManager;


// use RestController instead of Controller // 
// use CORS here instead of writig it with every request handeler 
@CrossOrigin(origins = "*")
@RestController
public class CarController {
	

	// Writing autowired in important 
	@Autowired
	CarManager carMan; 
	
	
	// add a car 
	@PostMapping(value="api/car")
	public void addCar(@RequestBody Car car) {
		carMan.addCar(car); 
	}
	
	
	// get all cars 
	// @CrossOrigin(origins = "*")
	@GetMapping(value="api/cars")
	List<Car> viewAll() {
		return carMan.viewAll(); 
	}
	
	
	// get a car by category 
	// @CrossOrigin(origins = "*")
	@GetMapping(value="api/car/{category}")
	List<Car> findByCategory(@PathVariable String category) {
		return carMan.findByCategory(category); 
	}
}
