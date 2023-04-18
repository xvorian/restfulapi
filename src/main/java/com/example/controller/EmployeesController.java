package com.example.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
public class EmployeesController {
	
	
//	@GetMapping(value="/employees", method = RequestMethod.GET)
	public String getEmployees(){
		return ("Returning Employee");
	}
	

}
