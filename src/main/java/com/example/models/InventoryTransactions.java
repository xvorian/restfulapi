package com.example.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="inventory_transactions")
public class InventoryTransactions implements Serializable{
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="transaction_type")
	private String transaction_type;
	
	
	@CreationTimestamp
	private LocalDateTime transaction_created_date;

	@UpdateTimestamp
	private LocalDateTime transaction_modified_date;

	@Column(name="product_id")
	private Long product_id;

	@Column(name="quantity")
	private Long quantity;

	@Column(name="purchase_order_id")
	private Long purchase_order_id;

	@Column(name="customer_order_id")
	private Long customer_order_id;

	@Column(name="comments")
	private String comments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public LocalDateTime getTransaction_created_date() {
		return transaction_created_date;
	}

	public void setTransaction_created_date(LocalDateTime transaction_created_date) {
		this.transaction_created_date = transaction_created_date;
	}

	public LocalDateTime getTransaction_modified_date() {
		return transaction_modified_date;
	}

	public void setTransaction_modified_date(LocalDateTime transaction_modified_date) {
		this.transaction_modified_date = transaction_modified_date;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getPurchase_order_id() {
		return purchase_order_id;
	}

	public void setPurchase_order_id(Long purchase_order_id) {
		this.purchase_order_id = purchase_order_id;
	}

	public Long getCustomer_order_id() {
		return customer_order_id;
	}

	public void setCustomer_order_id(Long customer_order_id) {
		this.customer_order_id = customer_order_id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
