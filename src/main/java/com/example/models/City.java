package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {

	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="country_code")
	private String country_code;
	
	@Column(name="District")
	private String District;
	
	@Column(name="Population")
	private Integer Population;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}



	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public Integer getPopulation() {
		return Population;
	}

	public void setPopulation(Integer population) {
		Population = population;
	}
	
	
}
