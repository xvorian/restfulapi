package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Customer;
import com.example.services.CustomerServices;

@RestController
@RequestMapping("/customer")
public class CustomersController {
	
	@Autowired
	CustomerServices services;
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		return services.findAll();
	}
	
	@GetMapping("{customerId}")
	public Customer getCustomerById(@PathVariable Long customerId) {
		return services.findById(customerId);
	}
	
	@PostMapping
	public String createCustomer(@RequestBody Customer customer){
		return services.createCustomer(customer);
	}
	
	@PutMapping
	public String updateCustomer(@RequestBody Customer customer) {
		return services.updateCustomer(customer);
	}
	
	@DeleteMapping("{customerId}")
	public String deleteCustomer(Long Id) {
		services.deleteCustomeById(Id);
		return "deleted";
	}

}
