package com.example.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Country;
import com.example.repository.CountryRepository;
import com.example.services.CountryServices;

@Service
public class CountryServicesImpl implements CountryServices {

	@Autowired
	CountryRepository repository;

	@Override
	public List<Country> findAll() {
		return repository.findAll();
	}

	@Override
	public Country findById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createCountry(Country Country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCountry(Country Country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCountry(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}