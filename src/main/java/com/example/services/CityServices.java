package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.models.City;

public interface CityServices {
	public List<City> findAll();
	public Optional<City> findById(Integer Id);
	public Optional<City> findByName(String name);
	public List<City> findByDistict(String name);
	public List<City> findByCountry(String name);
	public List<City> findByPopulationRange(Integer min, Integer max);
	public String createCity(City City);
	public String updateCity(City City);
	public String deleteCityd(Integer id);
}
