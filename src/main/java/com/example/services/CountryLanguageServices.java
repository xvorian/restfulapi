package com.example.services;

import java.util.List;

import com.example.models.CountryLanguage;

public interface CountryLanguageServices {
	public List<CountryLanguage> findAll();
	public CountryLanguage findById(String Id);
	public String createCountry(CountryLanguage Country);
	public String updateCountry(CountryLanguage Country);
	public String deleteCountry(String id);
}
