package com.freelance.training.vehicle.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.freelance.training.vehicle.models.Variant;

public interface VariantRepository extends JpaRepository<Variant, Long> {
	
	@Query( value = "SELECT * FROM variant v WHERE v.seg_id=?1 and v.man_id=?2", nativeQuery = true)
	public List<Variant> findBySedidAndManid(Long i,Long j);

}
