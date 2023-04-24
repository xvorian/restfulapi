package com.example.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.City;
import com.example.repository.CityRepository;
import com.example.services.CityServices;

@Service
public class CityServicesImpl implements CityServices {

	@Autowired
	CityRepository repository;
	
	@Override
	public List<City> findAll() {
		return repository.findAll();
	}

	@Override
	public City findById(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createCity(City City) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCity(City City) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCityd(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
