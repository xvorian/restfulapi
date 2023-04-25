package com.example.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Film;
import com.example.repository.FilmRepository;
import com.example.services.FilmServices;

@Service
public class FilmServicesImpl implements FilmServices {

	@Autowired
	FilmRepository repo;

	@Override
	public List<Film> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Film> findById(Integer Id) {
		return repo.findById(Id);
	}

	@Override
	public String createFilm(Film Film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFilm(Film Film) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteFilm(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film findByTitle(String title) {
//		return repository.findAll().stream().filter(f -> f.getTitle().equalsIgnoreCase(title)).map(f ->)
		for (Film film : repo.findAll()) {
			if (film.getTitle().equalsIgnoreCase(title)) {
				return film;
			}
		}
		return null;
	}

	@Override
	public List<Film> findByReleaseYear(Integer year) {
		return repo.findAll().stream().filter(f -> year == f.getRelease_year()).collect(Collectors.toList());
	}

	@Override
	public List<Film> findByRating(String r) {
		return repo.findAll().stream().filter(f -> r.equals(f.getRating())).collect(Collectors.toList());
	}

	@Override
	public Set<String> findUniqueRating() {
		return repo.findAll().stream().map(film -> film.getRating()).collect(Collectors.toSet());
	}

	@Override
	public List<Film> excludeRating(String rating) {
//		return repo.findAll().stream().filter(new Predicate<Film>() {
//			public boolean test(Film film) {
//				return !film.getRating().equalsIgnoreCase(rating);
//			}
//		}).collect(Collectors.toList());

		return repo.findAll().stream().filter(film -> !film.getRating().equalsIgnoreCase(rating))
				.collect(Collectors.toList());

	}

}
