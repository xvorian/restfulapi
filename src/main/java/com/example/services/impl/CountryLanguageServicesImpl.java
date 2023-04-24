package com.example.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.CountryLanguage;
import com.example.repository.CountryLanguageRepository;
import com.example.services.CountryLanguageServices;

@Service
public class CountryLanguageServicesImpl implements CountryLanguageServices {

	@Autowired
	CountryLanguageRepository repository;

	@Override
	public List<CountryLanguage> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CountryLanguage findById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createCountry(CountryLanguage Country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCountry(CountryLanguage Country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCountry(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
