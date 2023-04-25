package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Film;
import com.example.services.FilmServices;

@RestController
@RequestMapping("/film")
public class FilmController {
	
	@Autowired
	FilmServices services;
	
	@GetMapping
	public List<Film> findAll(){
		return services.findAll();
	}
	
//	@GetMapping("/{id}")
//	public Film getById(@PathVariable(value="id") Integer Id) {
//		return services.findById(Id);
//	}
	
	@GetMapping("/title")
	public Film getByTitle(@RequestParam(value="title") String title) {
		services.findByTitle(title);
		return new Film();
	}
	
	@GetMapping("/rating/{r}")
	public List<Film> findByReleaseYear(@PathVariable(value="r") String r){
		return services.findByRating(r);
	}
	
	@PostMapping
	public String createFilm(@RequestBody Film film) {
		services.createFilm(film);
		return "success";
	}
	
	
}
