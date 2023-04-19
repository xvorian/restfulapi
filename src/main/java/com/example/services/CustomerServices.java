package com.example.services;

import java.util.List;

import com.example.models.Customer;

public interface CustomerServices {

	public List<Customer> findAll();
	public Customer findById(Long Id);
	public Customer findByName(String fName, String lName);
	public String createCustomer(Customer customer);
	public String updateCustomer(Customer customer);
	public String deleteCustomerByName(String fName, String lName);
	public String deleteCustomeById(Long id);
	
}
