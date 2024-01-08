package com.springbootpractice.crudoperationusingjsp.entity;

import jakarta.persistence.Entity;

@Entity
public class Laptop {
 @jakarta.persistence.Id
	private int Id;
	private String name;
	private String brand;
	private String price;
	public Laptop() {
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [Id=" + Id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
}
