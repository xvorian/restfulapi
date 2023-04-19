package com.example.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="order_details")
public class OrderDetails implements Serializable{
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="order_id")
	private int order_id;

	@Column(name="product_id")
	private int product_id;

	@Column(name="quantity")
	private float quantity;

	@Column(name="unit_price")
	private float unit_price;

	@Column(name="discount")
	private double discount;

	@Column(name="status_id")
	private int status_id;

	@CreationTimestamp
	private LocalDateTime date_allocated;

	@Column(name="purchase_order_id")
	private int purchase_order_id;

	@Column(name="inventory_id")
	private int inventory_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(float unit_price) {
		this.unit_price = unit_price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public LocalDateTime getDate_allocated() {
		return date_allocated;
	}

	public void setDate_allocated(LocalDateTime date_allocated) {
		this.date_allocated = date_allocated;
	}

	public int getPurchase_order_id() {
		return purchase_order_id;
	}

	public void setPurchase_order_id(int purchase_order_id) {
		this.purchase_order_id = purchase_order_id;
	}

	public int getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}
	
}
