package com.freelance.training.vehicle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.training.vehicle.models.Customer;
import com.freelance.training.vehicle.services.CustomerService;

/**
 * This class is responsible for the CRUD operations on customers table in the database.
 * @author shubham
 * 
 */
@RestController
@RequestMapping("/api/v1")
@CrossOrigin( origins = "http://localhost:4200")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	/**
	 * returns customers from customer table
	 * @return List<Customer>
	 */
	@GetMapping("/customers")
	public List<Customer> list(){
		return customerService.listAll();
	}
	
	/**
	 * persists the customer into database and returns that customer
	 * @param customer
	 * @return Customer
	 */
	@PostMapping("/register")
	public Customer register(@RequestBody Customer customer) {
		return customerService.add(customer);
	}
	
	@GetMapping("/check/{loginid}/{password}")
	public String checkCredentials(@PathVariable String loginid,@PathVariable String password) {
		return customerService.checkLoginCredentials(loginid, password);
	}

}
