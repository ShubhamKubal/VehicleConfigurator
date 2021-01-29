package com.freelance.training.vehicle.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.freelance.training.vehicle.models.Configuration;

public interface ConfigurationRepository extends JpaRepository<Configuration, Long> {
	
	@Query( value = "SELECT * FROM configuration c where c.var_id=?1", nativeQuery = true)
	public List<Configuration> findByVarId(Long varid);

}
