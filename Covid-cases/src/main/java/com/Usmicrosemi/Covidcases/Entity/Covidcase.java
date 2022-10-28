package com.Usmicrosemi.Covidcases.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Covidcase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="patientName")
	private String name;
	
	@Column(name="place")
	private String city;
	
	@Column(name="zipCode")
	private int pincode;
	
	public Covidcase() {
		
	}

	public Covidcase(String name, String city, int pincode) {
		super();
		this.name = name;
		this.city = city;
		this.pincode = pincode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Covidcase [id=" + id + ", name=" + name + ", city=" + city + ", pincode=" + pincode + "]";
	}
	

}
