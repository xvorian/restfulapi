package com.example.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="inventory_transactions")
public class InventoryTransactions implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="transaction_type")
	private Byte transaction_type;
	
	
	@CreationTimestamp
	private LocalDateTime transaction_created_date;

	@UpdateTimestamp
	private LocalDateTime transaction_modified_date;

	@Column(name="product_id")
	private Integer product_id;

	@Column(name="quantity")
	private Integer quantity;

	@Column(name="purchase_order_id")
	private Integer purchase_order_id;

	@Column(name="customer_order_id")
	private Integer customer_order_id;

	@Column(name="comments")
	private String comments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Byte getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(Byte transaction_type) {
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

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPurchase_order_id() {
		return purchase_order_id;
	}

	public void setPurchase_order_id(Integer purchase_order_id) {
		this.purchase_order_id = purchase_order_id;
	}

	public Integer getCustomer_order_id() {
		return customer_order_id;
	}

	public void setCustomer_order_id(Integer customer_order_id) {
		this.customer_order_id = customer_order_id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
