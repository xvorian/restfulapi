package com.example.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="orders")
public class Orders implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="employee_id")
	private int employee_id;

	@Column(name="customer_id")
	private int customer_id;

	@CreationTimestamp
	private LocalDateTime order_date;

	@UpdateTimestamp
	private LocalDateTime shipped_date;

	@Column(name="shipper_id")
	private int shipper_id;

	@Column(name="ship_name")
	private String ship_name;

	@Lob
	@Column(name="ship_address")
	private String ship_address;

	@Column(name="ship_city")
	private String ship_city;

	@Column(name="ship_state_province")
	private String ship_state_province;
	
	@Column(name="ship_zip_postal_code")
	private String ship_zip_postal_code;
	
	@Column(name="ship_country_region")
	private String ship_country_region;
	
	@Column(name="shipping_fee")
	private BigDecimal shipping_fee;
	
	@Column(name="taxes")
	private BigDecimal taxes;
	
	@Column(name="payment_type")
	private String payment_type;
	
	@CreationTimestamp
	private LocalDateTime paid_date;
	
	@Lob
	@Column(name="notes")
	private String notes;
	
	@Column(name="tax_rate")
	private double tax_rate;
	
	@Column(name="tax_status_id")
	private Byte tax_status_id;
	
	@Column(name="status_id")
	private Byte status_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public LocalDateTime getOrder_date() {
		return order_date;
	}

	public void setOrder_date(LocalDateTime order_date) {
		this.order_date = order_date;
	}

	public LocalDateTime getShipped_date() {
		return shipped_date;
	}

	public void setShipped_date(LocalDateTime shipped_date) {
		this.shipped_date = shipped_date;
	}

	public int getShipper_id() {
		return shipper_id;
	}

	public void setShipper_id(int shipper_id) {
		this.shipper_id = shipper_id;
	}

	public String getShip_name() {
		return ship_name;
	}

	public void setShip_name(String ship_name) {
		this.ship_name = ship_name;
	}

	public String getShip_address() {
		return ship_address;
	}

	public void setShip_address(String ship_address) {
		this.ship_address = ship_address;
	}

	public String getShip_city() {
		return ship_city;
	}

	public void setShip_city(String ship_city) {
		this.ship_city = ship_city;
	}

	public String getShip_state_province() {
		return ship_state_province;
	}

	public void setShip_state_province(String ship_state_province) {
		this.ship_state_province = ship_state_province;
	}

	public String getShip_zip_postal_code() {
		return ship_zip_postal_code;
	}

	public void setShip_zip_postal_code(String ship_zip_postal_code) {
		this.ship_zip_postal_code = ship_zip_postal_code;
	}

	public String getShip_country_region() {
		return ship_country_region;
	}

	public void setShip_country_region(String ship_country_region) {
		this.ship_country_region = ship_country_region;
	}

	public BigDecimal getShipping_fee() {
		return shipping_fee;
	}

	public void setShipping_fee(BigDecimal shipping_fee) {
		this.shipping_fee = shipping_fee;
	}

	public BigDecimal getTaxes() {
		return taxes;
	}

	public void setTaxes(BigDecimal taxes) {
		this.taxes = taxes;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public LocalDateTime getPaid_date() {
		return paid_date;
	}

	public void setPaid_date(LocalDateTime paid_date) {
		this.paid_date = paid_date;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public double getTax_rate() {
		return tax_rate;
	}

	public void setTax_rate(double tax_rate) {
		this.tax_rate = tax_rate;
	}

	public Byte getTax_status_id() {
		return tax_status_id;
	}

	public void setTax_status_id(Byte tax_status_id) {
		this.tax_status_id = tax_status_id;
	}

	public Byte getStatus_id() {
		return status_id;
	}

	public void setStatus_id(Byte status_id) {
		this.status_id = status_id;
	}
	
}
