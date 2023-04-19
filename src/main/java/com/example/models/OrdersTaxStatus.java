package com.example.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="orders_tax_status")
public class OrdersTaxStatus implements Serializable{
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="tax_status_name")
	private String tax_status_name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTax_status_name() {
		return tax_status_name;
	}

	public void setTax_status_name(String tax_status_name) {
		this.tax_status_name = tax_status_name;
	}
}
