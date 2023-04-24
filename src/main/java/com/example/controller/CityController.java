package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.City;
import com.example.services.CityServices;

@RestController
@RequestMapping("/city")
public class CityController {
	
	@Autowired
	CityServices services;
	
	@GetMapping
	public List<City> findAll(){
		return services.findAll();
	}
	
}
