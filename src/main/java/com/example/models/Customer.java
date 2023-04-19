package com.example.models;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="customers",uniqueConstraints = {@UniqueConstraint(name="name_unique",columnNames = "email_address")})
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="company")
	private String company;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="email_address")
	private String email_address;
	
	@Column(name="job_title")
	private String job_title;
	
	@Column(name="business_phone")
	private String business_phone;
	
	@Column(name="home_phone")
	private String home_phone;
	
	@Column(name="mobile_phone")
	private String mobile_phone;
	
	@Column(name="fax_number")
	private String fax_number;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state_province")
	private String state_province;
	
	@Column(name="zip_postal_code")
	private String zip_postal_code;
	
	@Column(name="country_region")
	private String country_region;
	
	@Column(name="web_page")
	private String web_page;
	
	@Column(name="notes")
	private String notes;

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getBusiness_phone() {
		return business_phone;
	}

	public void setBusiness_phone(String business_phone) {
		this.business_phone = business_phone;
	}

	public String getHome_phone() {
		return home_phone;
	}

	public void setHome_phone(String home_phone) {
		this.home_phone = home_phone;
	}

	public String getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public String getFax_number() {
		return fax_number;
	}

	public void setFax_number(String fax_number) {
		this.fax_number = fax_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_province() {
		return state_province;
	}

	public void setState_province(String state_province) {
		this.state_province = state_province;
	}

	public String getZip_postal_code() {
		return zip_postal_code;
	}

	public void setZip_postal_code(String zip_postal_code) {
		this.zip_postal_code = zip_postal_code;
	}

	public String getCountry_region() {
		return country_region;
	}

	public void setCountry_region(String country_region) {
		this.country_region = country_region;
	}

	public String getWeb_page() {
		return web_page;
	}

	public void setWeb_page(String web_page) {
		this.web_page = web_page;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", company=" + company + ", last_name=" + last_name + ", first_name=" + first_name
				+ ", email_address=" + email_address + ", job_title=" + job_title + ", business_phone=" + business_phone
				+ ", home_phone=" + home_phone + ", mobile_phone=" + mobile_phone + ", fax_number=" + fax_number
				+ ", address=" + address + ", city=" + city + ", state_province=" + state_province
				+ ", zip_postal_code=" + zip_postal_code + ", country_region=" + country_region + ", web_page="
				+ web_page + ", notes=" + notes + "]";
	}

	public Customer(Integer id, String company, String last_name, String first_name, String email_address, String job_title,
			String business_phone, String home_phone, String mobile_phone, String fax_number, String address,
			String city, String state_province, String zip_postal_code, String country_region, String web_page,
			String notes) {
		super();
		this.id = id;
		this.company = company;
		this.last_name = last_name;
		this.first_name = first_name;
		this.email_address = email_address;
		this.job_title = job_title;
		this.business_phone = business_phone;
		this.home_phone = home_phone;
		this.mobile_phone = mobile_phone;
		this.fax_number = fax_number;
		this.address = address;
		this.city = city;
		this.state_province = state_province;
		this.zip_postal_code = zip_postal_code;
		this.country_region = country_region;
		this.web_page = web_page;
		this.notes = notes;
	}

	public Customer() {
	}
}
