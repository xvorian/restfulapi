package com.example.services;

import java.util.List;

import com.example.models.Country;

public interface CountryServices {
	public List<Country> findAll();
	public Country findById(String Id);
	public String createCountry(Country Country);
	public String updateCountry(Country Country);
	public String deleteCountry(String id);
//	public List<Country> countriesNamesInContinent(String continent);
	
}
