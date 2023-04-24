package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Country;
import com.example.services.CountryServices;

@RestController
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	CountryServices services;
	
	@GetMapping
	public List<Country> findAll(){
		return services.findAll();
	}

}
