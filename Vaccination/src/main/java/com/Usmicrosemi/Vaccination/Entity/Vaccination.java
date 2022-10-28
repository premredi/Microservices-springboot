package com.Usmicrosemi.Vaccination.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vaccination {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="vaccinename")
	private String Vaccinename;
	private int age;
	private String gender;
	
	public Vaccination() {
		
	}

	public Vaccination(String vaccinename, int age, String gender) {
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
		return "Vaccination [id=" + id + ", Vaccinename=" + Vaccinename + ", age=" + age + ", gender=" + gender + "]";
	}
	

}
