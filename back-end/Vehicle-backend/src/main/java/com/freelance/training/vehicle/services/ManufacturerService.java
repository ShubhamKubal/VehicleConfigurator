package com.freelance.training.vehicle.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelance.training.vehicle.models.Manufacturer;
import com.freelance.training.vehicle.repositories.ManufacturerRepository;

@Service
@Transactional
public class ManufacturerService {
	
	@Autowired
	private ManufacturerRepository manRepo;
	
	public List<Manufacturer> listAll(){
		return manRepo.findAll();
	}

}
