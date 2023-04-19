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
@Table(name="purchase_orders")
public class PurchaseOrders implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="supplier_id")
	private int supplier_id;

	@Column(name="created_by")
	private int created_by;

	@CreationTimestamp
	private LocalDateTime submitted_date;

	@UpdateTimestamp
	private LocalDateTime creation_date;

	@Column(name="status_id")
	private int status_id;

	@Column(name="expected_date")
	private LocalDateTime expected_date;
	
	@Column(name="shipping_fee")
	private BigDecimal shipping_fee;

	@Column(name="taxes")
	private BigDecimal taxes;

	@Column(name="payment_date")
	private LocalDateTime payment_date;

	@Column(name="payment_amount")
	private BigDecimal payment_amount;
	
	@Column(name="payment_method")
	private String payment_method;
	
	@Lob
	@Column(name="notes")
	private String notes;
	
	@Column(name="approved_date")
	@UpdateTimestamp
	private LocalDateTime approved_date;
	
	@Column(name="submitted_by")
	private int submitted_by;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public LocalDateTime getSubmitted_date() {
		return submitted_date;
	}

	public void setSubmitted_date(LocalDateTime submitted_date) {
		this.submitted_date = submitted_date;
	}

	public LocalDateTime getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(LocalDateTime creation_date) {
		this.creation_date = creation_date;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public LocalDateTime getExpected_date() {
		return expected_date;
	}

	public void setExpected_date(LocalDateTime expected_date) {
		this.expected_date = expected_date;
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

	public LocalDateTime getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(LocalDateTime payment_date) {
		this.payment_date = payment_date;
	}

	public BigDecimal getPayment_amount() {
		return payment_amount;
	}

	public void setPayment_amount(BigDecimal payment_amount) {
		this.payment_amount = payment_amount;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public LocalDateTime getApproved_date() {
		return approved_date;
	}

	public void setApproved_date(LocalDateTime approved_date) {
		this.approved_date = approved_date;
	}

	public int getSubmitted_by() {
		return submitted_by;
	}

	public void setSubmitted_by(int submitted_by) {
		this.submitted_by = submitted_by;
	}

	
}
