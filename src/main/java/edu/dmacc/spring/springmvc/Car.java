package edu.dmacc.spring.springmvc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String make;
	private String model;
	private String yearMade;
	private int miles;
	
	public int getId() {
		return id;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getYearMade() {
		return yearMade;
	}
	
	public void setYearMade(String year) {
		this.yearMade = year;
	}
	
	public int getMiles() {
		return miles;
	}
	
	public void setMiles(int miles) {
		this.miles = miles;
	}
}
