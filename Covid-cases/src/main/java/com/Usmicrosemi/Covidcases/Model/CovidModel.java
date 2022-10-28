package com.Usmicrosemi.Covidcases.Model;

public class CovidModel {

	private Integer id;
	private String name;
	private String city;
	private int pincode;
	private Vaccination vac;
	
	public Vaccination getVac() {
		return vac;
	}

	public void setVac(Vaccination vac) {
		this.vac = vac;
	}

	public CovidModel() {
		
	}

	public CovidModel(Integer id, String name, String city, int pincode) {
		super();
		this.id = id;
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
		return "CovidModel [id=" + id + ", name=" + name + ", city=" + city + ", pincode=" + pincode + ", vac=" + vac
				+ "]";
	}

	
	
}
