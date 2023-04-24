package com.example.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Film;
import com.example.repository.FilmRepository;
import com.example.services.FilmServices;

@Service
public class FilmServicesImpl implements FilmServices {

	@Autowired
	FilmRepository repository;
	
	@Override
	public List<Film> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Film> findById(Integer Id) {
		return repository.findById(Id);
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
		for(Film film : repository.findAll()) {
			if(film.getTitle().equalsIgnoreCase(title)) {
				return film;
			}
		}
		return null;
	}

	@Override
	public List<Film> findByReleaseYear(Integer year) {
		// TODO Auto-generated method stub
		return null;
	}

}
