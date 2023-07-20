package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity 
public class Hub {
	private int hub_id; 
	private String address;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public int getHub_id() {
		return Hub_id;
	}
	public void setHub_id(int Hub_id) {
		this.Hub_id = Hub_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
