package com.company.employee.manager.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double salary;
	@ManyToOne(cascade = CascadeType.ALL)
	private Manager manager;
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}







	public void setId(int id) {
		this.id = id;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public double getSalary() {
		return salary;
	}







	public void setSalary(double salary) {
		this.salary = salary;
	}







	public Manager getManager() {
		return manager;
	}







	public void setManager(Manager manager) {
		this.manager = manager;
	}







	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", manager=" + manager + "]";
	}
	
	
	
	
	

}
