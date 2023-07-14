package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.example.entities.Car; 
import org.springframework.stereotype.Repository; 



@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
	
	public List<Car> findByCategory(String carType); 
}
