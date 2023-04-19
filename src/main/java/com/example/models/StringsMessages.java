package com.example.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="strings")
public class StringsMessages implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="string_id")
	private Integer string_id;
	
	@Column(name="string_data")
	private String string_data;

	public Integer getString_id() {
		return string_id;
	}

	public void setString_id(Integer string_id) {
		this.string_id = string_id;
	}

	public String getString_data() {
		return string_data;
	}

	public void setString_data(String string_data) {
		this.string_data = string_data;
	}
}
