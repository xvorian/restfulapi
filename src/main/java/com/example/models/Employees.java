package com.example.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
public class Employees {
	private int id;
	private String company;		
	private String last_name;		
	private String first_name;		
	private String email_address;			
	private String job_title;			
	private String business_phone;			
	private String home_phone;			
	private String mobile_phone;			
	private String fax_number;			
	private String address;			
	private String city;		
	private String state_province;		
	private String zip_postal_code;		
	private String country_region;			
	private String web_page;			
	private String notes;			
	private String attachments;			
}
