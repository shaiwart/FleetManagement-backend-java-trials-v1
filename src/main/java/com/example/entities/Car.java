package com.example.entities;

import jakarta.persistence.*;


@Entity
public class Car {
	private int c_id; 
	private String name; 
	private String brand; 
	private String category; 
	private String image; 
	private double price; 
	private String hubId;
	private int availability; 
	
	// c_id, name, brand, category, image, price, hubId, availability
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getHubId() {
		return hubId;
	}
	public void setHubId(String hubId) {
		this.hubId = hubId;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Car [c_id=" + c_id + ", name=" + name + ", brand=" + brand + ", category=" + category + ", image="
				+ image + ", price=" + price + ", hubId=" + hubId + ", availability=" + availability + "]";
	} 
	
	
}
