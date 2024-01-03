package car.engine.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int cc;
	private String fueltype;
	private int noofcylinders;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "engine")
	private Car car;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getNoofcylinders() {
		return noofcylinders;
	}
	public void setNoofcylinders(int noofcylinders) {
		this.noofcylinders = noofcylinders;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Engine [id=" + id + ", cc=" + cc + ", fueltype=" + fueltype + ", noofcylinders=" + noofcylinders
				+ "]";
	}
	
	
	

}
