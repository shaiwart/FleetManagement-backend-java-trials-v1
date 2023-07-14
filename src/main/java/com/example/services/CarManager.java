package com.example.services;

import java.util.*;
import com.example.entities.Car;




public interface CarManager {
	// add a car 
	void addCar(Car car); 
	
	
	// get a car by category 
	List<Car> findByCategory(String carType); 
	
	
	// get all cars 
	List<Car> viewAll(); 
}
