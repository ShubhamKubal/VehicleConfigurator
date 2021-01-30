package com.freelance.training.vehicle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.training.vehicle.models.Customer;
import com.freelance.training.vehicle.services.CustomerService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin( origins = "http://localhost:4200")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> list(){
		return customerService.listAll();
	}
	
	@PostMapping("/register")
	public Customer register(@RequestBody Customer customer) {
		return customerService.add(customer);
	}

}
