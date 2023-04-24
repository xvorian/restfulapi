package com.example.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/sports")
public class Greetings {
	
	private static Map<Integer, String> sportsHM = new HashMap<>();

	
	@GetMapping
	public String getAll() throws Exception{
		return new ObjectMapper().writeValueAsString(sportsHM);
	}
	
	@GetMapping("/{id}")
	public String getById(@PathVariable(value="id") Integer id) {
		return sportsHM.get(id);
	}
	
	public String getByName(@RequestParam(value="name") String name) {
		return "Hello World";
	}
	
	
	static {
		sportsHM.put(1, "sportsHM");
		sportsHM.put(2, "Hockey");
		sportsHM.put(3, "Basketball");
	}
}
