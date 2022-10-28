package com.Usmicrosemi.Vaccination.Model;

import javax.persistence.Column;

public class VaccinationModel {
	private Integer id;
	private String Vaccinename;
	private int age;
	private String gender;
	
	public VaccinationModel() {
		
	}

	public VaccinationModel(String vaccinename, int age, String gender) {
		super();
		this.Vaccinename = vaccinename;
		this.age = age;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVaccinename() {
		return Vaccinename;
	}

	public void setVaccinename(String vaccinename) {
		Vaccinename = vaccinename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "VaccinationModel [id=" + id + ", Vaccinename=" + Vaccinename + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
	

}
