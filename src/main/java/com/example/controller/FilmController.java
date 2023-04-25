package com.example.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Film> findAll() {
		return services.findAll();
	}

	@GetMapping("/{id}")
	public Film getById(@PathVariable(value = "id") Integer Id) {
		return services.findById(Id).get();
	}

	@GetMapping("?title={id}")
	public Film getByTitle(@RequestParam(value = "id") String title) {
		services.findByTitle(title);
		return new Film();
	}

	@GetMapping("/rating/{r}")
	public List<Film> findByReleaseYear(@PathVariable(value = "r") String r) {
		return services.findByRating(r);
	}

	@GetMapping("/rating")
	public Set<String> getUniqueRating() {
		return services.findUniqueRating();
	}

	@GetMapping("rating/excluded/{r}")
	public List<Film> excludeRating(@PathVariable(value = "r") String rating) {
		return services.excludeRating(rating);
	}

	@PostMapping
	public String createFilm(@RequestBody Film film) {
		services.createFilm(film);
		return "success";
	}

}
