package com.freelance.training.vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freelance.training.vehicle.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
