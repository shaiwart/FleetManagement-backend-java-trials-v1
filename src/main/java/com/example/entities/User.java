package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity 
public class User {
	private int u_id; 
	private String name; 
	private String number; 
	private String email;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", name=" + name + ", number=" + number + ", email=" + email + "]";
	} 
	
}
