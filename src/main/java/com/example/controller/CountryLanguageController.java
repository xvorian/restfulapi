package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.CountryLanguage;
import com.example.services.CountryLanguageServices;

@RestController
@RequestMapping("/language")
public class CountryLanguageController {
	
	@Autowired
	CountryLanguageServices services;
	
	@GetMapping
	public List<CountryLanguage> findAll(){
		return services.findAll();
	}
	
}
