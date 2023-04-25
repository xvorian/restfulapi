package com.example.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.example.models.Film;

public interface FilmServices {
	public List<Film> findAll();
	public Optional<Film> findById(Integer Id);
	public Optional<Film> findByTitle(String title);
	public List<Film> findByReleaseYear(Integer year);
	public List<Film> findByRating(String r);
	public String createFilm(Film Film);
	public String updateFilm(Film Film);
	public String deleteFilm(Integer id);
	public Set<String> findUniqueRating();
	public List<Film> excludeRating(String rating);
}
