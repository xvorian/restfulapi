package com.example.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "sales_reports")
public class SalesReports implements Serializable {

	@Id
	@Column(name = "group_by")
	private String group_by;

	@Column(name = "display")
	private String display;

	@Column(name = "title")
	private String title;

	@Lob
	@Column(name = "filter_row_source")
	private String filter_row_source;

	@Column(name = "default")
	private Boolean isDefault;

	public String getGroup_by() {
		return group_by;
	}

	public void setGroup_by(String group_by) {
		this.group_by = group_by;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFilter_row_source() {
		return filter_row_source;
	}

	public void setFilter_row_source(String filter_row_source) {
		this.filter_row_source = filter_row_source;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}



}
