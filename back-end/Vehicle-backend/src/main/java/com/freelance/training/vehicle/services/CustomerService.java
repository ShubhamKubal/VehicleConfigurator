package com.freelance.training.vehicle.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelance.training.vehicle.models.Customer;
import com.freelance.training.vehicle.repositories.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public List<Customer> listAll(){
		return customerRepo.findAll();
	}
	
	public Customer add(Customer customer) {
		return customerRepo.saveAndFlush(customer);
	}
}
