package com.freelance.training.vehicle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freelance.training.vehicle.models.Segment;

public interface SegmentRepository extends JpaRepository<Segment, Long> {

}
