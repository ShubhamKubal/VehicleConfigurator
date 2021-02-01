package com.freelance.training.vehicle.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelance.training.vehicle.models.Customer;
import com.freelance.training.vehicle.repositories.CustomerRepository;

/**
 * communicates with DAO layer to perform CRUD operations on customer table
 * @author shubham
 *
 */
@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	/**
	 * returns customers from customer table
	 * @return List<Customer>
	 */
	public List<Customer> listAll(){
		return customerRepo.findAll();
	}
	
	/**
	 * persists the customer into database and returns that customer instance
	 * @param customer
	 * @return Customer
	 */
	public Customer add(Customer customer) {
		return customerRepo.saveAndFlush(customer);
	}
}