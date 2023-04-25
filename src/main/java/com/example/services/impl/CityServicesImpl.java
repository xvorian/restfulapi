package com.example.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.City;
import com.example.repository.CityRepository;
import com.example.services.CityServices;

@Service
public class CityServicesImpl implements CityServices {

	@Autowired
	CityRepository repo;

	@Override
	public List<City> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<City> findById(Integer Id) {
		return repo.findById(Id);
	}

	@Override
	public Optional<City> findByName(String name) {
		return repo.findAll().stream().filter(c -> c.getName().equalsIgnoreCase(name)).findFirst();
	}

	@Override
	public List<City> findByDistict(String name) {
		return repo.findAll().stream().filter(c -> c.getDistrict().equalsIgnoreCase(name)).collect(Collectors.toList());
	}

	@Override
	public List<City> findByCountry(String name) {
		return repo.findAll().stream().filter(c -> c.getCountry_code().equalsIgnoreCase(name))
				.collect(Collectors.toList());
	}

	@Override
	public List<City> findByPopulationRange(Integer min, Integer max) {
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
