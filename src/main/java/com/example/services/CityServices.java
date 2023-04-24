package com.example.services;

import java.util.List;

import com.example.models.City;

public interface CityServices {
	public List<City> findAll();
	public City findById(Integer Id);
	public String createCity(City City);
	public String updateCity(City City);
	public String deleteCityd(Integer id);
}
