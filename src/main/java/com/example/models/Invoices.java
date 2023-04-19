package com.example.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="invoices")
public class Invoices implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="order_id")
	private int order_id;
	
	@CreationTimestamp
	private LocalDateTime invoice_date;

	@Column(name="due_date")
	private LocalDateTime due_date;

	@Column(name="tax")
	private BigDecimal tax;

	@Column(name="shipping")
	private BigDecimal shipping;

	@Column(name="amount_due")
	private BigDecimal amount_due;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public LocalDateTime getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(LocalDateTime invoice_date) {
		this.invoice_date = invoice_date;
	}

	public LocalDateTime getDue_date() {
		return due_date;
	}

	public void setDue_date(LocalDateTime due_date) {
		this.due_date = due_date;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getShipping() {
		return shipping;
	}

	public void setShipping(BigDecimal shipping) {
		this.shipping = shipping;
	}

	public BigDecimal getAmount_due() {
		return amount_due;
	}

	public void setAmount_due(BigDecimal amount_due) {
		this.amount_due = amount_due;
	}
}
