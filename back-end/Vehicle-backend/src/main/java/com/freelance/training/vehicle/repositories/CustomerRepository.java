package com.freelance.training.vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freelance.training.vehicle.models.Customer;

/**
 * provides implementation of CRUD operations for customer table
 * @author shubham
 * 
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
