package com.example.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="purchase_order_details")
public class PurchaseOrderDetails implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="purchase_order_id")
	private int purchase_order_id;

	@Column(name="product_id")
	private int product_id;

	@Column(name="quantity")
	private BigDecimal quantity;

	@Column(name="unit_cost")
	private BigDecimal unit_cost;

	@CreationTimestamp
	private LocalDateTime date_received;

	@Column(name="posted_to_inventory")
	private Boolean posted_to_inventory;

	@Column(name="inventory_id")
	private int inventory_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPurchase_order_id() {
		return purchase_order_id;
	}

	public void setPurchase_order_id(int purchase_order_id) {
		this.purchase_order_id = purchase_order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnit_cost() {
		return unit_cost;
	}

	public void setUnit_cost(BigDecimal unit_cost) {
		this.unit_cost = unit_cost;
	}

	public LocalDateTime getDate_received() {
		return date_received;
	}

	public void setDate_received(LocalDateTime date_received) {
		this.date_received = date_received;
	}

	public Boolean getPosted_to_inventory() {
		return posted_to_inventory;
	}

	public void setPosted_to_inventory(Boolean posted_to_inventory) {
		this.posted_to_inventory = posted_to_inventory;
	}

	public int getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}


	
}
