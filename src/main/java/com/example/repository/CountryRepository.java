package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}
