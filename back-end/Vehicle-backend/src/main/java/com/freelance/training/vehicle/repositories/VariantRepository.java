package com.freelance.training.vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freelance.training.vehicle.models.Variant;

public interface VariantRepository extends JpaRepository<Variant, Long> {

}
