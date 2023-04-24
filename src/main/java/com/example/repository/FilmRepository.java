package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

}
