package com.example.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countrylanguage")
public class CountryLanguage {

	@Id
	@Column(name="country_code")
	private String country_code;
	
	@Column(name="Language")
	private char Language;
	
	@Column(name="is_official")
	private String is_official;
	
	@Column(name="Percentage")
	private BigDecimal Percentage;

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public char getLanguage() {
		return Language;
	}

	public void setLanguage(char language) {
		Language = language;
	}

	public String getIs_official() {
		return is_official;
	}

	public void setIs_official(String is_official) {
		this.is_official = is_official;
	}

	public BigDecimal getPercentage() {
		return Percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		Percentage = percentage;
	}


}
