package com.freelance.training.vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freelance.training.vehicle.models.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long>{

}
