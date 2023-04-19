package com.example.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Customer;
import com.example.repository.CustomerRepository;
import com.example.services.CustomerServices;

@Service
public class CustomerServicesImp implements CustomerServices {

	@Autowired
	CustomerRepository repository;

	@Override
	public List<Customer> findAll() {
		return repository.findAll();
	}

	@Override
	public Customer findById(Long Id) {
		return repository.findById(Id).orElse(null);
	}

	@Override
	public Customer findByName(String fName, String lName) {
		return getCustomer(fName, lName);
	}

	private Customer getCustomer(String fName, String lName) {
		for (Customer customer : repository.findAll()) {
			if (customer.getFirst_name().equalsIgnoreCase(fName) && customer.getLast_name().equalsIgnoreCase(lName)) {
				return customer;
			}
		}
		return null;
	}

	@Override
	public String createCustomer(Customer customer) {
		repository.save(customer);
		return "Success";
	}

	@Override
	public String updateCustomer(Customer customer) {
		repository.save(customer);
		return "Success";
	}

	@Override
	public String deleteCustomerByName(String fName, String lName) {
		Customer customer = getCustomer(fName, lName);
		if (customer != null) {
			repository.delete(customer);
			return "Successfully Deleted";
		} else {
			return "Customer not found";
		}

	}

	@Override
	public String deleteCustomeById(Long id) {
		repository.deleteById(id);
		return "Delete By Id Successful";
	}
}
