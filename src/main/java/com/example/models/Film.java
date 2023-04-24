package com.example.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="film")
public class Film {

	@Id
	@Column(name="film_id")
	private Integer film_id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="release_year")
	private Integer release_year;

	@Column(name="language_id")
	private Integer language_id;

	@Column(name="original_language_id")
	private Integer original_language_id;

	@Column(name="rental_duration")
	private Integer rental_duration;
	
	@Column(name="rental_rate")
	private BigDecimal rental_rate;
	
	@Column(name="length")
	private Integer length;
	
	@Column(name="replacement_cost")
	private BigDecimal replacement_cost;
	
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="special_features")
	private String special_features;
	
	@UpdateTimestamp
	@Column(name="last_update")
	private LocalDateTime last_update;

	public Integer getFilm_id() {
		return film_id;
	}

	public void setFilm_id(Integer film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRelease_year() {
		return release_year;
	}

	public void setRelease_year(Integer release_year) {
		this.release_year = release_year;
	}

	public Integer getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(Integer language_id) {
		this.language_id = language_id;
	}

	public Integer getOriginal_language_id() {
		return original_language_id;
	}

	public void setOriginal_language_id(Integer original_language_id) {
		this.original_language_id = original_language_id;
	}

	public Integer getRental_duration() {
		return rental_duration;
	}

	public void setRental_duration(Integer rental_duration) {
		this.rental_duration = rental_duration;
	}

	public BigDecimal getRental_rate() {
		return rental_rate;
	}

	public void setRental_rate(BigDecimal rental_rate) {
		this.rental_rate = rental_rate;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public BigDecimal getReplacement_cost() {
		return replacement_cost;
	}

	public void setReplacement_cost(BigDecimal replacement_cost) {
		this.replacement_cost = replacement_cost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecial_features() {
		return special_features;
	}

	public void setSpecial_features(String special_features) {
		this.special_features = special_features;
	}

	public LocalDateTime getLast_update() {
		return last_update;
	}

	public void setLast_update(LocalDateTime last_update) {
		this.last_update = last_update;
	}
}
