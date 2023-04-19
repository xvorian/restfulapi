package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Employees;

@RestController
public class EmployeesController {

	@GetMapping(value = "/employees")
	public Employees getEmployees() {
		return new Employees();
	}

}
