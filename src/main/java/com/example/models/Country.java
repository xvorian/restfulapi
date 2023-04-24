package com.example.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="country")
public class Country {

	@Id
	@Column(name="code", columnDefinition = "char")
	private String code;
	
	@Column(name="name")
	private String name;
	
	@Column(name="continent")
	private String continent;
	
	@Column(name="region")
	private String region;
	
	@Column(name="surface_area")
	private BigDecimal surface_area;

	@Column(name="indep_year")
	private Integer indep_year;
	
	@Column(name="population")
	private Integer population;
	
	@Column(name="life_expectancy")
	private BigDecimal life_expectancy;
	
	
	@Column(name="gnp")
	private BigDecimal gnp;


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContinent() {
		return continent;
	}


	public void setContinent(String continent) {
		this.continent = continent;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public BigDecimal getSurface_area() {
		return surface_area;
	}


	public void setSurface_area(BigDecimal surface_area) {
		this.surface_area = surface_area;
	}


	public Integer getIndep_year() {
		return indep_year;
	}


	public void setIndep_year(Integer indep_year) {
		this.indep_year = indep_year;
	}


	public Integer getPopulation() {
		return population;
	}


	public void setPopulation(Integer population) {
		this.population = population;
	}


	public BigDecimal getLife_expectancy() {
		return life_expectancy;
	}


	public void setLife_expectancy(BigDecimal life_expectancy) {
		this.life_expectancy = life_expectancy;
	}


	public BigDecimal getGnp() {
		return gnp;
	}


	public void setGnp(BigDecimal gnp) {
		this.gnp = gnp;
	}

	
}
