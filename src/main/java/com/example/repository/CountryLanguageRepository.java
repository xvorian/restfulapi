package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.CountryLanguage;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, String> {

}
