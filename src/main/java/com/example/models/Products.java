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
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="products")
public class Products implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Lob
	@Column(name="supplier_ids")
	private String supplier_ids;

	@Column(name="product_code")
	private String product_code;

	@Column(name="product_name")
	private String product_name;

	@Lob
	@Column(name="description")
	private String description;

	@Column(name="standard_cost")
	private BigDecimal standard_cost;

	@Column(name="list_price")
	private BigDecimal list_price;

	@Column(name="reorder_level")
	private int reorder_level;

	@Column(name="target_level")
	private int target_level;

	@Column(name="quantity_per_unit")
	private String quantity_per_unit;

	@Column(name="discontinued")
	private Boolean discontinued;

	@Column(name="minimum_reorder_quantity")
	private int minimum_reorder_quantity;

	@Column(name="category")
	private String category;

	@Column(name="attachments")
	private Blob attachments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSupplier_ids() {
		return supplier_ids;
	}

	public void setSupplier_ids(String supplier_ids) {
		this.supplier_ids = supplier_ids;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getStandard_cost() {
		return standard_cost;
	}

	public void setStandard_cost(BigDecimal standard_cost) {
		this.standard_cost = standard_cost;
	}

	public BigDecimal getList_price() {
		return list_price;
	}

	public void setList_price(BigDecimal list_price) {
		this.list_price = list_price;
	}

	public int getReorder_level() {
		return reorder_level;
	}

	public void setReorder_level(int reorder_level) {
		this.reorder_level = reorder_level;
	}

	public int getTarget_level() {
		return target_level;
	}

	public void setTarget_level(int target_level) {
		this.target_level = target_level;
	}

	public String getQuantity_per_unit() {
		return quantity_per_unit;
	}

	public void setQuantity_per_unit(String quantity_per_unit) {
		this.quantity_per_unit = quantity_per_unit;
	}

	public Boolean getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}

	public int getMinimum_reorder_quantity() {
		return minimum_reorder_quantity;
	}

	public void setMinimum_reorder_quantity(int minimum_reorder_quantity) {
		this.minimum_reorder_quantity = minimum_reorder_quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Blob getAttachments() {
		return attachments;
	}

	public void setAttachments(Blob attachments) {
		this.attachments = attachments;
	}

	
}
